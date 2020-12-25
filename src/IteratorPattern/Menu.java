package IteratorPattern;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> iterator();
    String getName();
}
