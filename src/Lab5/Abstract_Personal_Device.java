package Lab5;

public class Abstract_Personal_Device implements Show_Description {

    public int dataRelease;
    public String type, color;
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

    public int getDataRelease() {
        return dataRelease;
    }

    public void setDataRelease(int dataRelease) {
        this.dataRelease = dataRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getDescription(){
//        String Description = "Класс, представляющий из себя персоональное устройство вышедшее в: " +
//                dataRelease +" году, цвет ("+ color +") и типом ("+ type +"). \n";
//        return Description;
//    }

    @Override
    public String getDescription() {
        Abstract_Personal_Device device = createDevice();
        return device.getDescription();
    }

    public Abstract_Personal_Device createDevice() {
        return null;
    }

}


