package Exercises2.state;

public interface State {
    void insertCard(String cardnumber);
    void ejectCard();
    void insertPin(String pin);
    void requestCash(int amount);
}
