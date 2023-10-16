package jungsuk.chapter09;

public class Exercise9_6 {

    public static String fillZero(String src, int length){
        if(src==null || src.length() == length) return src;
        if(length <= 0) return "";

        String result = new String();
        for(int i = 0; i < length; i++){
            if(i < length-src.length()){
                result += '0';
                continue;
            }
            result += src;
            break;
        }
        return result;

    }
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
