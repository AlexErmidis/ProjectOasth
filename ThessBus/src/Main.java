import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		Parent root=null;
		if(true) 
			 root= FXMLLoader.load(getClass().getResource("Card.fxml"));
		else
			 root= FXMLLoader.load(getClass().getResource("Card 2.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ThessBus: Card");
		primaryStage.show();
		
		System.out.println("Hello");
	
	}
}
