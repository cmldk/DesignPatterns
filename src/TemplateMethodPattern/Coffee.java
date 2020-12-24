package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage{

    protected void brew() {
        System.out.println("Brewing coffee grinds");
    }

    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
