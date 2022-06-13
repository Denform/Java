package Lab6;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Abstract_Personal_Device device;
        Device_Factory factory;

        int count;
        boolean preferenceOS;

        Scanner Input = new Scanner(System.in);
        System.out.print("Введите желаемое количество для производства: ");
        count = Input.nextInt();

        for(int i=0 ; i<count; i++){

            if(Math.random()>0.5){
                preferenceOS = true;
            }else{
                preferenceOS = false;
            }

            if(preferenceOS == true){
                factory = new Android_Factory();
            }else{
                factory = new IPhone_Factory();
            }

            device = factory.createDevice();
            System.out.println(device.getDescription());

        }
    }

}
