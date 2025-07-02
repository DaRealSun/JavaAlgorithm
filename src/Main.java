import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(5);
        input.add(-5);
        input.add(1);
        input.add(0);
        input.add(2);
        input.add(3);
        maxNumber(input);

    }

    static void maxNumber(ArrayList<Integer> input) {
        int maxNum= input.getFirst();
        for (Integer integer : input) {

            maxNum = Math.max(maxNum, integer);

        }
        System.out.println(maxNum);

    }

}