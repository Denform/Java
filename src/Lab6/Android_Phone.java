package Lab6;

class Android_Phone extends Mobile_Phone {

    public Android_Phone(){
        super();
    }

    public Abstract_Personal_Device createDevice(){
        return this;
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

