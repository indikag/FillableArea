package com.misc;

import java.util.Arrays;

public class DrawUtil {
	public static void drawThePatternX(int list[]) {
		for (int i : list) {
			int x = 0;
			System.out.print("[" + i + "]");
			while (x < i) {
				System.out.print("+");
				x++;
			}
			System.out.print("\n");
		}
	}

	public static void drawThePatternY(int list[]) {
		int largest = Arrays.stream(list).reduce((x, y) -> x > y ? x : y).getAsInt();
		// System.out.println(largest);

		int index = largest;
		// traversing through horizontal lines
		while (index <= largest && index != 0) {
			// traversing through the items
			for (int i : list) {
				if (index > i) {
					System.out.print(" .");
				} else {
					System.out.print(" x");
				}
				System.out.print("   ");
			}
			System.out.println("");
			index--;

			// Just print the height of each line
			if (index == 0) {
				// we are in the last line
				for (int i : list) {
					System.out.print("[" + i + "]  ");
				}

				System.out.println("\n");
			}
		}
	}
}
