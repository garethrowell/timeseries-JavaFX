



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



public class WellPath  {
	

	// need a local group
	
	Group group = null;
	Path path = null;
	
	WellPath(String color){
		
		mycolor = color;
		try{
			scanner = new Scanner(new BufferedReader(new FileReader(infile)));
			System.out.println("Trying scanner");
		}
		catch(FileNotFoundException ex){
			System.out.println(ex);
		}
    }
	
	
}
		
		
