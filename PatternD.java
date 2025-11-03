package problems;

public class PatternD {

	    public static void main(String[] args) {
	        int height = 7; 
	        int width = 5;  

	        System.out.println("Letter: D");
	        
	        // Outer loop for rows (i)
	        for (int i = 0; i < height; i++) {
	            
	            // Inner loop for columns (j)
	            for (int j = 0; j < width; j++) {
	                
	                // --- Core Logic for Letter 'D' ---
	                if (
	                    j == 0 ||                                 // Left Vertical Line
	                    (i == 0 || i == height - 1) && j < width - 1 || // Top and Bottom Horizontal Lines (excluding the right corner)
	                    j == width - 1 && i > 0 && i < height - 1  // Right Vertical/Curved Line (excluding top and bottom corners)
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

