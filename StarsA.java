package problems;

public class StarsA {
	public static void main(String[] args) {
        printStarA();
    }

    /**
     * Prints the star pattern for the letter 'A'.
     */
    public static void printStarA() {
        int height = 7; // Number of rows
        int width = 5;  // Number of columns

        System.out.println("Letter: A");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for the letter 'A'
                if (
                    (j == 0 || j == width - 1) && i != 0 || // Left and Right Vertical Lines (excluding the top corner)
                    i == 0 && j > 0 && j < width - 1 ||    // Top Horizontal Line (excluding the corners)
                    i == height / 2                       // Middle Horizontal Line
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


