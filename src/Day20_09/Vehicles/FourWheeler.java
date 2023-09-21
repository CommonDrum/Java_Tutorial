package Day20_09.Vehicles;

import java.time.LocalDate;

public abstract class FourWheeler extends Vehicle {
    private String tireType;
    private String driveType;

    FourWheeler(String tireTypeIN, String driveTypeIN, LocalDate yearIN, String colourIN) {
        super(yearIN, colourIN);
        tireType = tireTypeIN;
        driveType = driveTypeIN;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String newTireType) {
        tireType = newTireType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String newDriveType) {
        driveType = newDriveType;
    }
}
