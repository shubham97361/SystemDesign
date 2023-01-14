package observers;

public class Internet implements UserCommunication{
    
    @Override
    public void update(Double interestRate) {

       System.out.println(String.format("Interest rate changed to - [%f] through internet", interestRate));
    }
}