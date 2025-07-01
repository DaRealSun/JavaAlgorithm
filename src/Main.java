public class Main {
    public static void main(String[] args) {

        int[] input = new int[] {1,2,-3,6,4,5};
        maxNumber(input);

    }

    static void maxNumber(int[] input) {
        int maxNum=0;

        for(int i = 0; i < input.length; i++){
            maxNum=input[0];
                if(maxNum<input[i]){
                    maxNum=input[i];
                }

        }
        System.out.println(maxNum);

    }

}