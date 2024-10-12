package a1;

public class col {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Column index to which the value will be added (0-based index)
        int columnIndex = 1;

        // Value to be added
        int valueToAdd = 10;

        // Adding the value to each element in the specified column
        for (int i = 0; i < array.length; i++) {
            array[i][columnIndex] += valueToAdd;
        }

        // Printing the modified array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

