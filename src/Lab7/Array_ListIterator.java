package Lab7;

import java.util.ArrayList;

public class Array_ListIterator implements Iterator{
    private int currentPosition = 0;
    private ArrayList<Room> rooms;

    public Array_ListIterator(ArrayList<Room> rooms){
        this.rooms=rooms;
    }
    @Override
    public boolean hasNext(){
        return rooms.size()>currentPosition;
    }
    @Override
    public Room getNext(){
        if(hasNext()){
            currentPosition++;
            return rooms.get(currentPosition-1);
        }else{
            return null;
        }

    }
    @Override
    public void reset(){
        currentPosition=0;
    }

}

