package com.unical.nerdfy.controller;

import com.unical.nerdfy.business.Autenticazione;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;

    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;

    @FXML
    private Label warningPw;
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void loginButtonOnAction(ActionEvent e) {
        Autenticazione auth= new Autenticazione("Sara", "Dramis");
        if(auth.autentica(usernameTextField.getText(),passwordTextField.getText())){
            System.out.println(usernameTextField.getText());
            System.out.println(passwordTextField.getText());
            warningPw.setVisible(true);
            warningPw.setTextFill(Paint.valueOf("#00ff00"));
            warningPw.setText("Login Riuscito!");

        }
        else{
            //Alert alert= new Alert(Alert.AlertType.ERROR);
            //alert.setTitle("LOGIN FALLITO!");
            //alert.setContentText("Reinserisci password o username");
            //alert.show();
            warningPw.setVisible(true);
            warningPw.setTextFill(Paint.valueOf("#ff0000"));
            warningPw.setText("Login Fallito!");
            usernameTextField.setText("");
            passwordTextField.setText("");
        }


    }
}