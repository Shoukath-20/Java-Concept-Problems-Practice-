package problems;

public class PatternM {

    public static void main(String[] args) {
        int height = 7; 
        int width = 7;  // Increased width for a better 'M' shape
        int mid = width / 2;

        System.out.println("Letter: M");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'M' ---
                if (
                    j == 0 ||                       // Left Vertical Line
                    j == width - 1 ||               // Right Vertical Line
                    // Left diagonal (connects column 1 to center)
                    (i <= mid && j == i) && j > 0 && j < mid || 
                    // Right diagonal (connects column width-2 to center)
                    (i <= mid && j == width - 1 - i) && j > mid && j < width - 1
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