package jungsuk.chapter11;

import java.util.*;

class ClassTotalComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student2 && o2 instanceof Student2){
            int result = ((Student2) o1).ban - ((Student2) o2).ban;

            if(result == 0){
                return ((Student2) o1).total - ((Student2) o2).total;
            }
            return result;
        }
        return -1;
    }
}
public class Exercise11_9 {

    public static void calculateClassRank(List list){
        Collections.sort(list, new ClassTotalComparator());

        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0, n=0; i < length; i++, n++){
            Student2 s = (Student2) list.get(i);

            if (s.ban != prevBan) {
                prevRank = -1;
                prevTotal = -1;
                n = 0;
            }
            if(s.total==prevTotal) { s.classRank = prevRank;
            } else {
                s.classRank = n + 1;
            }
            prevBan = s.ban;
            prevRank = s.classRank;
            prevTotal = s.total;
        }



    }
    public static void calculateSchoolRank(List list){
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0; i < length; i++){
            Student2 s = (Student2) list.get(i);

            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = i + 1;
            }

            prevRank = s.schoolRank;
            prevTotal = s.total;
        }

    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student2("이자바",2,1,70,90,70));
        list.add(new Student2("안자바",2,2,60,100,80));
        list.add(new Student2("홍길동",1,3,100,100,100));
        list.add(new Student2("남궁성",1,1,90,70,80));
        list.add(new Student2("김자바",1,2,80,80,90));

        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator it = list.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
