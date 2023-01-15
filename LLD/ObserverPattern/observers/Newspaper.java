package observers;

public class Newspaper implements UserCommunication {

    @Override
    public void update(Double interestRate) {
       System.out.println(String.format("Interest rate changed to - [%f] through newspaper", interestRate));
  
    }
    
}
