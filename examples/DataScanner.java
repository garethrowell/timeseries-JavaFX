

import java.io.*;
import java.util.Scanner;




public class DataScanner {
	
	Scanner scanner = null;
	String infile = new String();
	int row, col;


	DataScanner(String sourcefile)throws FileNotFoundException {
	    //ex. infile = "C:\\Users\\Growell\\src\\JavaFX\\CUVA_corr_depths_int.csv";
		infile = sourcefile;
		try{
			scanner = new Scanner(new BufferedReader(new FileReader(infile)));
			System.out.println("Trying scanner");
		}
		catch(FileNotFoundException ex){
			System.out.println(ex);
		}
    }
    
	public String[][] load(int maxrow, int maxcol){
		// ex. maxrow = 2635; maxcol = 9;
		System.out.println("Inside load");
		String mydata[][] = new String[maxrow][maxcol];
		for(row = 0; row < maxrow; row++){
			String line = scanner.nextLine();
			String parts[] = line.split(",");
			for(col = 0; col < maxcol; col++){
				mydata[row][col] = parts[col];
				//System.out.println(mydata[row][col] + " ");
			}
		}
		System.out.println("Returning array");		
		return(mydata);
	}
}
	
		
	