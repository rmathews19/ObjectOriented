/**
 * Group Project member
 * Wesley Axline WJA200000
 * Christian Thomas CXT180023
 * Reevan Mathews RXM180076
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context = new Context(new RegularMoviePrice(), new RegularMovieFRP());
        System.out.println(context.executePrice(0));
        System.out.println(context.executeFRP(0));

        Context context1 = new Context(new ChildrensMoviePrice(),new ChildrensMovieFRP());
        System.out.println(context1.executePrice(0));
        System.out.println(context1.executeFRP(0));

        Context context2 = new Context(new NewMoviePrice(),new NewMovieFRP());
        System.out.println(context2.executePrice(0));
        System.out.println(context2.executeFRP(0));



    }
}
