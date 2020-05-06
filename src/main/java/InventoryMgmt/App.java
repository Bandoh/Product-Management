/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InventoryMgmt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application{


	@Override
	public void start(Stage stage) throws Exception {

        String fxmlFile = "/screens/mainWindow.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
	}
    public static void main(String[] args) {
        launch(args);
    }

}