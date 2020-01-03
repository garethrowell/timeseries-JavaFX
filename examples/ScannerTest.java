

import java.io.*;


public class ScannerTest {

   public static void main(String args[]) {
	   
	   int maxrow = 2635;
	   int maxcol = 9;
	   String[][] welldata = new String[maxrow][maxcol];
	   
	   String infile = new String();
	   infile = "C:\\Users\\Growell\\src\\CUVA_corr_depths_int.csv";
    try{
	   DataScanner datascanner = new DataScanner(infile);
           welldata = datascanner.load(maxrow, maxcol);	

		for(int row = 2633; row < 2635; row++){
			for(int col = 0; col < maxcol; col++){
				System.out.println(welldata[row][col] + " ");
			}
		}	   
	}	  
	catch (FileNotFoundException ex){
			System.out.println(ex);
    } 
   }
}
