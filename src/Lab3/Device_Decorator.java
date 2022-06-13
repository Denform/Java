package Lab3;

    public class Device_Decorator implements Show_Description{
    protected  Abstract_Personal_Device body;

        Device_Decorator(Abstract_Personal_Device device){
        this.body =device;
    }

    @Override
    public String getDescription() {
        return body.getDescription();
    }

}
