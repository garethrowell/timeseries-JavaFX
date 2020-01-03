

import java.io.*;


public class ScannerTest {

   public static void main(String args[]) {
	   
	   int maxrow = 2635;
	   int maxcol = 9;
	   String welldata[][] = new String[maxrow][maxcol];
	   
	   String infile = new String();
	   infile = "C:\\Users\\Growell\\src\\JavaFX\\data\\CUVA_corr_depths_int.csv";

	   DataScanner datascanner = new DataScanner(infile);
       welldata = datascanner.load(maxrow, maxcol);
	  
	 
   }
}