import observers.Internet;
import observers.Newspaper;
import subjects.Loan;

public class Main {

    public static void main(String[] args) {
        
        Newspaper newspaper = new Newspaper();
        Internet internet = new Internet();

        Loan houseLoan = new Loan("HomeLoan", 7.5);
        
        houseLoan.registerUser(newspaper);
        houseLoan.registerUser(internet);

        System.out.println(houseLoan.getInterestRate());

        houseLoan.setInterestRate(8.0);

    }
}