# timeseries_visualization
---------------------------------------
# Location
Cuyahoga Valley National Park
https://www.nps.gov/im/htln/parks.htm
https://www.nps.gov/cuva/learn/nature/wetlands.htm

# Data source
  Water level depth using Ecotone Water Level Data Logger;
  Eight well sites from November 2010 to June 2018;

# Data processing issues
  Actual data is double; convert to integers for graphics;
  Missing data;
  Single vs. multiple observations per day;
  Each spreadsheet is one well site for one year;
  Combine all eight wells into one table: 2010 - 2018;
  Use Julian dates where 1/1/2010 is day 1;




---------------------------------------
Notes
---------------------------------------

Email Sonia about well locations.

Move .java files to src.

Implement scanner.

Implement shape.path to manage uninterrupted series;
Create reusable classes for file reading and XYaxes;
Create package structure;

Create resusable classes for (1) loading data into array and (2) displaying the X and Y axis.


The Path class represents a simple shape and provides facilities required for basic construction and management of a geometric path. 

import javafx.scene.shape.*;
Path path = new Path();
Project to develop linear time series visualizations primarily for CUVA well data.

Problem with interrupts in data capture. Handle each continuous shape (uninterrupted data logged) as path

Path begins with first observation "MoveTo"
Followed by LineTo until there is a break in the logged data
How will you know there's a break?

Interval is daily. If interval is more than daily, End path, plot it
then start a new path.



Intermediate projects include:
Creating a flexible coordinate system display;
Plotting time series for a single well site;
Plotting time series for multiple well site data;
Plotting mean depth as well as plots for individual wells;


