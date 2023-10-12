package jungsuk.chapter06;

public class Exercise6_20 {

    public static int[] shuffle(int[] array){
        for(int i = 0; i < array.length; i++){
            int j = (int)(Math.random()*10);
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
