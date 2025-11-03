package problems;

public class PatternI {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: I");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'I' ---
                if (
                    i == 0 ||                       // Top Horizontal Line
                    i == height - 1 ||              // Bottom Horizontal Line
                    j == width / 2                  // Center Vertical Line
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
