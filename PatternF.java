package problems;

public class PatternF {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  

        System.out.println("Letter: F");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'F' ---
                if (
                    j == 0 ||                       // Left Vertical Line
                    i == 0 ||                       // Top Horizontal Line
                    i == height / 2 && j < width - 1 // Middle Horizontal Line (can be shorter)
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
