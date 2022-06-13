package Lab3;

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


    @Override
    public String getDescription(){
        String description = super.getDescription();
        description += "Данное устройство является мобильным телефоном. \n";

        return description;
    }

}
