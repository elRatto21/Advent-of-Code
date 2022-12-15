package tag03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(getPriority());
	}

	
	public static int getPriority() throws FileNotFoundException {
		int prioritySum = 0;
		File f = new File("./inputs/inputTag03Aufgabe01.txt");
		Scanner sc = new Scanner(f);
		String str1;
		String str2;
		String str3;
		while(sc.hasNextLine()) {
			str1 = sc.nextLine();
			str2 = sc.nextLine();
			str3 = sc.nextLine();
			char badge = ' ';
			for(int i = 0; i < str1.length(); i++) {
				for(int j = 0; j < str2.length(); j++) {
					for(int o = 0; o < str3.length(); o++) {
						if(str1.charAt(i) == str2.charAt(j) && str1.charAt(i) == str3.charAt(o)) {
							badge = str1.charAt(i);
							break;
						}
					}
				}
			}
			prioritySum += calcPriority(badge);
		}
		return prioritySum;
	}
	
	public static int calcPriority(char c) {
		if(Character.isUpperCase(c)) {
			return c - 38;
		} else {
			return c - 96;
		}
	}
}
