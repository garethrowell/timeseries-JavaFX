# timeseries_visualization
Project to develop linear time series visualizations primarily for CUVA well data.

Problem with interrupts in data capture. Handle each continuous shape (uninterrupted data logged) as path

How to define a path

Path begins with first observation "MoveTo"
Followed by LineTo until there is a break in the logged data
How will you know there's a break?

Interval is daily. If interval is more than daily, End path, plot it
then start a new one



Intermediate projects include:
Creating a flexible coordinate system display;
Plotting time series for a single well site;
Plotting time series for multiple well site data;
Plotting mean depth as well as plots for individual wells;


