package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu(){
        addItem("Breakfast","Egg, Cheese, Tea", false, 3);
        addItem("Waffles","Banana, Chocolate", true, 5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> iterator() {
        //return new PancakeMenuIterator<MenuItem>();
        return menuItems.iterator();
    }

    @Override
    public String getName() {
        return "Breakfast";
    }

    /*
    public class PancakeMenuIterator<T> implements Iterator<MenuItem> {

        int position = 0;
        @Override
        public boolean hasNext() {
            if((position >= menuItems.size()))
                return false;
            return true;
        }

        @Override
        public MenuItem next() {
            MenuItem item = menuItems.get(position);
            position++;
            return item;
        }
    }
     */
}
