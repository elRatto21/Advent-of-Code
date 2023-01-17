package tag04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("./inputs/inputTag04Aufgabe01.txt");
		Scanner sc = new Scanner(f);
		int range[];
		int counter = 0;
		boolean t = false;
		while(sc.hasNextLine()) {
			t = false;
			range = getRange(sc);
			for(int i = range[0]; i <= range[1]; i++) {
				for(int j = range[2]; j <= range[3]; j++) {
					if(i == j) {
						t = true;
					}
				}
			}
			if(t) {
				counter++;
			}
		}
		sc.close();
		System.out.println(counter);
	}
	
	public static int[] getRange(Scanner sc) throws FileNotFoundException {
		String raw = sc.nextLine();
		String[] rawArr = raw.split(",");
		String[] range1 = rawArr[0].split("-");
		String[] range2 = rawArr[1].split("-");
		return new int[] {Integer.parseInt(range1[0]), Integer.parseInt(range1[1]), Integer.parseInt(range2[0]), Integer.parseInt(range2[1])};
	}

}
