package Lab7;

import java.util.ArrayDeque;

public class Array_Deque_Iterator implements Iterator{
    private int currentPosition;
    private ArrayDeque<Room> rooms;

    public Array_Deque_Iterator(ArrayDeque<Room> rooms){
        this.rooms = new ArrayDeque<Room>(rooms);
        currentPosition=rooms.size();
        // rooms;
    }
    @Override
    public boolean hasNext(){
        return currentPosition>0;
    }
    @Override
    public Room getNext(){
        if(hasNext()){
            currentPosition--;
            return rooms.pop();
        }else{
            return null;
        }

    }
    @Override
    public void reset(){
        currentPosition=0;
    }

}
