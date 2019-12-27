

import java.io.*;
import java.util.Scanner;

class CreateDataArray  {

	// load the data
		
	Scanner scanner = null;
	String infile = new String();
	infile = "C:\\Users\\Growell\\src\\JavaFX\\CUVA_corr_depths_int.csv";
	scanner = new Scanner(new BufferedReader(new FileReader(infile)));	
	int row, col, maxrow, maxcol;
	maxrow = 2635;
	maxcol = 9;
	String welldata[][] = new String[maxrow][maxcol];
		
	for(row = 0; row < maxrow; row++){
		String line = scanner.nextLine();
		String parts[] = line.split(",");
		for(col = 0; col < maxcol; col++){
			welldata[row][col] = parts[col];
		}			
	}
  
  
