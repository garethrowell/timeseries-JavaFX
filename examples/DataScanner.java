
import java.io.*;
import java.util.Scanner;

public class DataScanner {
	
	Scanner scanner = null;
	String infile = new String();
	int row, col;

	DataScanner(String sourcefile) throws FileNotFoundException {
		
		infile = sourcefile;
		
		try{
			scanner = new Scanner(new BufferedReader(new FileReader(infile)));
		}
		catch(FileNotFoundException ex){
			System.out.println(ex);
		}
      }
    
	public String[][] load(int maxrow, int maxcol){
		
		String mydata[][] = new String[maxrow][maxcol];
		
		for(row = 0; row < maxrow; row++){
			String line = scanner.nextLine();
			String parts[] = line.split(",");
			for(col = 0; col < maxcol; col++){
				mydata[row][col] = parts[col];
			}
		}	
		
		return(mydata);
	}
}
	
		
	
