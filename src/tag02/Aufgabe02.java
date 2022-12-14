package tag02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe02 {

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
				 sum += 3 + 0;	//Schere
				 break;
			 case "A Y":
				 sum += 1 + 3;	//Stein
				 break;
			 case "A Z":
				 sum += 2 + 6;	//Papier
				 break;
			 case "B X":
				 sum += 1 + 0;	//Stein
				 break;
			 case "B Y":
				 sum += 2 + 3;	//Papier
				 break;
			 case "B Z":
				 sum += 3 + 6;	//Schere
				 break;
			 case "C X":
				 sum += 2 + 0;	//Papier
				 break;
			 case "C Y":
				 sum += 3 + 3;	//Schere
				 break;
			 case "C Z":
				 sum += 1 + 6;	//Stein
				 break;
			 }
		}
		sc.close();
		return sum;
	}

}
