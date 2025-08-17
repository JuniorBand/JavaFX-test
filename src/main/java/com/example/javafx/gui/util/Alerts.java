package com.example.javafx.gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {

    public static void showError(String title, String header, String content) {
        // Implementation for showing an error alert
        System.err.println("Error: " + title + "\n" + header + "\n" + content);
    }

    public static void showInfo(String title, String header, String content) {
        // Implementation for showing an info alert
        System.out.println("Info: " + title + "\n" + header + "\n" + content);
    }

    public static void showWarning(String title, String header, String content) {
        // Implementation for showing a warning alert
        System.out.println("Warning: " + title + "\n" + header + "\n" + content);
    }

    public static void showConfirmation(String title, String header, String content) {
        // Implementation for showing a confirmation alert
        System.out.println("Confirmation: " + title + "\n" + header + "\n" + content);
    }

    public static void showCustomAlert(String title, String header, String content, AlertType type) {
        // Implementation for showing a custom alert
        System.out.println("Custom Alert: " + title + "\n" + header + "\n" + content);
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();

    }


}