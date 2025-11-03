package problems;

public class PatternQ {

    public static void main(String[] args) {
        int height = 8; 
        int width = 6;  
        int tailRow = height - 2;

        System.out.println("Letter: Q");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'Q' ---
                if (
                    // Logic for the 'O' shape (Ring)
                    (i == 0 || i == height - 3) && j > 0 && j < width - 1 || // Top and near-Bottom Horizontal Lines
                    (j == 0 || j == width - 1) && i > 0 && i < height - 3 || // Left and Right Vertical Lines
                    
                    // Logic for the Tail (Diagonal)
                    (i == tailRow && j == width - 2) || // Tail start
                    (i == tailRow + 1 && j == width - 1) // Tail end
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
