package exercises;
import java.util.*;
public class PraticeJavaChapter3 {
    public static void main(String [] args) {
        int[] nums = new int[]{1, 1, 2, 3, 5, 8};
        for (int i : nums) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    String[] splitText = greenEggs.split(" \\.");
    System.out.println(Arrays.toString(splitText));


    }
}
