package problems;

public class PatternL {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: L");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'L' ---
                if (
                    j == 0 ||                       // Left Vertical Line
                    i == height - 1                 // Bottom Horizontal Line
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
