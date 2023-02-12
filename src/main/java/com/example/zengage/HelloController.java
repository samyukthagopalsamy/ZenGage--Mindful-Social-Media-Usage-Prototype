package com.example.zengage;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

public class HelloController {
    @FXML
    private CheckBox appLimitToggle;

    @FXML
    private ComboBox<String> socialMediaAppDropdown;

    @FXML
    private ComboBox<String> addLimitDropdown;

    @FXML
    private ComboBox<String> preferencesDropdown;

    @FXML
    protected void initialize() {
        socialMediaAppDropdown.getItems().addAll("Facebook", "Twitter", "Instagram", "Snapchat");
        addLimitDropdown.getItems().addAll("30 minutes", "1 hour", "2 hours", "3 hours");
        preferencesDropdown.getItems().addAll("Dark Mode", "Light Mode", "Custom");
    }
}
