package TemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {
    protected final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
        hook();
    }

    protected void hook(){

    }

    protected void boilWater() {
        System.out.println("Boiling the water");
    }

    protected final void pourInCup() {
        System.out.println("Pouring in cup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected abstract boolean customerWantsCondiments();
}
