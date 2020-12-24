package TemplateMethodPattern;

public class Tea extends CaffeineBeverage{

    //no more changes with final
    /*protected void prepareRecipe(){
        System.out.println("Algorithm overridden");
    }*/

    protected void brew() {
        System.out.println("Steeping tea bag");
    }
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    /*protected void pourInCup(){
        System.out.println("Pouring in to the cup in a different way");
    }*/

    protected void hook(){
        System.out.println("A step");
        System.out.println("Another step");
    }
}
