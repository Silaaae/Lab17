# Lab 17 — Maîtriser les BroadcastReceiver en Android

Ce projet illustre l'utilisation des **BroadcastReceiver** en Android : détection du mode avion, envoi d'un broadcast personnalisé, et réception au démarrage du téléphone.

---

## Fonctionnalités

- **Mode avion** : surveillance dynamique activée/désactivée via un bouton
- **Broadcast personnalisé** : envoi et réception d'un message interne
- **Boot receiver** : se déclenche au démarrage du système

---

## Structure

- `MainActivity` — interface, gestion du receiver dynamique
- `AirplaneModeReceiver` — détecte les changements du mode avion
- `CustomEventReceiver` — reçoit les broadcasts internes
- `BootReceiver` — se déclenche au démarrage

---

## Aperçu

> Les captures ci-dessous montrent l'interface et les toasts déclenchés par les receivers.
