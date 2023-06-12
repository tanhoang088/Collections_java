import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bai7 {
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
        System.out.println("The list before sort: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
        Collections.sort(colors);
        System.out.println("\n\nThe list after sorted: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
    }
}
