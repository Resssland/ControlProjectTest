import java.util.ArrayDeque;

public class  ActionQueue <T>{
    private ArrayDeque<T> queue=new ArrayDeque<>();
    public ActionQueue(){

    }
    public synchronized void pull(T obj){
        queue.offer(obj);
    }
    public synchronized T pop(){
        if(!queue.isEmpty())return queue.poll();
        else {return null;}
    }

}

