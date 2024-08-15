package structural.facade;

import structural.facade.internalSystem.ElectricalSystem;
import structural.facade.internalSystem.PlumbingSystem;

public class House {
    private PlumbingSystem plumbingSystem;
    private ElectricalSystem electricalSystem;

    public House() {
        this.plumbingSystem = new PlumbingSystem.PlumbingSystemBuilder()
                .setPressure("999")
                .setStatus("Off")
                .build();
        this.electricalSystem = new ElectricalSystem.ElectricalSystemBuilder()
                .setVoltage("220")
                .setStatus("Off")
                .build();
    }

    public void turnOnHouse(){
        this.plumbingSystem.turnOn();
        this.electricalSystem.turnOn();
    }

    public void turnOffHouse(){
        this.plumbingSystem.turnOff();
        this.electricalSystem.turnOff();
    }


    @Override
    public String toString() {
        return "House{" +
                "plumbingSystem=" + plumbingSystem +
                ", electricalSystem=" + electricalSystem +
                '}';
    }
}
