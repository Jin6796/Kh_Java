package com.day10;

public class K {
	public static int switchIt(int x) { // x=4
		int j = 1;
		switch (x) {                    // x=4
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:                         // 여기
			j++;                        // j=2
			break;
		case 5:
			j++;                        // j=3
			break;
		default:
			j++;                        // j=4
		}
		return j + x; // 4 + 4
	}

	public static void main(String[] args) {
		System.out.println(switchIt(4));
	}

}
