package problems;

public class PatternG {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: G");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'G' ---
                if (
                    j == 0 && i != 0 && i != height - 1 ||         // 1. Left Vertical Line (excluding corners)
                    i == 0 && j > 0 ||                             // 2. Top Horizontal Line (excluding left corner)
                    i == height - 1 && j > 0 && j < width - 1 ||   // 3. Bottom Horizontal Line (excluding corners)
                    j == width - 1 && i > height / 2 ||            // 4. Right Vertical Line (only on the bottom half)
                    i == height / 2 && j >= width / 2              // 5. Middle Horizontal Line (inward extension)
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
