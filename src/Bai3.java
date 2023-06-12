import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
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
        System.out.print("Input the index: ");
        int inputIndex = sc.nextInt();
        System.out.printf("The element at the index %d is: %s", inputIndex, colors.get(inputIndex));
    }
}
