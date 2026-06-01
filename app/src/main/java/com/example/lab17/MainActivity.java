package com.example.lab17;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AirplaneModeReceiver airplaneReceiver;
    private boolean receiverActif = false;
    private Button btnSurveillance, btnMessage;
    private TextView tvStatut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        airplaneReceiver = new AirplaneModeReceiver();
        tvStatut         = findViewById(R.id.tvStatus);
        btnSurveillance  = findViewById(R.id.btnToggleAirplane);
        btnMessage       = findViewById(R.id.btnSendCustom);

        tvStatut.setText("Appuyez sur le bouton pour lancer la surveillance.");

        btnSurveillance.setOnClickListener(v -> basculerSurveillance());
        btnMessage.setOnClickListener(v -> envoyerBroadcast());
    }

    private void basculerSurveillance() {
        if (!receiverActif) {
            registerReceiver(airplaneReceiver, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
            receiverActif = true;
            tvStatut.setText("✅ Surveillance du mode avion active...");
            btnSurveillance.setText("Arrêter la surveillance");
        } else {
            unregisterReceiver(airplaneReceiver);
            receiverActif = false;
            tvStatut.setText("⏹ Surveillance arrêtée.");
            btnSurveillance.setText("Relancer la surveillance");
        }
    }

    private void envoyerBroadcast() {
        Intent intent = new Intent("com.example.lab17.CUSTOM_EVENT");
        intent.putExtra("message", "Broadcast personnalisé depuis Lab17 !");
        sendBroadcast(intent);
        Toast.makeText(this, "Broadcast envoyé !", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        if (receiverActif) unregisterReceiver(airplaneReceiver);
        super.onDestroy();
    }
}
