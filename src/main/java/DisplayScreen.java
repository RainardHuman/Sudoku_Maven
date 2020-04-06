import java.util.Arrays;

public class DisplayScreen {
    public int screen_width, screen_height;
    public char pixel_value[][];

    public DisplayScreen(){
        this(50,50,'#');
    }

    public DisplayScreen(int width, int height, char pixel){
        screen_height = height;
        screen_width = width;
        initializeScreen(pixel);
    }
    public DisplayScreen(int width, int height, char[][] pixel){
        screen_height = height;
        screen_width = width;
        pixel_value = pixel;
    }

    private void initializeScreen(char pixel) {
        pixel_value = new char[screen_width][screen_height];
        for (int i = 0; i < screen_width; i++) {
            for (int j = 0; j < screen_height; j++) {
                setPixel_value(i,j,pixel);
            }
        }
    }

    public char getPixel_value(int x,int y){
        return this.pixel_value[x][y];
    }

    public void setPixel_value(int x, int y,char pixel){
        this.pixel_value[x][y] = pixel;
    }

    @Override
    public String toString() {
        String frame = "";
        for (int i = 0; i < screen_height ; i++) {
            frame += new String(pixel_value[i]);
            frame += "\n";
        }
        return frame;
    }
}
