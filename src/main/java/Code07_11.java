class Rabbit01 {
    String shape = "";
    private int xPos;
    private int yPos;
    public int number;

    Rabbit01() {
        System.out.println("자바에서 기본으로 만들어주는 생성자");
    }

    Rabbit01(String shape) {
        this.shape = shape;
    }

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

class Rabbit02 extends Rabbit01 {
    public int count;


    Rabbit02(int count) {
        this.count = count;
    }

    @Override
    void setPosition(int xPos, int yPos) {
        count = xPos + yPos;
        System.out.println("count : " + count);
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit01 rabbit0 = new Rabbit01();

        Rabbit01 rabbit1 = new Rabbit01("원");
        Rabbit01 rabbit2 = new Rabbit01("삼각형");

        rabbit0.setPosition(100, 200);
        rabbit0.number = 1;
//        rabbit0.xPos = 0;

        Rabbit01 rabbit3 = new Rabbit02(7);

        rabbit3.setPosition(100, 200);
    }
}
