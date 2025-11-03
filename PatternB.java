package problems;

public class PatternB {

	    public static void main(String[] args) {
	        int height = 7; // Controls the height of the letter
	        int width = 5;  // Controls the width of the letter

	        System.out.println("Letter: B");
	        
	        // Outer loop for rows (i)
	        for (int i = 0; i < height; i++) {
	            
	            // Inner loop for columns (j)
	            for (int j = 0; j < width; j++) {
	                
	                // --- Core Logic for Letter 'B' ---
	                if (
	                    j == 0 ||                                                                 // 1. Left Vertical Line
	                    (i == 0 || i == height / 2 || i == height - 1) && j < width - 1 ||        // 2. Top, Middle, and Bottom Horizontal lines
	                    j == width - 1 && i != 0 && i != height / 2 && i != height - 1             // 3. Right edge (to form the "curve" shape)
	                ) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next row
	        }
	    }
	}
