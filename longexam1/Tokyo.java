public class Tokyo implements Locations {

    int airFare = 6533;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
