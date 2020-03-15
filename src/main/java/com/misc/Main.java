package com.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Generate random numbers for the array
		int list[] = { new Random().nextInt(6), new Random().nextInt(6), new Random().nextInt(6),
				new Random().nextInt(6), new Random().nextInt(6), new Random().nextInt(6), new Random().nextInt(6) };
		DrawUtil.drawThePatternY(list);
		System.out.println("Filleable Area Size = " + getFillableArea(list));
	}

	private static int getFillableArea(int list[]) {
		int maxValueOfList = Arrays.stream(list).reduce((x, y) -> x > y ? x : y).getAsInt();
		// Cell[row] [column] = 4 x 7
		Cell cellMap[][] = new Cell[list.length][maxValueOfList];

		// STEP-1 fill all cells with type
		for (int i = 0; i < list.length; i++) {
			int value = list[i];
			// i is cell tower index
			// value is number of cells

			// filling proper cells
			for (int x = 0; x < value; x++) {
				Cell cell = new Cell();
				cell.setFillable(false);
				cellMap[i][x] = cell;
			}

			// filling empty cells
			for (int x = value; x < maxValueOfList; x++) {
				EmptyCell cell = new EmptyCell();
				cell.setFillable(false);
				// first empty cell has the bottom cell or floor
				if (x == value || x == 0) {
					cell.setHadDown(true);
				}
				cellMap[i][x] = cell;
			}
		}

		ArrayList<Cell> temp = new ArrayList<Cell>();
		for (int j = 0; j < maxValueOfList; j++) {
			Cell startCell = null;
			Cell endCell = null;
			boolean isStartCellModifiable = true;
			ArrayList<Cell> tempList = new ArrayList<Cell>();

			for (int i = 0; i < list.length; i++) {
				// Go until fine a Cell type of object.
				Cell cell = cellMap[i][j];
				if ((cell instanceof Cell) && !(cell instanceof EmptyCell)) {
					// Cell goes here
					if (isStartCellModifiable) {
						startCell = cell;
					}

					if (!isStartCellModifiable) {
						endCell = cell;
					}

					// check last item condition.
					if ((startCell != null && endCell != null)) {
						temp.addAll(tempList);
						tempList.clear();

						// Reset all
						startCell = endCell;
						endCell = null;
						isStartCellModifiable = true;
					}
				} else {
					// Empty Cell goes here
					if (startCell != null) {
						isStartCellModifiable = false;
						tempList.add(cell);
					}
				}
			}
		}

		return temp.size();

	}

}
