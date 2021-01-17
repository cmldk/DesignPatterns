package Exercises2.state;

public class TestATMMachine {
    public static void main(String... args){
        //Create machine and set the current amount of money in the machine
        ATMMachine machine = ATMMachine.getInstance(9000);
        machine.insertCard("cardnumber");
        machine.insertPin("pin");
        machine.requestCash(3000);
        machine.ejectCard();

        System.out.println("\n");

        //it will reference to machine that is created first
        ATMMachine machine2 = ATMMachine.getInstance(20000);

        machine2.insertCard("cardnumber2");
        machine2.insertPin("pin2");
        machine2.requestCash(5000);
        machine2.requestCash(2000);
        machine2.requestCash(1000);
        machine2.ejectCard();


    }
}
