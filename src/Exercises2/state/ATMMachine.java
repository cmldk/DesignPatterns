package Exercises2.state;

public class ATMMachine {

    private volatile static ATMMachine atmMachine;

    public static ATMMachine getInstance(int amount){
        if (atmMachine == null){
            synchronized (ATMMachine.class) {
                if (atmMachine == null){
                    atmMachine = new ATMMachine(amount);
                }
            }
        }
        return atmMachine;
    }

    int currentAmount;

    State noCardState;
    State hasCardState;
    State hasCorrectPinState;
    State outOfMoneyState;
    State state;

    public ATMMachine(int currentAmount) {
        this.currentAmount = currentAmount;

        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        hasCorrectPinState = new HasCorrectPinState(this);
        outOfMoneyState = new OutOfMoneyState(this);

        state = noCardState;

    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void insertCard(String cardnumber) {
        state.insertCard(cardnumber);
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void insertPin(String pin) {
        state.insertPin(pin);
    }

    public void requestCash(int amount) {
        state.requestCash(amount);
    }
}
