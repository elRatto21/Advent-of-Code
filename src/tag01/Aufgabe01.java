package tag01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe01 {

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println(returnMaxCalories());
	}
	
	public static int returnMaxCalories() throws FileNotFoundException {
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
				if(elf > maxCalories) {
					maxCalories = elf;
				}
				elf = 0;
			}
		}
		
		sc.close();
		return maxCalories;
	}

}
	