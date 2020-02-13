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



public class WellPlot{
	

	int col, offsetX, offsetY, maxrow, maxcol;
	String[][] welldata = null;

	 
	WellPlot(int wellno, int wellmaxrow, int wellmaxcol, String[][] inputdata){	
		col = wellno;
		maxrow = wellmaxrow;
		maxcol = wellmaxcol;
		welldata =  new String[maxrow][maxcol];
		welldata = inputdata;
		maxrow = maxrow - 1;
		//System.out.println("Inside WellPlot contructor");		
    }	
	
	public void addPaths(Group group, int offsetX, int offsetY){ 
		//System.out.println("Inside addPaths method");	
		
		int row = 1;
		Path path = new Path();	
        Integer jdate = null;
		Integer flag = null;
        Integer depth = null;	
		LineTo lineTo = null;
		MoveTo moveTo = null;
			
		
		 // start new path
		//System.out.println("Start new path");
		//System.out.println("welldata[row][0] is " + welldata[row][0]);
		
		jdate = (Integer.parseInt(welldata[row][0] + offsetX))/2;
		//System.out.println("jdate: " + jdate );
		
		depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
		flag = (Integer.parseInt(welldata[row][col]));	
		
		//System.out.println("jdate, depth, flag: " + jdate + depth + flag);
		
		
		//System.out.println("Before row while of addPaths method");
		
		while( row < maxrow ){

			if(flag != -9999){
				
				//System.out.println("Inside if flag of addPaths method");
				jdate = (Integer.parseInt(welldata[row][0] + offsetX))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));
				moveTo = new MoveTo(jdate, depth);
				path.getElements().add(moveTo);
				group.getChildren().add(path);
				row++;
			
				jdate = (Integer.parseInt(welldata[row][0] + offsetX))/2;
				depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
				flag = (Integer.parseInt(welldata[row][col]));		
				while((flag != -9999) && (row < maxrow)){
			        //System.out.println("Inside path while... row, jdate, depth: " + row + " " + 
						//jdate + " " + depth);
					lineTo = new LineTo(jdate, depth);				
					path.getElements().add(lineTo); 
					group.getChildren().add(path);
				
					row++;
			
					jdate = (Integer.parseInt(welldata[row][0] + offsetX))/2;
					depth = -1*(Integer.parseInt(welldata[row][col]))+(offsetY + 250);
					flag = (Integer.parseInt(welldata[row][col]));
					System.out.println("Bottom of path while");

				}
				System.out.println("End of path");
					

				System.out.println("Very end of path");				
			}
		

			while((flag == -9999)&& (row < maxrow)){ // and test for row < maxrow

				flag = (Integer.parseInt(welldata[row][col]));	
				row++;
				System.out.println("Bottom of flag while");
				
			}
			
		}
		path.setStroke(Color.RED);
		path.setStrokeWidth(1);	
		System.out.println("Bottom of addPaths method");
				
	}
}


