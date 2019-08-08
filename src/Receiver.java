import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver implements Runnable {
    private ServerSocket servSocket=null;
    private InputStream inStream=null;
    private ObjectInputStream obfInputStream=null;
    public boolean stop=false;
    private ActionQueue<ControlPoint> aQ;
    public Receiver(int port,ActionQueue<ControlPoint> aQ){
        try {
            this.aQ = aQ;
            servSocket=new ServerSocket(port);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {
        Socket socket=null;
        try {
            socket=servSocket.accept();
            inStream=socket.getInputStream();
            obfInputStream=new ObjectInputStream(inStream);
            while (!stop){
                aQ.pull((ControlPoint) obfInputStream.readObject());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
