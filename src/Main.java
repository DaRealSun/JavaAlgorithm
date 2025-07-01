public class Main {
    public static void main(String[] args) {

        int[] input = new int[] {-5,-4,-3,-2,-1};
        maxNumber(input);

    }

    static void maxNumber(int[] input) {
        int maxNum=input[0];

        for(int i = 0; i < input.length; i++){

            maxNum=Math.max(maxNum,input[i]);

        }
        System.out.println(maxNum);

    }

}