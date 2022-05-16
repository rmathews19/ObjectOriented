/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */
public  class RegularMoviePrice implements PriceStrategy {

    @Override
    public double calcPrice(double price)  {
        price+= 2;
        if (daysRented() > 2) {
            return price += (daysRented() - 2) * 1.5;
        }
        else{
            return price;
        }
    }

    @Override
    public int daysRented() {
        return 0;
    }
}