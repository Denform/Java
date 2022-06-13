package Lab1;

class Android_Phone extends Mobile_Phone{

    public String typeOS;

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public Android_Phone(int dataRelease, String type, String color, String screen_Resolution, String typeScreen, String typeOS){
        this.dataRelease = dataRelease;
        this.type = type;
        this.color = color;
        this.screenResolution = screen_Resolution;
        this.typeScreen = typeScreen;
        this.typeOS = typeOS;
    }

    @Override
    public String getDescription(){
        String description = super.getDescription();
        description += "Разрешение экрана: " + screenResolution + ". Тип экрана: " + typeScreen +
                    ". Тип операционной системы: " + typeOS + "\n";
        return description;
    }
}
