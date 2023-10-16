package jungsuk.chapter09;

public class Exercise9_11 {
    public static void main(String[] args) {
        if(args.length <= 1){
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            System.out.println("USAGE : GugudanTest 3 5");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if(num1 <= 1){
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
            System.out.println("USAGE : GugudanTest 3 5");
            return ;
        }
        for(int i = num1; i <= num2; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
