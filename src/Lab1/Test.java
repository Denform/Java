package Lab1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        int dataRelease, count;
        String type, color, screenResolution, typeScreen, typeOS;

        Scanner Input = new Scanner(System.in);
        count = Input.nextInt();
        Abstract_Personal_Device[] arrayDevice = new Abstract_Personal_Device[count];

        type = "Смартфон";
        String[] colors = new String[]{"Красный","Зеленый","Синий","Желтый","Черный","Белый"};
        String[] screenResolutions = new String[]{"720x480","1080x720","1920x1080"};
        String[] typeScreens = new String[]{"AMOLED","OLED","IPS"};
        String[] typesOS = new String[]{"Android 6.0","Android 7.0","Android 8.0", "Android 9.0"};

        for(int i=0;i<arrayDevice.length;i++){

            dataRelease = (int)(Math.random()*((2022 - 2018))) + 2018;
            color = colors[(int)(Math.random()*colors.length)];
            screenResolution = screenResolutions[(int)(Math.random()*screenResolutions.length)];
            typeScreen = typeScreens[(int)(Math.random()*typeScreens.length)];
            typeOS = typesOS[(int)(Math.random()*typesOS.length)];

            arrayDevice[i] = new Android_Phone(dataRelease, type, color, screenResolution, typeScreen, typeOS);
        }
        // Цикл для вывода массива
        for(int i = 0; i < arrayDevice.length ; i++){

            System.out.println(arrayDevice[i].getDescription());
        }

        Input.close();
    }

}
