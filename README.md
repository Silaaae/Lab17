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
<img width="373" height="736" alt="image" src="https://github.com/user-attachments/assets/bf403402-9b42-4189-bca3-302e340b2d70" />
<img width="205" height="402" alt="image" src="https://github.com/user-attachments/assets/796c02bd-5d76-4f70-b05d-23ad39e56d5c" />
