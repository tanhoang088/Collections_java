import java.util.ArrayList;

public class Bai12 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        ArrayList<String> colors2 = new ArrayList<>();
        ArrayList<String> colors3 = new ArrayList<>();
        colors1.add("red");
        colors1.add("yellow");
        colors1.add("orange");
        colors1.add("black");
        colors2.add("white");
        colors2.add("blue");
        colors2.add("pink");
        colors2.add("purple");
        colors3.add("red");
        colors3.add("yellow");
        colors3.add("orange");
        colors3.add("black");
        System.out.println("List 1: " + colors1);
        System.out.println("List 2: " + colors2);
        System.out.println("List 3: " + colors3);
        if(colors1.equals(colors2)) System.out.println("\nList 1 and List 2 are equal!");
        else System.out.println("\nList 1 and List 2 are not equal!");
        if(colors1.equals(colors3)) System.out.println("List 1 and List 3 are equal!");
        else System.out.println("List 1 and List 3 are not equal!");
    }
}
