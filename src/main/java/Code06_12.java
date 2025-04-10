class Rabit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("Rabit setPosition(" + x + ", " + y + ")");
    }
}

public class Code06_12 {
    public static void main(String[] args) {

        Rabit r1 = new Rabit();
        Rabit r2 = new Rabit();
        Rabit r3 = new Rabit();

        r1.shape = "원";
        r2.shape = "삼각형";
        r3.shape = "토끼";

        r1.setPosition(100, 100);
        r2.setPosition(-100, 100);
        r3.setPosition(0, -100);
    }
}
