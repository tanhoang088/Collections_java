import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add("pink");
        colors.add("purple");
        ArrayList<String> colors2 = colors;
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors2.get(i) + " | ");
        }
    }
}
