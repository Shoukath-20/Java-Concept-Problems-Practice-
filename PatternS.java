package problems;

public class PatternS {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  
        int mid = height / 2;

        System.out.println("Letter: S");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'S' ---
                if (
                    i == 0 ||                                 // 1. Top Horizontal Line
                    i == mid ||                               // 2. Middle Horizontal Line
                    i == height - 1 ||                        // 3. Bottom Horizontal Line
                    (j == 0 && i > 0 && i < mid) ||           // 4. Top-Left Vertical Segment
                    (j == width - 1 && i > mid && i < height - 1) // 5. Bottom-Right Vertical Segment
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
