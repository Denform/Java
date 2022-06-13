package Lab7;

public class Room{
    public String type;
    public float area;

    public Room(){
        String[] types = new String[]{"hall","kitchen","bedroom","bathroom","toilet","living room"};
        this.type = types[(int)(Math.random()*6)];;
        this.area = Math.round((Math.random()*((50-1)+1))+1);;
    }

}
