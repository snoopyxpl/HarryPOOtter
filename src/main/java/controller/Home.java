package main.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Home {

  @FXML
  private Label welcomtext;

  @FXML
  protected void onHelloButtonClick() {
    welcomtext.setText("Welcome to JavaFX Application!");
  }
}
