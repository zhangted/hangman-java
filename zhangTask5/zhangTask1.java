
package zhangAsgn2Task1;

import java.util.Scanner;

public class zhangTask1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Get ready to record inputs
		int[] vars = new int[2]; //Empty array to hold rows and columns
		
		System.out.print("Enter the number of rows and columns in the array: "); //Ask user for inputs
		for(int i = 0; i < vars.length; i++) { 
			vars[i] = scan.nextInt(); //Read the numbers and memorize them
		}
		
		//Make array according to user's specified size
		double[][] arrayContents = new double[vars[0]][vars[1]];
		
		
		System.out.print("Enter the array: "); //Ask user for values in the array
		for(int i = 0; i < arrayContents.length; i++) {
			for(int j = 0; j < arrayContents[i].length; j++) {
				arrayContents[i][j] = scan.nextDouble(); //Read each number in by row
			}
			
		}
		//System.out.println(Arrays.deepToString(arrayContents));
		
		
		Location loc = new Location(0, 0); //Empty location variable
		loc.locateLargest(arrayContents); //Run locateLargest function on array
		int x = loc.getX(); //Get X of largest number
		int y = loc.getY(); //Get Y of largest number
		
		//Print out info
		System.out.println("The location of the largest element is " + arrayContents[x][y] + " at (" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
		
		
		
			
		}
		
		
		
	}
	
	
	
	


	
	

