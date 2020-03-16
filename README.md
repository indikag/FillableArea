### Problem
Finding the fillable area of a given array. Consider the below items array. It contains  6 elements. Each element describe the height of each columns. So the total problem can be illustrated as below.F is fillable area and C is cell area. Only fillable area can be occupied by some other items to fill the space.

int items[] = {2, 3, 1, 4, 4, 5}

| [0] | [1] | [2] | [3] | [4] | [5] |
|:-----|:-----|:---|:-----|:-----|:---
|F|F|F|F|F|C|
|F|F|F|C|C|C|
|F|C|F|C|C|C|
|C|C|F|C|C|C|
|C|C|C|C|C|C|

### Solution

The solution for the given problem is as below. In the below table, only # items can be filled by another thing.

| [0] | [1] | [2] | [3] | [4] | [5] |
|:-----|:-----|:---|:-----|:-----|:---
|F|F|F|F|F|C|
|F|F|F|C|C|C|
|F|C|#|C|C|C|
|C|C|#|C|C|C|
|C|C|C|C|C|C|

### Approach
- fill all items in a 2D array, so the arry will look like the above table
- Then, process each rows(Not columns)
- If there is some F within Cs then it's a fillable area\
- Refer the Main.java to see the solution 

License
----

MIT


**Free Software, Hell Yeah!**
