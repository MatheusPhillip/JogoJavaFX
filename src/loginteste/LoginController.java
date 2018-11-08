/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginteste;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Phillip
 */
public class LoginController implements Initializable {
    
    private String mensagem;
    /*
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
*/
    @FXML
    private PasswordField Password;
    @FXML
    private TextField Username;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleRegistesAction(ActionEvent event) {
        
        
        
        mensagem = "Usuario Cadastrado";
        System.out.println(mensagem);
        System.out.println(Username.getText());
        System.out.println(Password.getText());
    }

    @FXML
    private void handleCloseAction(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void OpenSignUpScene(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Registrar/Registrar.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Stage stage = new Stage();
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
    }
}
