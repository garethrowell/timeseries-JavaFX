



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
		// get data
		
		int maxrow = 2636;
		int maxcol = 10;
		int row = 1;
		int col = 1;
		boolean echo = true;
		
		//String welldata[][] = new String[maxrow][maxcol];
		String[][] welldata = new String[maxrow][maxcol];
	   
		String infile = new String();
		infile = "C:\\Users\\Growell\\src\\\\ts\\CUVA_well_depth_averages.csv";
	   
		try{
			DataScanner datascanner = new DataScanner(infile);
			welldata = datascanner.load(maxrow, maxcol, echo);  
		}	  
		catch (FileNotFoundException ex){
			System.out.println(ex);
		} 
		
		//------------------------------------------------------------------------------
		// do something with the data	
		// here we are using the Path object to show continuous runs
		// plot col 0 (time) against col 8 (site: Fitzwater)
		
		
		Path path = new Path();
		Path avepath = new Path();
		path.setStroke(Color.RED);
		path.setStrokeWidth(1);
		avepath.setStroke(Color.BLUE);
		avepath.setStrokeWidth(2);	
		
		

        Integer jdate = null;
		Integer flag = null;
        Integer depth = null;	
		LineTo lineTo = null;
		MoveTo moveTo = null;
		
		
		
		row = 1;
		col = 1; //Well
		
		System.out.println("Where: top " + row + " " + col);
		
		while( col < 8 ){
			//System.out.println("Where: Inside col while " + row + " " + col);
			 // start new path
			
			jdate = (Integer.parseInt(welldata[row][0]))/2;
			depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
			flag = (Integer.parseInt(welldata[row][col]));	
			
			
			//System.out.println("Where: Just before path while " + row + " " + col);
			
			while( row < maxrow){
				
				//start new path
				//System.out.println("Where: Inside row while - 1 " + row + " " + col);
				jdate = (Integer.parseInt(welldata[row][0]))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));
				moveTo = new MoveTo(jdate, depth);	
				path.getElements().add(moveTo); 
				//System.out.println("Where: Inside row while - 2 " + row + " " + col);
			
				row++;
			
				jdate = (Integer.parseInt(welldata[row][0]))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));		
				while((flag != -9999) && (row < maxrow)){
				
					//System.out.println("Where: Inside path while - 3 " + row + " " + col);
					//System.out.println("Where: Inside path while - 3  " + jdate+ " " + depth);
					lineTo = new LineTo(jdate, depth);				
					path.getElements().add(lineTo); 
					row++;
				
					jdate = (Integer.parseInt(welldata[row][0]))/2;
					depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
					flag = (Integer.parseInt(welldata[row][col]));
					//System.out.println("Where: Inside path while - 4 " + row + " " + col);
				}
				
			
			
				while((flag == -9999)&& (row < maxrow)){ // and test for row < maxrow
					//System.out.println("Where: Inside -9999 while - 5 " + row + " " + col);
					flag = (Integer.parseInt(welldata[row][col]));
					row++;
				
				}
				//System.out.println("Where: Bottom of row while - 6 " + row + " " + col);
			
			}
			//System.out.println("Where: Bottom of col while - 7 " + row + " " + col);
			col++;
			row = 1;
		}
		
		
		// just do the average
		
		row = 1;
		col = 9;
		
		//System.out.println("Where: Inside col while " + row + " " + col);
		// start new path
			
		jdate = (Integer.parseInt(welldata[row][0]))/2;
		depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
		flag = (Integer.parseInt(welldata[row][col]));	
			
		
		//System.out.println("Where: Just before path while " + row + " " + col);
			
		while( row < maxrow){
			
			//start new path
			//System.out.println("Where: Inside row while - 1 " + row + " " + col);
			jdate = (Integer.parseInt(welldata[row][0]))/2;
			depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
			flag = (Integer.parseInt(welldata[row][col]));
			moveTo = new MoveTo(jdate, depth);	
			path.getElements().add(moveTo); 
			//System.out.println("Where: Inside row while - 2 " + row + " " + col);
			
				row++;
			
				jdate = (Integer.parseInt(welldata[row][0]))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));		
			while((flag != -9999) && (row < maxrow)){
				
				//System.out.println("Where: Inside path while - 3 " + row + " " + col);
				//System.out.println("Where: Inside path while - 3  " + jdate+ " " + depth);
				lineTo = new LineTo(jdate, depth);				
				avepath.getElements().add(lineTo); 
				row++;
				
				jdate = (Integer.parseInt(welldata[row][0]))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));
				//System.out.println("Where: Inside path while - 4 " + row + " " + col);
			}
				
			
			
			while((flag == -9999)&& (row < maxrow)){ // and test for row < maxrow
				//System.out.println("Where: Inside -9999 while - 5 " + row + " " + col);
				flag = (Integer.parseInt(welldata[row][col]));
				row++;
				
			}
			
			System.out.println("Where: Bottom of row while - " + row + " " + col);
			
		}
		//
		
		// well label
		col = 1;
		text = new Text();
		text.setText("Individual wells");
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
		
		group.getChildren().add(path);
		group.getChildren().add(avepath);
		
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

