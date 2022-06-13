package Lab3;

    public class Clean_Device_Decorator extends Device_Decorator{
        Clean_Device_Decorator(Abstract_Personal_Device device) {
        super(device);
    }

    @Override
    public String getDescription() {
        return body.getDescription() + "Аппарат исправен и ждет своего ползователя;).\n";
    }
}

