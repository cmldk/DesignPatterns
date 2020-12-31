package CompositePattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;
        Iterator itr = (Iterator) stack.peek();
        if (!itr.hasNext()){
            stack.pop();
            return hasNext();
        }else {
            return true;
        }
        return true;
    }

    @Override
    public Object next() {
        return null;
    }
}
