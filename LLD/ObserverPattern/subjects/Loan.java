package subjects;

import java.util.ArrayList;
import java.util.List;

import observers.UserCommunication;

public class Loan implements Bank {

    List<UserCommunication> users = new ArrayList<>();
    private String loanType;
    private double interestRate;

    public Loan(String loanType, double d) {
        this.loanType = loanType;
        this.interestRate = d;
    }

    @Override
    public void registerUser(UserCommunication user) {
        users.add(user);
    }

    @Override
    public void removeUser(UserCommunication user) {
       users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for(UserCommunication user : users) {
            user.update(interestRate);
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
        notifyUsers();
    }

    public String getLoanType() {
        return this.loanType;
    }
}
