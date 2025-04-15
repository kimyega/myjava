package org.example;

class Rabit {
    private String shape;
    private int xPos;
    private int yPos;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return this.shape;
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }

    public void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }

}


public class Code07_10 {
    public static void main(String[] args) {
        Rabit r1 = new Rabit();
        r1.setShape("흰토끼");
        r1.setPosition(100, 200);

        Rabit r2 = new Rabit();
        boolean res1 = r1.equals(r2);
        boolean res2 = r1.hashCode() == r2.hashCode();

        System.out.println(res1);
        System.out.println(res2);

        System.out.println(r1);
        System.out.println(r2);

        System.out.printf("토끼의 모양은 [%s]입니다. \n", r1.getShape());
        System.out.printf("토끼의 위치는 [%d, %d]입니다.\n", r1.getX(), r1.getY());
    }
}
