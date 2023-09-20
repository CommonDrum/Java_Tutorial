package Day20_09;

public class Counter {

    private int state = 0;

    public int getState(){
        return state;
    }

    public void inc(){
        state++;
    }

    public void dec(){
        state--;
    }

    public void reset(){
        state = 0;
    }


}
