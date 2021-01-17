package Exercises2.iterator;

import java.util.Iterator;

public class ItemRepository {
    private String[][] items = {{"item1", "item2", "item3", "item4"},
            {"item5", "item6", "item6.5"},
            {"item7", "item8", "item9", "item10"}};

    public Iterator getIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator {

        int position = 0;
        int inner_position = 0;

        @Override
        public boolean hasNext() {
            if (inner_position >= items[position].length) {
                position++;
                inner_position = 0;
            }
            if(position >= items.length){
                return false;
            }
            return true;
        }

        @Override
        public String next() {
            String item = items[position][inner_position];
            inner_position++;
            return item;
        }
    }

    public static void main(String... args){
        ItemRepository rep = new ItemRepository();
        Iterator itr = rep.getIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
