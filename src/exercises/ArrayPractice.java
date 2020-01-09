package exercises;

public class ArrayPractice {
    public static void main(String[] args){
        int[] arr = {1, 1, 3, 5, 8};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 > 0) {
                System.out.println(arr[i]);
                continue;
            }
        }
    }
}
