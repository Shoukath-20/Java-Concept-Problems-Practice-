package problems;

public class PatternH {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: H");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'H' ---
                if (
                    j == 0 ||                       // Left Vertical Line
                    j == width - 1 ||               // Right Vertical Line
                    i == height / 2                 // Middle Horizontal Line
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
