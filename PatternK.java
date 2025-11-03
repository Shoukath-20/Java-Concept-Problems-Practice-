package problems;

public class PatternK {

    public static void main(String[] args) {
        int height = 7; 
        int width = 5;  
        int mid = height / 2;

        System.out.println("Letter: K");
        
        // Outer loop for rows (i)
        for (int i = 0; i < height; i++) {
            
            // Inner loop for columns (j)
            for (int j = 0; j < width; j++) {
                
                // --- Core Logic for Letter 'K' ---
                if (
                    j == 0 || // Left Vertical Line
                    // Upper diagonal line: distance from middle row decreases as column increases
                    (i <= mid && j == mid - i) || 
                    // Lower diagonal line: distance from middle row increases as column increases
                    (i > mid && j == i - mid)
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
