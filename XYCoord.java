/*
*/




import java.io.*;
import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 



public class XYCoord extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
		
	
		//------------------------------------------------------------------------------
		// display the coordinate system

		int offsetX = 50;
		int offsetY = 25;
   
		//Creating Y axis
		Line yAxis = new Line(offsetX, offsetY, offsetX, offsetY + 500);
		yAxis.setStrokeWidth(3.0); 
		yAxis.setStroke(Color.WHITE);
	  
		Line xAxis = new Line(offsetX, offsetY + 250, offsetX + 1825, offsetY + 250);
		xAxis.setStrokeWidth(3.0); 
		xAxis.setStroke(Color.WHITE);
	  
		Group group = new Group(); 
		group.getChildren().add(xAxis);
		group.getChildren().add(yAxis);
	  
		//make five hash marks on X axis (at -200, -100, 0, 100, 200)
		int xhashno = 5;  
		Line line = null;
		for(int i = 0; i < xhashno; ++i){
			line = new Line(offsetX, (offsetY + 450 - (i*100)), offsetX + 20, (offsetY + 450 - (i*100)));
			line.setStrokeWidth(2.0);
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);    
		}
	  
		//make five major hash marks on Y axis (at 365, 730, 1095, 1460, 1825)
		int yhashno = 6; 
		for(int i = 0; i < yhashno; ++i){
			line = new Line(offsetX + (365*i), offsetY + 250, offsetX + (i*365), offsetY + 230);
			line.setStrokeWidth(2.0); 
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);  
		}
	  
		//make five minor hash marks on Y axis (at 365, 730, 1095, 1460, 1825)
		yhashno = 6; 
		for(int i = 0; i < yhashno; ++i){
			line = new Line(offsetX + ((365*i) - 182), offsetY + 250, offsetX + (i*365)-182, offsetY + 240);
			line.setStrokeWidth(1.0); 
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);  
		}
	 
	
		Scene scene = new Scene(group, 1850 + offsetX, 600, Color.BLACK);  
      
		stage.setTitle("Cuva Well Data: Fitzwater");
      
		//Adding scene to the stage 
		stage.setScene(scene);
      
		//Displaying the contents of the stage 
		stage.show(); 

	}
	
    
	public static void main(String[] args){
       launch(args);
	}
}