package Lab6;

class Mobile_Phone extends Abstract_Personal_Device {
    public String screenResolution, typeScreen;

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getTypeScreen() {
        return typeScreen;
    }

    public void setTypeScreen(String typeScreen) {
        this.typeScreen = typeScreen;
    }

    public Mobile_Phone(){
        type = "Смартфон";
        String[] colors = new String[]{"Красный","Зеленый","Синий","Желтый","Черный","Белый"};
        String[] screenResolutions = new String[]{"720x480","1080x720","1920x1080"};
        String[] typeScreens = new String[]{"AMOLED","OLED","IPS"};
        String[] typesOS = new String[]{"Android 6.0","Android 7.0","Android 8.0", "Android 9.0"};

        dataRelease = (int)(Math.random()*((2022 - 2018))) + 2018;
        color = colors[(int)(Math.random()*colors.length)];
        screenResolution = screenResolutions[(int)(Math.random()*screenResolutions.length)];
        typeScreen = typeScreens[(int)(Math.random()*typeScreens.length)];
    }

    public Abstract_Personal_Device createDevice(){
        return this;
    }


}
