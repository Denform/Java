package Lab7;

public class Array_Iterator implements Iterator{
    private int currentPosition = 0;
    private Room[] rooms;

    public Array_Iterator(Room[] rooms){
        this.rooms=rooms;
    }
    @Override
    public boolean hasNext(){
        return rooms.length>currentPosition;
    }
    @Override
    public Room getNext(){
        if(hasNext()){
            currentPosition++;
            return rooms[currentPosition-1];
        }else{
            return null;
        }

    }
    @Override
    public void reset(){
        currentPosition=0;
    }

}
