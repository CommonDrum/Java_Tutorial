package Day20_09.Vehicles;

import java.time.LocalDate;

public class SportVehicle extends FourWheeler {
    private boolean isChickMagnet;

    SportVehicle(boolean isChickMagnetIN, String tireTypeIN, String driveTypeIN, LocalDate yearIN, String colourIN) {
        super(tireTypeIN, driveTypeIN, yearIN, colourIN);
        isChickMagnet = isChickMagnetIN;
    }

    public boolean getIsChickMagnet() {
        return isChickMagnet;
    }
}
