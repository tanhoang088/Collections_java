import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        colors.add("black");
        colors.add("white");
        colors.add(0,"added color");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
    }
}
