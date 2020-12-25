package com.interfaces;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principale extends Application  {

	public static void main(String[] args) {
		lunch();
	}
	



		public void start(Stage primaryStage) {
			try {				
	     AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("simple.fxml"));
	    Scene scene = new Scene(root,900,470);
	   // scene.getStylesheets().add(getClass().getResource(" ").toExternalForm());
	    primaryStage.setScene(scene);
	    primaryStage.show();
	} catch(Exception e) {
	    e.printStackTrace();
	}
	}
	
   

};
