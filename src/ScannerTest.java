

import java.io.*;


public class ScannerTest {

   public static void main(String args[]) {
	   
	   int maxrow = 2635;
	   int maxcol = 9;
	   boolean echo = true;
	   
	   
	   //String welldata[][] = new String[maxrow][maxcol];
	   String[][] welldata = new String[maxrow][maxcol];
	   
	   String infile = new String();
	   infile = "C:\\Users\\Growell\\src\\ts\\CUVA_corr_depths_int.csv";
    try{
	   DataScanner datascanner = new DataScanner(infile);
       welldata = datascanner.load(maxrow, maxcol, echo);
	   //System.out.println(welldata);	  

		System.out.println("ScannerTest");
				
		for(row = 0; row < maxrow; row++){
			System.out.println(row + " " + welldata[row][0] + " " + welldata[row][1] +
				" " +  welldata[row][2] + " " +  welldata[row][3] + 	
				" " +  welldata[row][4] + " " +  welldata[row][5] + 
				" " +  welldata[row][6] + " " +  welldata[row][7] +
				" " +  welldata[row][8] + " " +  welldata[row][9]);
			}	   
	}	  
	catch (FileNotFoundException ex){
			System.out.println(ex);
    } 
   }
}