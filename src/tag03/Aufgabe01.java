package tag03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe01 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(getPrioritySum());
	}
	
	public static int getPrioritySum() throws FileNotFoundException {
		File f = new File("./inputs/inputTag03Aufgabe01.txt");
		Scanner sc = new Scanner(f);
		
		int prioritySum = 0;
		String raw;
		String str1;
		String str2;
		char repeat = ' ';
		while(sc.hasNextLine()) {
			raw = sc.nextLine();
			System.out.println(raw);
			System.out.println(raw.substring(raw.length()/2));
			str1 = raw.substring(0, raw.length()/2);
			str2 = raw.substring(raw.length()/2);
			System.out.println(str1 + " " + str2);
			
			for(int i = 0; i < str1.length(); i++) {
				for(int j = 0; j < str2.length(); j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						repeat = str1.charAt(i);
					}
				}
			}
			if(Character.isUpperCase(repeat)) {
				System.out.println(repeat - 38);
				prioritySum += repeat - 38;
			} else {
				System.out.println(repeat - 96);
				prioritySum += repeat - 96;
			}
		}
		sc.close();
		return prioritySum;
	}

}
