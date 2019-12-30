

import java.io.*;
public class ScannerTest {

   public static void main(String args[]) {
	   
	   maxrow = 2635;
	   maxcol = 9;
	   String welldata[maxrow][maxcol] = new String;
	   
	   String infile = new String;
	   infile = "C:\\Users\\Growell\\src\\JavaFX\\CUVA_corr_depths_int.csv";

	   DataScanner datascanner = new DataScanner(infile);
       welldata = datascanner.load(maxrow, maxcol);
	  
	 
   }
}