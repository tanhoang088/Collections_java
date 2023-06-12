import java.util.ArrayList;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        colors.add("red");
        colors.add("yellow");
        colors.add("orange");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add("pink");
        colors.add("purple");
        System.out.print("Input the element you want to search: ");
        String inputString = sc.next();
        if (colors.contains(inputString)) {
            System.out.printf("The element %s you want to search is at index %d", inputString, colors.indexOf(inputString));
        } else System.out.printf("The element %s is not in this List", inputString);
    }
}
