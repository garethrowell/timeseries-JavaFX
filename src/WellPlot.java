



import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;

import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo; 




public class XYAxes{
	
	 
	XYAxes(){	

		System.out.println("Trying XYAxes");
		
    }	
	
	public void addFeatures(Group group, int offsetX, int offsetY){

        // specify lines and text for X and Y axes
		
		Line yAxis = new Line(offsetX, offsetY, offsetX, offsetY + 500);
		yAxis.setStrokeWidth(3.0); 
		yAxis.setStroke(Color.WHITE);
	  
		Line xAxis = new Line(offsetX, offsetY + 250, offsetX + 1825, offsetY + 250);
		xAxis.setStrokeWidth(3.0); 
		xAxis.setStroke(Color.WHITE);

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
	
	}
}