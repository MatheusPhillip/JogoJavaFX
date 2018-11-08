/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginteste;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Phillip
 */
public class LoginTeste extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        //stage.initStyle(StageStyle.UNDECORATED);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        //Screen screen = Screen.getPrimary();
        //Rectangle2D bound = screen.getVisualBounds();
        //stage.setX(bound.getMinX());
        //stage.setY(bound.getMinY());
        //stage.setWidth(bound.getWidth());
        //stage.setHeight(bound.getHeight());
        //stage.setMaximized(true);
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
