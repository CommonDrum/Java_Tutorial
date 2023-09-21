package Day20_09.Vehicles;

import java.time.LocalDate;

public abstract class FourWheeler extends Vehicle {
    private String tireType;
    private String driveType;

    FourWheeler(String tireTypeIN, String driveTypeIN, LocalDate yearIN, String colourIN){
        super(yearIN,colourIN);

        tireType = tireTypeIN;
        driveType = driveTypeIN;
    }

    public void setTireType(String newTireType){
        tireType = newTireType;
    }
}
