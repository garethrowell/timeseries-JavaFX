

import java.io.*;
import java.util.Scanner;




public class DataScanner {
	
	Scanner scanner = null;
	String infile = new String();
	int row, col;


	DataScanner(String sourcefile)throws FileNotFoundException {
		
		infile = sourcefile;
		try{
			scanner = new Scanner(new BufferedReader(new FileReader(infile)));
			System.out.println("Trying scanner");
		}
		catch(FileNotFoundException ex){
			System.out.println(ex);
		}
    }
    
	public String[][] load(int maxrow, int maxcol, boolean echo){
		
		String mydata[][] = new String[maxrow][maxcol];
		
		for(row = 0; row < maxrow; row++){
			
			String line = scanner.nextLine();
			String parts[] = line.split(",");
			
			for(col = 0; col < maxcol; col++){
				mydata[row][col] = parts[col];
			}
			
			for(row = 0; row < maxrow; row++){
			System.out.println(row + " " + mydata[row][0] + " " + mydata[row][1] +
				" " +  mydata[row][2] + " " +  mydata[row][3] + 	
				" " +  mydata[row][4] + " " +  mydata[row][5] + 
				" " +  mydata[row][6] + " " +  mydata[row][7] +
				" " +  mydata[row][8] + " " +  mydata[row][9]);
			}	
		}
		
		return(mydata);
	}
}
	
		
	