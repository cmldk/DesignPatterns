package TemplateMethodPattern;

public class Test {
    public static void main(String... args){
        System.out.println("----Tea Recipe----");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n----Coffee Recipe----");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n----Tea Recipe With Hook----");
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();

        System.out.println("\n----Coffee Recipe With Hook----");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
