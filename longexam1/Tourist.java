interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Zambales batanes);
    void visit(Cebu cebu);
    void visit(ElNido elNido);
    void visit(Vigan vigan);
    void visit(Tokyo tokyo);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
