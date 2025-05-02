package mid_exam;

public class Exam04 {                               // Exam04 클래스를 정의 한다..
    public static void main(String[] args) {        // 메인메서드를 정의 한다.
        Fish fish = new GoldFish();     // GoldFish 의 객체를 생성하고 Fish 타입의 참조변수 fish 에 저장한다.
        fish.swim();                    // fish 객체의 swim 메서드 호출시 Goldfish 에서 오버라이드한 메서드가 실행되어 "헤엄치고 있습니다." 를 출력한다.
    }
}
