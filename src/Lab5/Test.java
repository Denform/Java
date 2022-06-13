package Lab5;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Abstract_Personal_Device device;
        int dataRelease, count;
        String type, color, screenResolution, typeScreen;
        boolean preferenceOS;

        Scanner Input = new Scanner(System.in);
        System.out.print("Введите желаемое количество для производства: ");
        count = Input.nextInt();

        type = "Смартфон";
        String[] colors = new String[]{"Красный","Зеленый","Синий","Желтый","Черный","Белый"};
        String[] screenResolutions = new String[]{"720x480","1080x720","1920x1080"};
        String[] typeScreens = new String[]{"AMOLED","OLED","IPS"};

        for(int i=0 ; i<count; i++){

            if(Math.random()>0.5){
                preferenceOS = true;
            }else{
                preferenceOS = false;
            }

            dataRelease = (int)(Math.random()*((2022 - 2018))) + 2018;
            color = colors[(int)(Math.random()*colors.length)];
            screenResolution = screenResolutions[(int)(Math.random()*screenResolutions.length)];
            typeScreen = typeScreens[(int)(Math.random()*typeScreens.length)];

            if(preferenceOS == true){
                device = new Android_Phone(dataRelease, type, color, screenResolution, typeScreen);
            }else{
                device = new IPhone(dataRelease, type, color, screenResolution, typeScreen);
            }

            device.getDescription();
            System.out.println(device.getDescription());

        }
    }

}
