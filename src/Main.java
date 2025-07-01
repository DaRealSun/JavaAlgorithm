public class Main {
    public static void main(String[] args) {

        int[] input = new int[] {1,2,-3,5,4,6};
        maxNumber(input);

    }

    static void maxNumber(int[] input) {
        int maxNum=input[0];

        for(int i = 0; i < input.length; i++){
                if(maxNum<input[i]){
                    maxNum=input[i];
                }

        }
        System.out.println(maxNum);

    }

}