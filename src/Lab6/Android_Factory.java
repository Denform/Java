package Lab6;

public class Android_Factory implements Device_Factory{
    @Override
    public Mobile_Phone createDevice() {
        return new Android_Phone();
    }
}
