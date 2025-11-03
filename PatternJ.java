package problems;

public class PatternJ {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: J");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'J' ---
                if (
                    i == 0 ||                       // Top Horizontal Line
                    j == width / 2 && i < height - 1 || // Center Vertical Line (excluding the bottom row)
                    i == height - 1 && j < width / 2 && j != 0 || // Bottom Horizontal segment
                    j == 0 && i > height - 3 && i < height - 1 // Bottom-left curve/hook
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