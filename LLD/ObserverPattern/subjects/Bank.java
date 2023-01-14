package subjects;

import observers.UserCommunication;

/**
 * Common interface to register, remove and notify users.
 */
public interface Bank {
    
    public void registerUser(UserCommunication user);

    public void removeUser(UserCommunication user);

    public void notifyUsers();
}
