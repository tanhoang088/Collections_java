import java.util.ArrayList;

public class Bai10 {
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
        System.out.println("Original print: \n" + colors);
        System.out.println("\nPrint List using the element's position: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
    }
}
