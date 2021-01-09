package StatePattern;

public class GumballMachine {

    /*
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
     */

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state;
    int count;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();

        /*
        if (state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("Quarter has been inserted!");
        }else if (state == SOLD_OUT) {
            System.out.println("Out of Gumball, Can not accept quarter");
        }else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
         */
    }

    public void ejectQuarter() {
        state.ejectQuarter();
        /*
        if (state == HAS_QUARTER){
            state = NO_QUARTER;
            System.out.println("Quarter returned");
        }else if (state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        }else if (state == SOLD_OUT) {
            System.out.println("You haven't inserted a quarter");
        }else if (state == SOLD) {
            System.out.println("You are too late");
        }
         */
    }

    public void turnCrank() {
        state.turnCrank();
        dispense();

        /*
        if (state == HAS_QUARTER){
            state = SOLD;
            System.out.println("You turned crunk");
        }else if (state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        }else if (state == SOLD_OUT) {
            System.out.println("You haven't inserted a quarter, and there is no gumball");
        }else if (state == SOLD) {
            System.out.println("You have already turned the crunk");
        }
         */
    }

    public void dispense() {
        state.dispense();

        /*
        if (state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }else if (state == NO_QUARTER){
            System.out.println("You have to pay first");
        }else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        }else if (state == SOLD) {
            System.out.println("A gumball is rolling out");
            count--;
            if( count == 0) {
                state = SOLD_OUT;
                System.out.println("Out of gumballs");
            }else {
                state = NO_QUARTER;
            }
        }
         */
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball is rolling out");
        count--;
    }

    public int getCount() {
        return count;
    }
}
