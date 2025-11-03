package problems;

public class PatternC {


	    public static void main(String[] args) {
	        int height = 7; 
	        int width = 5;  

	        System.out.println("Letter: C");
	        
	        // Outer loop for rows (i)
	        for (int i = 0; i < height; i++) {
	            
	            // Inner loop for columns (j)
	            for (int j = 0; j < width; j++) {
	                
	                // --- Core Logic for Letter 'C' ---
	                if (
	                    j == 0 && i != 0 && i != height - 1 || // Left Vertical Line (excluding top/bottom corners)
	                    i == 0 && j > 0 ||                     // Top Horizontal Line (excluding the very first column)
	                    i == height - 1 && j > 0               // Bottom Horizontal Line (excluding the very first column)
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
