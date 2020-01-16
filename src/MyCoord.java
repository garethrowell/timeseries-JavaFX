




import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 



public class MyCoord  {
	
	// this coordinate system has an X and a Y line
	// thats all for now
	
	Line[] MyXY = null;
	MyXY[0] = new Line(offsetX, offsetY, offsetX, offsetY + 500);
	MyXY[1] = new Line(offsetX, offsetY + 250, offsetX + 1825, offsetY + 250); 
	   
	MyCoord(){
		
		// what do we want to pass in, if anything
		// what do we want to return....
		
	}

	public Line[] create(){
		// ex. maxrow = 2635; maxcol = 9;
		System.out.println("Inside create");
		String mydata[][] = new String[maxrow][maxcol];

		System.out.println("Returning array");		
		return(mydata);
	}
}
