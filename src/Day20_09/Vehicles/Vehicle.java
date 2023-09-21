package Day20_09.Vehicles;

import java.time.LocalDate;

public abstract class Vehicle {
    private LocalDate productionYear;
    private String colour;

    Vehicle(LocalDate productionYearIN, String colourIN){
        productionYear = productionYearIN;
        colour = colourIN;
    }


    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
