package Lab1;

public class Abstract_Personal_Device{

    public int dataRelease;
    public String type, color;

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

    public String getDescription(){
        String Description = "Класс, представляющий из себя персоональное устройство вышедшее в: " +
                dataRelease +" году, цвет ("+ color +") и типом ("+ type +"). \n";
        return Description;
    }

}

