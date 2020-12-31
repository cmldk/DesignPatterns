package CompositePattern;

public class TestWaitress {
    public static void main(String... args){

        MenuComponent pancakeHouseMenu = new Menu("Breakfast", "Breakfast Description");
        pancakeHouseMenu.add(new MenuItem("Breakfast","Egg, Cheese, Tea", false, 3));
        pancakeHouseMenu.add(new MenuItem("Waffles","Banana, Chocolate", true, 5));

        MenuComponent dinerMenu = new Menu("Diner Menu", "Diner Menu description");
        dinerMenu.add(new MenuItem("Soup","Tomato", true, 4));
        dinerMenu.add(new MenuItem("Hotdog","Meat, Onion", false, 6));
        dinerMenu.add(new MenuItem("Hotdog","Meat, Onion", false, 6));

        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert Menu description");
        dessertMenu.add(new MenuItem("Baklava","wallnut", true, 10));
        dessertMenu.add(new MenuItem("Pudding","milk", true, 7));

        dinerMenu.add(dessertMenu);

        MenuComponent topMenu = new Menu("Top Menu", "");
        topMenu.add(pancakeHouseMenu);
        topMenu.add(dinerMenu);

        Waitress w = new Waitress(topMenu);
        w.printMenu();
    }
}
