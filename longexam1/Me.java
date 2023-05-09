public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        checkBudget();
        if (budget < boracay.airFare) {
            System.out.println("In another life!! kulang pera ko");

        } else {
            budget = budget - boracay.airFare;
            System.out.println("Finally!! I visited Bora");        
        } checkBudget();
    }
    public void visit(Zambales zambales) {
        if (budget < zambales.airFare) {
         System.out.println("In another life!! kulang pera ko");
         } else {budget = budget - zambales.airFare;
         System.out.println("Dream come true!! I visited the New Zealand of the Philippines");
         } checkBudget();
    }
    public void visit(Cebu cebu) {
        if (budget < cebu.airFare) {
            System.out.println("In another life!! kulang pera ko");
           
         } else { 
            budget = budget - cebu.airFare;
            System.out.println("I went to visit Magellan's Cross");
         } checkBudget();
    }
    public void visit(ElNido elNido) {
        
        if (budget < elNido.airFare) {
            System.out.println("In another life!! kulang pera ko");
         } else {
            budget = budget - elNido.airFare;
            System.out.println("I went to El Nido");
         } checkBudget();
    }
    public void visit(Tokyo tokyo) {
       
        if (budget < tokyo.airFare) {
            System.out.println("In another life!! kulang pera ko");
         } else {
            budget = budget - tokyo.airFare;
            System.out.println("Finding Zoro");
         } checkBudget();
    }
    public void visit(Vigan vigan) {
        if (budget < vigan.airFare) {
            System.out.println("In another life!! kulang pera ko");
         } else {
            budget = budget - vigan.airFare;
            System.out.println("i went to Vigan Heritage Site");
         } checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
