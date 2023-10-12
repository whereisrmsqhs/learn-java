package jungsuk.chapter06;

public class Exercise6_23 {

    public static int max(int[] array){
        if(array == null || array.length == 0){
            return -999999;
        }

        int m = -987654321;
        for(int i = 0; i < array.length; i++){
            if(array[i] > m){
                m = array[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대:" + max(data));
        System.out.println("최대:" + max(null));
        System.out.println("최대:" + max(new int[]{}));
    }
}
