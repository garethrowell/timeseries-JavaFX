# timeseries_visualization

Project: 

Visualizing Wetland Well Depth Data
Cuyahoga Valley National Park

Where did the data come from?

Cuyahoga Valley National Park

https://www.nps.gov/im/htln/parks.htm

https://www.nps.gov/cuva/learn/nature/wetlands.htm


Developing a data visualization

https://github.com/


---------------------------------------

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


