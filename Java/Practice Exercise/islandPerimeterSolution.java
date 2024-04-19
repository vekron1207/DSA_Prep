class islandPerimeterSolution {
    public int islandPerimeter(int[][] grid) {
        // Initialize the perimeter to 0
        int perimeter = 0;

        // Get the number of rows and columns in the grid
        int rows = grid.length;
        int cols = grid[0].length;

        // Iterate through each row of the grid
        for (int row = 0; row < rows; row++) {
            // Iterate through each column in the current row
            for (int col = 0; col < cols; col++) {
                // Check if the current cell is land (value of 1)
                if (grid[row][col] == 1) {
                    // If it's land, add a potential perimeter of 4 (assuming all sides exposed)
                    perimeter += 4;

                    // Check the cell above the current cell (if it's within the grid)
                    if (row > 0 && grid[row - 1][col] == 1) {
                        // If the cell above is also land, it's not part of the outer perimeter
                        perimeter--;
                    }

                    // Check the cell below the current cell (if it's within the grid)
                    if (row < rows - 1 && grid[row + 1][col] == 1) {
                        // If the cell below is also land, it's not part of the outer perimeter
                        perimeter--;
                    }

                    // Check the cell to the left of the current cell (if it's within the grid)
                    if (col > 0 && grid[row][col - 1] == 1) {
                        // If the cell to the left is also land, it's not part of the outer perimeter
                        perimeter--;
                    }

                    // Check the cell to the right of the current cell (if it's within the grid)
                    if (col < cols - 1 && grid[row][col + 1] == 1) {
                        // If the cell to the right is also land, it's not part of the outer perimeter
                        perimeter--;
                    }
                }
            }
        }

        // Return the calculated perimeter of the island
        return perimeter;
    }
}
