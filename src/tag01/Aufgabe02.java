package tag01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int elf1 = returnMaxCalories(Integer.MAX_VALUE);
		int elf2 = returnMaxCalories(elf1);
		int elf3 = returnMaxCalories(elf2);
		System.out.println(elf1 + elf2 + elf3);
		
	}
	
	public static int returnMaxCalories(int maxVal) throws FileNotFoundException {
		File f = new File("./inputs/inputTag01Aufgabe01.txt");
		Scanner sc = new Scanner(f);
		String str;
		int maxCalories = -1;
		int elf = 0;
		
		while(sc.hasNextLine()) {
			str = sc.nextLine();
			if(!str.equalsIgnoreCase("")) {
				elf += Integer.valueOf(str);
			} else {
				if(elf > maxCalories && elf < maxVal) {
					maxCalories = elf;
				}
				elf = 0;
			}
		}
		
		sc.close();
		return maxCalories;
	}

}
