# timeseries_visualization
---------------------------------------
Developed by Gareth Rowell;
Last modification date: mm/dd/yyyy;


# Location
Cuyahoga Valley National Park;
https://www.nps.gov/im/htln/parks.htm;
https://www.nps.gov/cuva/learn/nature/wetlands.htm;

# Data source
  Sonia Bingham, Wetlands Biologist; 
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

# Project Features
  DataScanner;
  XYAxes;
  WellPlot;
  
  

---------------------------------------
Notes
---------------------------------------


Create reusable classes for loading data, X and Y axes, and plotting well
Intermediate projects include:
Create an object that loads data
Creating a flexible coordinate system display
Plotting time series for a single well site;
Plotting time series for multiple well site data;
Plot running average as well as depth values for individual wells;


