package structural.facade.internalSystem;

//low level access
public class PlumbingSystem{
    private String pressure;
    private String status;

    public void turnOn(){
        this.status = "On";
    }

    public void turnOff(){
        this.status = "Off";
    }

    public PlumbingSystem(PlumbingSystemBuilder builder) {
        this.pressure = builder.pressure;
        this.status = builder.status;
    }

    @Override
    public String toString() {
        return "PlumbingSystem{" +
                "pressure='" + pressure + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public static class PlumbingSystemBuilder{
        private String pressure;
        private String status;



        public PlumbingSystemBuilder setPressure(String pressure) {
            this.pressure = pressure;
            return this;
        }

        public PlumbingSystemBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public PlumbingSystem build(){
            return new PlumbingSystem(this);
        }
    }
}
