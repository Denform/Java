package Lab5;


class Android_Phone extends Abstract_Personal_Device {

    public String typeOS;

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public Android_Phone(int dataRelease, String type, String color, String screen_Resolution, String typeScreen){
        this.dataRelease = dataRelease;
        this.type = type;
        this.color = color;
        this.screenResolution = screen_Resolution;
        this.typeScreen = typeScreen;
    }

    public Abstract_Personal_Device createDevice(){
        return new Android_Phone(dataRelease, type, color, screenResolution, typeScreen);
    }

    @Override
    public String getDescription(){
        String description = "";
        description+="Класс, представляющий из себя персоональное устройство вышедшее в: " +
                     dataRelease +" году, цвет ("+ color +") и типом ("+ type +"). \n" +
                     "Разрешение экрана: " + screenResolution + ". Тип экрана: " + typeScreen +
                     ". Тип операционной системы: " + "\n" + "Данное устройство является Андроид смартфоном. \n";
        return description;
    }
}

