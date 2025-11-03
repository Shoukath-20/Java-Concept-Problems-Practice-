package problems;

public class PatternN {

    public static void main(String[] args) {
        int height = 7; 
        int width = 7;  // Using slightly wider dimensions for a better diagonal

        System.out.println("Letter: N");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'N' ---
                if (
                    j == 0 ||                       // Left Vertical Line
                    j == width - 1 ||               // Right Vertical Line
                    j == i && j < width - 1         // Diagonal Line (j == i is the main diagonal)
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
