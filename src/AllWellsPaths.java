



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
	  
		//make five hash marks on y axis (at -200, -100, 0, 100, 200)
		int yhashno = 5;  
		Line line = null;
		Text text = null;
		for(int i = 0; i < yhashno; ++i){
			line = new Line(offsetX, (offsetY + 450 - (i*100)), offsetX + 20, (offsetY + 450 - (i*100)));
			line.setStrokeWidth(2.0);
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);    
			
			text = new Text();
			if(i != 2){
				text.setText(String.valueOf(offsetY - 225 + (i*100)));
				text.setX(offsetX + 30);
				text.setY(offsetY + 455 - (i*100));
				text.setStrokeWidth(1);
				text.setStroke(Color.WHITE);
				group.getChildren().add(text);
			}
			
		}
	  
		//make ten major hash marks on X axis (at 365, 730, 1095, 1460, 1825)
		int xhashno = 6; 
		for(int i = 0; i < xhashno; ++i){
			line = new Line(offsetX + (365*i), offsetY + 250, offsetX + (i*365), offsetY + 230);
			line.setStrokeWidth(2.0); 
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);  
			
			if(i > 0){
				text = new Text();
				text.setText(String.valueOf(2010 + 2*i));
				text.setX(offsetX + (365*i - 12));
				text.setY(offsetY + 220);
				text.setStrokeWidth(1);
				text.setStroke(Color.WHITE);
				group.getChildren().add(text);
			}
			
		}
	  
		//make five minor hash marks on X axis (at 365, 730, 1095, 1460, 1825)
		yhashno = 6; 
		for(int i = 0; i < yhashno; ++i){
			line = new Line(offsetX + ((365*i) - 182), offsetY + 250, offsetX + (i*365)-182, offsetY + 240);
			line.setStrokeWidth(1.0); 
			line.setStroke(Color.WHITE);
			group.getChildren().add(line);  
		}
	 
	 
		//------------------------------------------------------------------------------
		// get data
		
		int maxrow = 2636;
		int maxcol = 9;
		
		//String welldata[][] = new String[maxrow][maxcol];
		String[][] welldata = new String[maxrow][maxcol];
	   
		String infile = new String();
		infile = "C:\\Users\\Growell\\src\\\\ts\\CUVA_corr_depths_int.csv";
	   
		try{
			DataScanner datascanner = new DataScanner(infile);
			welldata = datascanner.load(maxrow, maxcol);  

			for(int row = 0; row < maxrow; row++){
				System.out.println(row + " " + welldata[row][0] + " " + welldata[row][1] +
				    " " +  welldata[row][2] + " " +  welldata[row][3] + 	
					" " +  welldata[row][4] + " " +  welldata[row][5] + 
					" " +  welldata[row][6] + " " +  welldata[row][7] +
					" " +  welldata[row][8]);
			}	  
		}	  
		catch (FileNotFoundException ex){
			System.out.println(ex);
		} 
		
		//------------------------------------------------------------------------------
		// do something with the data	
		// here we are using the Path object to show continuous runs
		// plot col 0 (time) against col 8 (site: Fitzwater)
		
		
		Path path = new Path();
		path.setStroke(Color.RED);
		path.setStrokeWidth(2);

		int row, col;
        Integer jdate = null;
		Integer flag = null;
        Integer depth = null;	
		LineTo lineTo = null;
		MoveTo moveTo = null;
		
		
		
		row = 1;
		col = 8; //Well
		
		//System.out.println("Where: top " + row + " " + maxrow);
		
		 // start new path
		jdate = (Integer.parseInt(welldata[row][0]))/2;
		depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
		flag = (Integer.parseInt(welldata[row][col]));
		moveTo = new MoveTo(jdate, depth);	
		path.getElements().add(moveTo); 
		
		
		row = 2;
		
		jdate = (Integer.parseInt(welldata[row][0]))/2;
		depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
		flag = (Integer.parseInt(welldata[row][col]));	
		
		
		//System.out.println("Where: just before path " + row + " " + maxrow);
		
		while( row < maxrow){
			
			//start new path
			
			jdate = (Integer.parseInt(welldata[row][0]))/2;
			depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
			flag = (Integer.parseInt(welldata[row][col]));
			moveTo = new MoveTo(jdate, depth);	
			path.getElements().add(moveTo); 
		
		
			row++;
		
			jdate = (Integer.parseInt(welldata[row][0]))/2;
			depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
			flag = (Integer.parseInt(welldata[row][col]));		
			while((flag != -9999) && (row < maxrow)){
			
				//System.out.println("Where: inside path - top " + row + " " + maxrow);
				//System.out.println("flag is " + flag);
				lineTo = new LineTo(jdate, depth);
                //System.out.println("depth is " + depth);				
				path.getElements().add(lineTo); 
				row++;
			
				jdate = (Integer.parseInt(welldata[row][0]))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));
				//System.out.println("Where: inside path - botton " + row + " " + maxrow);
				//System.out.println("flag is " + flag);
			}
			//System.out.println("Where: after path " + row + " " + maxrow);
		
		
			while((flag == -9999)&& (row < maxrow)){ // and test for row < maxrow
			
				flag = (Integer.parseInt(welldata[row][col]));
				row++;
			
			}
        
		}
		
		// well label
		
		text = new Text();
		text.setText(welldata[0][col]);
		text.setX(1460);
		text.setY(480);
		text.setStrokeWidth(1);
		text.setStroke(Color.RED);
		text.setFont(Font.font("helvetica", 40));
		text.setFill(Color.RED);
		group.getChildren().add(text);
		
		group.getChildren().add(path);
		
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