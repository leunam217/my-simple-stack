package deqo.mcab.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SimpleStack implements ISimpleStack {
    private List<Item>  items;

    public SimpleStack() {
        this.items = new ArrayList<Item>() {
        };
    }

    @Override
    public boolean isEmpty(){return items.isEmpty();}

    public int getSize() {
        return items.size();
    }

    public void push(Item item){items.add(item);}

    public Item peek() throws EmptyStackException {
        if (isEmpty() )  throw  new EmptyStackException ();
        return items.get(items.size()-1);
    }

    public  Item pop () throws EmptyStackException {
        if (isEmpty() )  throw  new EmptyStackException ();
        return items.remove(items.size()-1);
    }
}
