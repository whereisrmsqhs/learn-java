package jungsuk.chapter06;


// static을 붙여야 하는 변수는 weapon, armor, weaponUp, armorUp
// 그 이유는 모든 마린은 다 같은 업그레이드 수치를 가지고 있음, 위치는 서로 다를 수 있음.
// 6-10: 설명으로 옳지 않는 것, b, e -> 객체를 생성하는 것은 new 객체()이다. 생성자의 목적은 초기화.
// 6-11: 설명으로 맞지 않는 것. b
// 6-12: 성립 조건 아닌 것은. c, d
// 6-13: 올바른 오버로딩은. b, c, d
// 6-14: 초기화에 대해서 옳지 않은 것. c, e
// 6-15: 초기화 순서가 올바른 것은. a
// 6-16: 지역변수에 대해서 옳지 않은 것은. a, e -> 지역 변수는 자동 초기화 안됨, 쓰레기 값도 안들어가고 그냥 에러남. 지역 변수는 call stack에서 생성됨.
// 6-17: 옳지 않은 설명은. b -> 실행중인 메서드는 println만 실행중이고 나머지는 대기 상태라고 한다.

class Marine {
    int x=0, y=0; // Marine의 위치좌표(x,y) int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) { this.x = x;
        this.y = y;
    }
}
public class Exercise6_9 {
}
