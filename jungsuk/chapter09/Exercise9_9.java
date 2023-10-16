package jungsuk.chapter09;

public class Exercise9_9 {

    public static String delChar(String src, String delch){
        StringBuffer s = new StringBuffer(src);

        for(int i = 0; i < delch.length(); i++){
            while(true){
                int idx = s.indexOf(String.valueOf(delch.charAt(i)));
                if(idx==-1) break;
                s.delete(idx, idx+1);
            }
        }
        String string = s.toString();
        return string;
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "+ delChar("(1 2 3 4\t5)"," \t"));
    }
}
