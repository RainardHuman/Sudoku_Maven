public class Block {
    public int x , y , value;
    public char block;

    public Block(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.block = setAlphaBlock(x,y);
    }

    public Block() {
    }

    public char setAlphaBlock(int x, int y){
        if (0 <= x && x < 3 && 0 <= y && y < 3) return 'A';
        if (3 <= x && x < 6 && 0 <= y && y < 3) return 'B';
        if (6 <= x && x < 9 && 0 <= y && y < 3) return 'C';
        if (0 <= x && x < 3 && 3 <= y && y < 6) return 'D';
        if (3 <= x && x < 6 && 3 <= y && y < 6) return 'E';
        if (6 <= x && x < 9 && 3 <= y && y < 6) return 'F';
        if (0 <= x && x < 3 && 6 <= y && y < 9) return 'G';
        if (3 <= x && x < 6 && 6 <= y && y < 9) return 'H';
        if (6 <= x && x < 9 && 6 <= y && y < 9) return 'I';

        return 'X';
    }
}
