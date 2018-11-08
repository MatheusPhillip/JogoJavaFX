/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Phillip
 */
public class RegistrarController implements Initializable {

    @FXML
    private TextField UsernameRegister;
    @FXML
    private TextField EmailRegister;
    @FXML
    private TextField NicknameRegister;
    @FXML
    private TextField ConfirmNicknameRegister;
    @FXML
    private PasswordField Password;
    @FXML
    private PasswordField ConfirmPasswordRegister;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CancelOption(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/loginteste/Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    
}
