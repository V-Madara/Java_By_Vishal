/*16. Can you create a pyramid of characters in Java?
Pattern programs are a very popular interview topic. This type of question is used to understand the logical thinking abilities of the interviewee. Refer to Pyramid Pattern Programs in Java for examples of different ways to create pyramid patterns.*/

import java.util.Scanner;

public class CharacterPyramid {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Your Name: ");
    //     String str = sc.nextLine();
    //     System.out.println("Enter the Hight and Length of pyramid: ");
    //     int h = sc.nextInt();
    //     int l =sc.nextInt();
    //     int x = l/2,y=l/2;
    //     for(int i = 0;i<h;i++){
    //         for(int j = -l;j<2*l;j++){
    //             if(j>=x&&j<=y){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         x--;y++;
    //         System.out.println();
    //     }
    //     sc.close();
    // }

    private static void printPattern1(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			printString(i + " ", i);

			//move to next line
			System.out.println("");
		}
	}

	//utility function to print string given times
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the rows to print:");
		int rows = scanner.nextInt();
		// System.out.println("Rows = "+rows);
		scanner.close();

		System.out.println("Printing Pattern 1\n");
		printPattern1(rows);

	}

}
