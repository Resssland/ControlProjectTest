import java.awt.*;
import java.awt.event.InputEvent;

public class GhostArm {
    public static void main(String[] args){
        ActionQueue<ControlPoint> Aq=new ActionQueue<>();

        Receiver rec=new Receiver(22222,Aq);
        Thread recTh=new Thread(rec);
        recTh.start();

        ControlPoint CurCp=null;
        Robot robot=null;
        double x=0;
        double y=0;
        try {
            robot=new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

            while(true){
            ControlPoint cp=Aq.pop();
            if(cp==null)continue;
            CurCp=cp;
            if(CurCp.getX()!=0||CurCp.getY()!=0){x+=CurCp.getX();y+=CurCp.getY();robot.mouseMove((int)x,(int)y);}
            if(CurCp.isLeftButtonDown()){
                int mask=InputEvent.BUTTON1_DOWN_MASK;
                robot.mousePress(mask);
                CurCp.setLeftButtonDown(false);
            }
            if(CurCp.isLeftButtonDoUp()){
                int mask=InputEvent.BUTTON1_DOWN_MASK;
                robot.mouseRelease(mask);
                CurCp.setLeftButtonDoUp(false);
            }
            if(CurCp.isRightButtonDown()){
                int mask=InputEvent.BUTTON3_DOWN_MASK;
                robot.mousePress(mask);
                CurCp.setRightButtonDown(false);
            }
            if(CurCp.isRightButtonUp()){
                int mask=InputEvent.BUTTON3_DOWN_MASK;
                robot.mouseRelease(mask);
                CurCp.setRightButtonUp(false);
            }

            if(CurCp.isWheelButtonDown()){
                    int mask=InputEvent.BUTTON2_DOWN_MASK;
                    robot.mousePress(mask);
                    CurCp.setWheelButtonDown(false);
                }
                if(CurCp.isWheelButtonUp()){
                    int mask=InputEvent.BUTTON2_DOWN_MASK;
                    robot.mouseRelease(mask);
                    CurCp.setWheelButtonUp(false);
                }
                if(CurCp.getWheel()!=0){
                robot.mouseWheel(CurCp.getWheel());
                CurCp.setWheel(0);
                }




            }




    }

}
