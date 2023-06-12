import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
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
        String temp;
        System.out.println("Input 2 element index you want to swap: ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println("List before swap: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
        temp = colors.get(input1);
        colors.set(input1,colors.get(input2));
        colors.set(input2,temp);
        System.out.println("List after swap: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " | ");
        }
    }
}
