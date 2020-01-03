# timeseries_visualization
---------------------------------------
# Location
  Cuyahoga Valley National Park
  https://www.nps.gov/im/htln/parks.htm
  https://www.nps.gov/cuva/learn/nature/wetlands.htm

# Data source
  Sonia Bingham, Wetlands Biologist, 
  Heartland I&M Network, Cuyahoga Valley National Park
  
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

Implement shape.path to manage uninterrupted series;
Create reusable classes for file reading and XYaxes;


The Path class represents a simple shape and provides facilities required for basic construction and management of a geometric path. 

import javafx.scene.shape.*;
Path path = new Path();


