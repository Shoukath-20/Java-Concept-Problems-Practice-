package problems;

public class PatternP {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: P");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'P' ---
                if (
                    j == 0 ||                                 // Left Vertical Line
                    (i == 0 || i == height / 2) && j < width - 1 || // Top and Middle Horizontal Lines (excluding right corner)
                    j == width - 1 && i > 0 && i < height / 2  // Right Vertical Line (only on the top half)
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
