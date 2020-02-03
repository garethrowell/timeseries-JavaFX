# timeseries_visualization
---------------------------------------
# Location
Cuyahoga Valley National Park
https://www.nps.gov/im/htln/parks.htm
https://www.nps.gov/cuva/learn/nature/wetlands.htm

# Data source
  Sonia Bingham, Wetlands Biologist, 
  Heartland I&M Network, Cuyahoga Valley National Park, Ohio; 
  Water level depth using Ecotone Water Level Data Logger;
  Eight well sites from November 2010 to June 2018;
  
# Data processing issues
  Actual data is double; convert to integers for graphics;
  Missing data;
  Single vs. multiple observations per day;
  Each spreadsheet is one well site for one year;
  Combine all eight wells into one table: 2010 - 2018;
  Use Julian dates where 1/1/2010 is day 1;

# Working examples:

# DataScanner.java 
  Data Scanner is a wrapper for java.util.Scanner. It takes a file name as an argument 
  and loads its contents into a 2 dimensional array.
  
# ScannerTest.java
  ScannerTest shows how to use the Data Scanner
  
# SimpleLineGroup.java 
  This was my first attempt to load data and display it on an XY plot. Data were managed as individual lines
  and loaded individually into a Group object.
  
# SingleWellPaths.java
  This was the second attempt to display data. The Path object is used to manage each uninteruppted 
  set of logger data. Four paths from one well are hard-coded into the program.
  
  
  
---------------------------------------
Notes
---------------------------------------

Plotting time series for multiple well site data;
Plotting mean depth as well as plots for individual wells;


