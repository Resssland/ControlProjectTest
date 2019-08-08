import java.util.Vector;

public class ControlPoint {
    private double x=0;
    private double y=0;
    private boolean leftButtonDown=false;
    private boolean leftButtonDoUp=false;
    private boolean rightButtonDown=false;
    private boolean rightButtonUp=false;
    private boolean wheelButtonDown=false;
    private boolean wheelButtonUp=false;
    private int wheel=0;


    public ControlPoint(){

    }

    public boolean isWheelButtonUp() {
        return wheelButtonUp;
    }

    public void setWheelButtonUp(boolean wheelButtonUp) {
        this.wheelButtonUp = wheelButtonUp;
    }

    public boolean isWheelButtonDown() {
        return wheelButtonDown;
    }

    public void setWheelButtonDown(boolean wheelButtonDown) {
        this.wheelButtonDown = wheelButtonDown;
    }

    public boolean isRightButtonUp() {
        return rightButtonUp;
    }

    public void setRightButtonUp(boolean rightButtonUp) {
        this.rightButtonUp = rightButtonUp;
    }

    public boolean isRightButtonDown() {
        return rightButtonDown;
    }

    public void setRightButtonDown(boolean rightButtonDown) {
        this.rightButtonDown = rightButtonDown;
    }

    public boolean isLeftButtonDoUp() {
        return leftButtonDoUp;
    }

    public void setLeftButtonDoUp(boolean leftButtonDoUp) {
        this.leftButtonDoUp = leftButtonDoUp;
    }

    public boolean isLeftButtonDown() {
        return leftButtonDown;
    }

    public void setLeftButtonDown(boolean leftButtonDown) {
        this.leftButtonDown = leftButtonDown;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
