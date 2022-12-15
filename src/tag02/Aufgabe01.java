package tag02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe01 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(findScore());
	}
	
	public static int findScore() throws FileNotFoundException {
		
		File f = new File("./inputs/inputTag02Aufgabe01.txt");
		Scanner sc = new Scanner(f);
		String str;
		int sum = 0;
		
		while(sc.hasNextLine()) {
			 str = sc.nextLine();
			 switch(str) {
			 case "A X":
				 sum += 1 + 3;
				 break;
			 case "A Y":
				 sum += 2 + 6;
				 break;
			 case "A Z":
				 sum += 3 + 0;
				 break;
			 case "B X":
				 sum += 1 + 0;	
				 break;
			 case "B Y":
				 sum += 2 + 3;
				 break;
			 case "B Z":
				 sum += 3 + 6;
				 break;
			 case "C X":
				 sum += 1 + 6;
				 break;
			 case "C Y":
				 sum += 2 + 0;
				 break;
			 case "C Z":
				 sum += 3 + 3;
				 break;
			 }
		}
		sc.close();
		return sum;
	}

}
