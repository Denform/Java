package Lab5;


class IPhone extends Abstract_Personal_Device {

    public IPhone(int dataRelease, String type, String color, String screen_Resolution, String typeScreen){
        this.dataRelease = dataRelease;
        this.type = type;
        this.color = color;
        this.screenResolution = screen_Resolution;
        this.typeScreen = typeScreen;
    }

    public Abstract_Personal_Device createDevice(){
        return new IPhone(dataRelease, type, color, screenResolution, typeScreen);
    }

    @Override
    public String getDescription(){
        String description = "";
        description+="Класс, представляющий из себя персоональное устройство вышедшее в: " +
                     dataRelease +" году, цвет ("+ color +") и типом ("+ type +"). \n" +
                     "Разрешение экрана: " + screenResolution + ". Тип экрана: " + typeScreen +
                     ". Тип операционной системы: " + "\n" + "Данное устройство является Айфоном. \n";
        return description;
    }
}

