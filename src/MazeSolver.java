import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {
    private static final char OPEN = '0';
    private static final char WALL = '1';
    private static final char START = 'S';
    private static final char END = 'E';
    private static final char PATH = '*';

    public static void solveMaze() {
        char[][] maze = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };

        System.out.println("Initial Maze:");
        printMaze(maze);

        if (findPath(maze)) {
            System.out.println("\nPath found:");
            printMaze(maze);
        } else {
            System.out.println("\nNo solution found.");
        }
    }

    private static boolean findPath(char[][] maze) {
        int[] start = findStart(maze);
        if (start == null) {
            System.out.println("No start point found in the maze.");
            return false;
        }

        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            if (maze[row][col] == END) {
                return true; // Path found
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (isValid(maze, newRow, newCol) && !visited[newRow][newCol]) {
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                    if (maze[newRow][newCol] == OPEN) {
                        maze[newRow][newCol] = PATH;
                    }
                }
            }
        }

        return false; // No path found
    }

    private static int[] findStart(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == START) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static boolean isValid(char[][] maze, int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length
                && (maze[row][col] == OPEN || maze[row][col] == END);
    }

    private static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
















