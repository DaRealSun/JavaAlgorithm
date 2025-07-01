public class Main {
    public static void main(String[] args) {

        int[] input = new int[] {1,2,-3,6,4,5};
        maxNumber(input);

    }

    static int maxNumber(int[] input) {
        int maxNum =0;
        int temp;
        for(int i = 0; i < input.length-1; i++){
            if(input[i]>input[i+1] ){
                maxNum = input[i];
            }
        }
        System.out.println(maxNum);
        return maxNum;

    }

}