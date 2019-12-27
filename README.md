# timeseries_visualization

Project: 

Visualizing Wetland Data
Cuyahoga Valley National Park

Where did the data come from?

Cuyahoga Valley National Park

https://www.nps.gov/im/htln/parks.htm

https://www.nps.gov/cuva/learn/nature/wetlands.htm

What was measured?
  Water level depth using Ecotone Water Level Data Logger;
  Eight well sites from November 2010 to June 2018;

How were the data processed, cleaned, and modified for the visualization?
  Metadata and spreadsheets from individual well loggers;
  Resolve single and multiple observations per day;
  Double cast to integers for graphics;
  Combine all eight wells into one table;




---------------------------------------
Notes

Create resusable classes for (1) loading data into array and (2) displaying the X and Y axis.

Create a project -> jar.

Move to an IDE to facilitate creating JavaFX GUI.

Control data representation using Shape.path

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


