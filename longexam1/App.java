public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations boracay = new Boracay();
        Locations zambales = new Zambales();
        Locations cebu = new Cebu();
        Locations elNido = new ElNido();
        Locations tokyo = new Tokyo();
        Locations vigan = new Vigan();

        Tourist tourist = new Me();

        boracay.accept(tourist);
        zambales.accept(tourist);
        cebu.accept(tourist);
        elNido.accept(tourist);
        tokyo.accept(tourist);
        vigan.accept(tourist);

    }
}
