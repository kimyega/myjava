package exam01;

public class Rabbit {
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
