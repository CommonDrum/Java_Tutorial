package Day20_09.Vehicles;

import java.time.LocalDate;

public class Bike extends TwoWheeler {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020, 1, 8);
        Bike bike = new Bike(false,"nice",false,date,"black");

        Bike.ride(100);
    }
    boolean hasFlappers;
    String bikeType;

    Bike(boolean hasFlappersIN, String bikeTypeIn, boolean hasRoofIN, LocalDate yearIN, String colourIN) {
        super(hasRoofIN, yearIN, colourIN);

        hasFlappers = hasFlappersIN;
        bikeType = bikeTypeIn;
    }

    public static void ride(int kilometers) {
        System.out.println("You have ridden " + kilometers + " km!");
    }

    public boolean getHasFlappers(){
        return hasFlappers;
    }

    public String getBikeType(){
        return bikeType;
    }

    public void setHasFlappers(boolean hasFlappersIN){
        hasFlappers = hasFlappersIN;
    }

    public void setBikeType(String setBikeTypeIN){
        bikeType = setBikeTypeIN;
    }

}
