package TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{

    protected void brew() {
        System.out.println("Steeping tea bag");
    }
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    protected void hook(){
        System.out.println("A step");
        System.out.println("Another step");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    protected String getUserInput() {
        String answer = null;

        System.out.println("Would you like lemon with your tea (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException ex){
            System.err.println("IO error trying to read answer");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
