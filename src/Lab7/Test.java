package Lab7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    private static float sumArea = 0;

    private static float sumAreaFloor1 = 0;
    private static float sumAreaFloor2 = 0;
    private static float sumAreaFloor3 = 0;

    private static float sumAreaTypeHall = 0;
    private static float sumAreaTypeKitchen = 0;
    private static float sumAreaTypeBedroom = 0;
    private static float sumAreaTypeBathroom = 0;
    private static float sumAreaTypeToilet = 0;
    private static float sumAreaTypeLivingRoom = 0;

    public static void main(String[] args) throws Exception {
        Scanner Input=new Scanner(System.in);
        System.out.print("Введите желаемое количество комнат: ");
        int count = Input.nextInt();

        Room[] roomsFloor1 = new Room[count];
        ArrayList<Room> roomsFloor2 = new ArrayList<Room>();
        ArrayDeque<Room> roomsFloor3 = new ArrayDeque<Room>();

        for(int i=0; i < count;i++){
            roomsFloor1[i]=new Room();
            roomsFloor2.add(new Room());
            roomsFloor3.addLast(new Room());
        }

        Array_Iterator arrayIterator = new Array_Iterator(roomsFloor1);
        Array_ListIterator arrayListIterator = new Array_ListIterator(roomsFloor2);
        Array_Deque_Iterator arrayDequeIterator = new Array_Deque_Iterator(roomsFloor3);

        for(int i=0;i<count;i++){
            Room roomFloor1 = arrayIterator.getNext();
            Room roomFloor2 = arrayListIterator.getNext();
            Room roomFloor3 = arrayDequeIterator.getNext();

            sumArea += roomFloor1.area + roomFloor2.area + roomFloor3.area;

            sumAreaFloor1 += roomFloor1.area;
            sumAreaFloor2 += roomFloor2.area;
            sumAreaFloor3 += roomFloor3.area;

            sumAreaType(roomFloor1);
            sumAreaType(roomFloor2);
            sumAreaType(roomFloor3);

        }

        System.out.println("More площадь: "+sumArea
                +"\nОбщая площадь первого этажа: "+sumAreaFloor1+"\nОбщая площадь второго этажа: "+sumAreaFloor2+"\nОбщая площадь третьего этажа: "+sumAreaFloor3
                +"\nОбщая площадь холлов: "+sumAreaTypeHall+"\nОбщая площадь кухонь: "+sumAreaTypeKitchen+"\nОбщая площадь спален: "+sumAreaTypeBedroom
                +"\nОбщая площадь ванных: "+sumAreaTypeBathroom+"\nОбщая площадь туалетных комнат: "+sumAreaTypeToilet+"\nОбщая площадь гостиных: "+sumAreaTypeLivingRoom);

        Input.close();
    }

    public static void printRoom(Room room){
        System.out.println("room = "+ room.type +" "+room.area);
    }

    public static void sumAreaType(Room room){

        switch (room.type) {
            case "hall" -> sumAreaTypeHall += room.area;
            case "kitchen" -> sumAreaTypeKitchen += room.area;
            case "bedroom" -> sumAreaTypeBedroom += room.area;
            case "bathroom" -> sumAreaTypeBathroom += room.area;
            case "toilet" -> sumAreaTypeToilet += room.area;
            case "living room" -> sumAreaTypeLivingRoom += room.area;

        }
    }

}
