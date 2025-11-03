package problems;

public class PatternO {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: O");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'O' ---
                if (
                    (i == 0 || i == height - 1) && j > 0 && j < width - 1 || // Top and Bottom Horizontal Lines (excluding corners)
                    (j == 0 || j == width - 1) && i > 0 && i < height - 1    // Left and Right Vertical Lines (excluding corners)
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
