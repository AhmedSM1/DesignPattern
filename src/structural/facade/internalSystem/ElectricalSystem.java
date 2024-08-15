package structural.facade.internalSystem;

//low level access
public class ElectricalSystem{
    private String voltage;
    private String status;

    public ElectricalSystem(ElectricalSystemBuilder builder) {
        this.voltage = builder.voltage;
        this.status = builder.status;
    }

    public void turnOn(){
         this.status = "On";
    }

    public void turnOff(){
        this.status = "Off";
    }

    @Override
    public String toString() {
        return "ElectricalSystem{" +
                "voltage='" + voltage + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static class ElectricalSystemBuilder {
        private String voltage;
        private String status;


        public ElectricalSystemBuilder setVoltage(String voltage) {
            this.voltage = voltage;
            return this;
        }

        public ElectricalSystemBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public ElectricalSystem build() {
            return new ElectricalSystem(this);
        }
    }
}
