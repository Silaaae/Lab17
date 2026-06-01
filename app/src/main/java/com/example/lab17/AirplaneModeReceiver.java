package com.example.lab17;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            boolean actif = intent.getBooleanExtra("state", false);
            String msg = actif ? "✈️ Mode avion activé." : "📶 Mode avion désactivé.";
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        }
    }
}
