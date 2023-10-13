package jungsuk.chapter08;

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String message, int code){
        super(message);
        ERR_CODE = code;
    }

    public int getErrorCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return "["+getErrorCode()+"]" + super.getMessage();
    }
}
public class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}
