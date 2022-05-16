/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */

public class NewMovieFRP implements FRPStrategy {
    public int calcFRP(int FRP) {
        FRP += 1;
        if (daysRented()>1) {
            FRP++;
        }
        return FRP;
    }

    @Override
    public int daysRented() {
        return 2;
    }
}