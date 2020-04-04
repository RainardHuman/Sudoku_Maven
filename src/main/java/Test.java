public class Test {
    public static void main(String[] args) {
        int[][] layout = {
                {0, 4, 0, 0, 0, 0, 1, 7, 9},
                {0, 0, 2, 0, 0, 8, 0, 5, 4},
                {0, 0, 2, 0, 0, 8, 0, 5, 4},
                {0, 0, 6, 0, 0, 5, 0, 0, 8},
                {0, 8, 0, 0, 7, 0, 9, 1, 0},
                {0, 5, 0, 0, 9, 0, 0, 3, 0},
                {0, 1, 9, 0, 6, 0, 0, 4, 0},
                {3, 0, 0, 4, 0, 0, 7, 0, 0},
                {5, 7, 0, 1, 0, 0, 2, 0, 0},
                {9, 2, 8, 0, 0, 0, 0, 6, 0}};

        Block board[] = new Block[81];
        int x = 0;

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                board[x] = new Block(j,i,layout[i][j]);
                x++;
            }

        }
        System.out.println("Check: " + board[7].block);
        System.out.println("Check: " + board[7].x);
        System.out.println("Check: " + board[7].y);
        System.out.println("Check: " + board[7].value);

    }
}
