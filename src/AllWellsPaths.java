



import java.io.*;
import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;

import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;



public class AllWellsPaths extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
		
	
		//------------------------------------------------------------------------------
		// display the coordinate system

		int offsetX = 50;
		int offsetY = 25;
   
		Group group = new Group();
		XYAxes myXYAxes = new XYAxes();			
		myXYAxes.addFeatures(group, offsetX, offsetY);
	 
		//------------------------------------------------------------------------------
		// load data
		
		int maxrow = 2636;
		int maxcol = 10;
		int row = 1;
		int col = 1;
		boolean echo = false;
		
		String[][] welldata = new String[maxrow][maxcol];
	   
		String infile = new String();
		infile = "C:\\Users\\Growell\\Documents\\src\\ts\\CUVA_well_depth_averages_corr.csv";
	   
		try{
			DataScanner datascanner = new DataScanner(infile);
			welldata = datascanner.load(maxrow, maxcol, echo);  
		}	  
		catch (FileNotFoundException ex){
			System.out.println(ex);
		} 
		
		//------------------------------------------------------------------------------
		// do something with the data	


		col = 1;
		
		System.out.println("Invoking WellPlot constructor");
		WellPlot wellplot = new WellPlot(col, maxrow, maxcol, welldata);
		System.out.println("Invoking WellPlot addPaths method");		
		wellplot.addPaths(group, offsetX, offsetY);
		System.out.println("Continueing in AllWellsPaths");	
		

		Text text = new Text();
		text.setText("Individual well " + welldata[0][col]);
		text.setX(1460);
		text.setY(480);
		text.setStrokeWidth(1);
		text.setStroke(Color.RED);
		text.setFont(Font.font("helvetica", 30));
		text.setFill(Color.RED);
		group.getChildren().add(text);
		
		Text avetext = new Text();
		avetext.setText("Average");
		avetext.setX(1460);
		avetext.setY(530);
		avetext.setStrokeWidth(1);
		avetext.setStroke(Color.BLUE);
		avetext.setFont(Font.font("helvetica", 30));
		avetext.setFill(Color.BLUE);
		group.getChildren().add(avetext);
		
		Scene scene = new Scene(group, 1850 + offsetX, 600, Color.BLACK);  
      
		stage.setTitle("Cuva Well Data: " + welldata[0][col]);
      
		//Adding scene to the stage 
		stage.setScene(scene);
      
		//Displaying the contents of the stage 
		stage.show(); 

	}
	
    
	public static void main(String[] args){
       launch(args);
	}
}

