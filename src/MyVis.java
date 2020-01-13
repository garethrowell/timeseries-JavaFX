



import java.io.*;
import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 



public class MyVis extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
		
	
		//------------------------------------------------------------------------------
		// display the coordinate system

		int offsetX = 50;
		int offsetY = 25;
   
	  
		Group group = new Group(); 
		Scene scene = new Scene(group, 1850 + offsetX, 600, Color.BLACK);  
      
		stage.setTitle("Cuva Well Data");
      
		//Adding scene to the stage 
		stage.setScene(scene);
      
		//Displaying the contents of the stage 
		stage.show(); 

	}
	
    
	public static void main(String[] args){
       launch(args);
	}
}