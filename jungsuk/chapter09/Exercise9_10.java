package jungsuk.chapter09;

public class Exercise9_10 {

    public static String format(String str, int length, int alignment){
        if(length < str.length()){
            return str.substring(0, length-1);
        }
        String ans = "";
        if(alignment==0){
            return str;
        }
        else if(alignment==1){
            int remain = length - str.length();
            for(int i = 0; i < remain/2; i++){
                ans += " ";
            }
            ans += str;
            for(int i = 0; i < remain/2; i++){
                ans += " ";
            }
            return ans;
        }
        else if(alignment==2) {
            for (int i = 0; i < length-str.length(); i++) {
                ans += " ";
            }
            ans += str;
            return ans;
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }
}
