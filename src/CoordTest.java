



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



public class CoordTest extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
		
	
		//------------------------------------------------------------------------------
		// display the coordinate system
		// XYAxes is an object that loads lines into a group
		int offsetX = 50;
		int offsetY = 25;
		
		Group group = new Group();
		XYAxes myXYAxes = new XYAxes();			
		myXYAxes.addFeatures(group, offsetX, offsetY);
		
		
		
		
		
		
		
		
		
		
		
		Scene scene = new Scene(group, 1850 + offsetX, 600, Color.BLACK);    
		stage.setTitle("Cuva Well Data: XYAxes test");
		stage.setScene(scene);
		stage.show(); 

	}
	
    
	public static void main(String[] args){
       launch(args);
	}
}