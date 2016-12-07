# vigil-mobile-app
# Version 0.1
# Developers: Akshay Hariani, Naman Shah, Chintan Parikh, Arjun Garg, Allen Chen

Vigil is an android application designed to help people in Atlanta travel safely throughout the city. Using crime data pulled from police databases, danger zones are identified on a map based on crime severity levels and times of day. Users can also map routes to destinations avoiding dangerous areas.

Release Notes:
New Features for this release:
-Danger Zones mapped out
-Danger Zones update daily
-Push Notification when user enters Danger Zone
-Ability for user to turn notifications off

Bug Fixes since last release:
-N/A as this is the first release

Known Bugs/Defects:
-No bugs
-Navigation feature was deemed to be unfeasible 


Install Guide:
-Prerequesites: Users must have a mobile device running Android 4.0+ to run the application, and have a desktop computer with Android Studio installed to load this repository, and a USB cable connecting the Anrdoid device to the desktop machine in order to build and run the application. Finally, users should allow USB debugging on their Android device, under Developer Settings (if "Developer Options" cannot be found under Settings, users should tap "Build Number" under "Settings> About> Software Information> More" seven times for it to be unlocked).
-Dependent Libraries: No additional third-party libraries are necessary to run the Vigil application. Java 8 is required to be downloaded on the desktop machine to install the app onto the phone.
-Download Instructions: Users should clone this repository from Github onto their desktop computer.
-Build Instructions: This repository contains the raw source code, rather than an executable file (if users would like to copy over the executable APK file instead, then they will have to have enabled "Allow installation of apps from unknown sources" under "Unknown Sources" in Security Settings. Users should understand that this could potentially expose their device to external security threats, so the developers recommend using the raw source code instead). In order to build the application, users should click on the "Run" button (a green triangle) in Android Studio after connecting their devices to their desktop computers via USB cable.
-Installation Instructions: After clicking the "Run" button, Android Studio will begin building the application. Users should then grant permission on their device to trust the desktop machine and install the application onto their Android device. This permission only needs to be granted once. Subsequent building and installing requires only clicking on the "Run" button.
-Run Instructions: After the application has been installed to the device, it will automatically open and begin running on the device -- The user might have to wait a few seconds for this to occur. After the initial installation, the app will have been added to the Android system's app drawer. Opening the application from this drawer will run Vigil.
-Troubleshooting: 
