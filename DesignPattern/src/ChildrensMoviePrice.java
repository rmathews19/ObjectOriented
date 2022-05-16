/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */

public class ChildrensMoviePrice implements PriceStrategy {

    @Override
    public double calcPrice(double price)  {
        price+= 1.5;
        if (daysRented() > 3) {
            return price += (daysRented() - 3) * 1.5;
        }
        else{
            return price;
        }
    }
    public int daysRented() {
        return 0;
    }


}

