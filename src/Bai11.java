import java.util.ArrayList;

public class Bai11 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        ArrayList<String> colors2 = new ArrayList<>();
        colors1.add("red");
        colors1.add("yellow");
        colors1.add("orange");
        colors1.add("black");
        colors2.add("white");
        colors2.add("blue");
        colors2.add("pink");
        colors2.add("purple");
        System.out.println("List 1: \n" + colors1);
        System.out.println("\nList 2: \n" + colors2);
        colors1.addAll(colors2);
        System.out.println("\nList 1 + List 2: \n" + colors1);
    }
}
