package Day20_09.Vehicles;

import java.time.LocalDate;

public class Speeder extends TwoWheeler {

    public static void main(String[] args) {
        LocalDate productionDate = LocalDate.of(2023, 9, 21);
        Speeder speeder = new Speeder(150, true, false, productionDate, "Red");

        System.out.println("Horsepower: " + speeder.getHorsepower());
        System.out.println("Is for two people: " + speeder.isForTwoPeople());
        System.out.println("Has roof: " + speeder.hasRoof());
        System.out.println("Production year: " + speeder.getProductionYear());
        System.out.println("Colour: " + speeder.getColour());
    }
    private int horsepower;
    private boolean isForTwoPeople;

    Speeder(int horsepower, boolean isForTwoPeople, boolean hasRoofIN, LocalDate yearIN, String colourIN) {
        super(hasRoofIN, yearIN, colourIN);
        this.horsepower = horsepower;
        this.isForTwoPeople = isForTwoPeople;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isForTwoPeople() {
        return isForTwoPeople;
    }

    public void setForTwoPeople(boolean isForTwoPeople) {
        this.isForTwoPeople = isForTwoPeople;
    }
}
