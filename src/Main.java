import java.util.ArrayList;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(5);
        input.add(-5);
        input.add(1);
        input.add(0);
        input.add(2);
        input.add(3);
        int a = 1;
        int b = 0;
        int c = -1;
        maxNumber(input);
        maxOfThree(a,b,c);
    }


    private static void maxOfThree(int a, int b, int c) {
        int maxNum = max(max(a, b), c);
        System.out.println(maxNum);
    }

    static void maxNumber(ArrayList<Integer> input) {
        int maxNum= input.getFirst();
        for (Integer integer : input) {

            maxNum = max(maxNum, integer);

        }
        System.out.println(maxNum);

    }

}