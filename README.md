# FillableArea
#Problem
Purpose of this project is to find the water fillable area of a given array. As an example, Lets say we have an array of {2, 3, 2, 4, 2, 4}. In this array fillable area is between item value 3,4 and 4,4.
Such that, the program is written to working with a randomly generated array items. Additionally it contains a 2D view of the actual graph.

#Solution
There will be two type of cells such as Cell and EmptyCell. Cell represents the actual area and EmptyCell represents the potentally fillable area. Then we calculate each cell horizontally to identify whether it can hold some amount of liquid.

#More
Just go through the Main.java class. It contains the core logic that I implemented.