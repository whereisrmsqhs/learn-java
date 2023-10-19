package jungsuk.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// 실행 결과는 랜덤하게 3,6,2,7나오지 않나? -> 7,6,3,2. treeset은 블랙트리 구조여서 들어가기만 하면 그냥 정렬됨.
// 11-3: ArrayList에서 가장 비용이 많이 드는 작업은? a임, 왜냐면 0번째 자리가 비어서 n-1개 숫자를 다 옮겨야 함. 다른 케이스는 n-1보다 작음.
// 11-4: linkedlist에서 가장 접근하는데 오래 걸리는 원소는? 제일 중간에 있는 원소.
public class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list);
        TreeSet tset = new TreeSet(set);
        Stack stack = new Stack();
        stack.addAll(tset);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
