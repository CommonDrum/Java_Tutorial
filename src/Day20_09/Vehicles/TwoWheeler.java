package Day20_09.Vehicles;

import java.time.LocalDate;

public abstract class TwoWheeler extends Vehicle{
    boolean hasRoof;

    TwoWheeler(boolean hasRoofIN, LocalDate yearIN, String colourIN) {
        super(yearIN, colourIN);
        hasRoof = hasRoofIN;

    }
}
