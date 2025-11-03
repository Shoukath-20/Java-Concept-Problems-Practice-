package problems;

public class PatternR {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  
        int mid = height / 2;

        System.out.println("Letter: R");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'R' ---
                if (
                    j == 0 ||                                     // 1. Left Vertical Line
                    (i == 0 || i == mid) && j < width - 1 ||      // 2. Top and Middle Horizontal Lines
                    j == width - 1 && i > 0 && i < mid ||         // 3. Top-Right Vertical Curve
                    i > mid && j == i - mid                       // 4. Diagonal Leg (starts at mid, goes down-right)
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
