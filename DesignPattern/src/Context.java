/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */
public class Context {
        private PriceStrategy priceStrategy;
        private FRPStrategy frpstrategy;

        public Context(PriceStrategy priceStrategy, FRPStrategy frpstrategy){
            this.priceStrategy = priceStrategy;
            this.frpstrategy = frpstrategy;
        }

        public int executeFRP(int FRP){
            return frpstrategy.calcFRP(FRP);
        }
        public double executePrice(double price){
            return priceStrategy.calcPrice(price);
        }
    }

