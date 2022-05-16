/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */
public class Rental {
    private Movie _movie;
    private int   _daysRented;
    
    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }

    double getAmount(double thisAmount) {
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:

                break;
            case Movie.NEW_RELEASE:

                break;
            case Movie.CHILDRENS:

                break;
        }
        return thisAmount;
    }
}