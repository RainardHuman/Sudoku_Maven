public class Test {
<<<<<<< HEAD
    static Block board[];
=======
>>>>>>> master
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

<<<<<<< HEAD
        board = new Block[81];
        DisplayScreen screen = new DisplayScreen(9,9,'6');
=======
        Block board[] = new Block[81];
>>>>>>> master
        int x = 0;

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                board[x] = new Block(j,i,layout[i][j]);
<<<<<<< HEAD
                //screen.setPixel_value(i,j,Integer.toString(layout[i][j]).charAt(0));
=======
>>>>>>> master
                x++;
            }

        }
<<<<<<< HEAD






        System.out.println(screen);



    }

    public static void  displayBoard(){

=======
>>>>>>> master
        System.out.println("Check: " + board[7].block);
        System.out.println("Check: " + board[7].x);
        System.out.println("Check: " + board[7].y);
        System.out.println("Check: " + board[7].value);
<<<<<<< HEAD
=======

>>>>>>> master
    }
}
