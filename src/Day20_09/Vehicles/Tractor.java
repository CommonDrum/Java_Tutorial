package Day20_09.Vehicles;

import java.time.LocalDate;

public class Tractor extends FourWheeler{

    int size;

    Tractor(int sizeIN, String tireTypeIN, String driveTypeIN, LocalDate yearIN, String colourIN) {
        super(tireTypeIN, driveTypeIN, yearIN, colourIN);
        size = sizeIN;
    }
}
