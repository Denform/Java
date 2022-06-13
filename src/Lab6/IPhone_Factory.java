package Lab6;

public class IPhone_Factory implements Device_Factory{
    @Override
    public Mobile_Phone createDevice() {
        return new IPhone();
    }
}
