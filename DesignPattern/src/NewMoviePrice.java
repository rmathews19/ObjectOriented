/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */

public  class NewMoviePrice implements PriceStrategy {

    @Override
    public double calcPrice(double price) {
        price = (daysRented() * 3);
            return price;
    }

    @Override
    public int daysRented() {
        return 0;
    }
}