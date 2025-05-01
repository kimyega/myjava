package mid_exam;

public class GoldFish extends Fish {        // 부모 클래스가 Fish 인 자식클래스 GoldFish 를 정의한다.

    @Override           // @Override 로 부모클래스 Fish 의 추상메서드인 swim 을 불러와 자식클래스에서 재정의한다.
    public void swim() {
        System.out.println("헤엄치고 있습니다.");
    }       // 헤엄치고 있습니다. 를 출력한다.
}
