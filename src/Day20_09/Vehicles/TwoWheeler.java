package Day20_09.Vehicles;

import java.time.LocalDate;

public abstract class TwoWheeler extends Vehicle {
    private boolean hasRoof;

    TwoWheeler(boolean hasRoofIN, LocalDate yearIN, String colourIN) {
        super(yearIN, colourIN);
        this.hasRoof = hasRoofIN;
    }

    public boolean hasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }
}