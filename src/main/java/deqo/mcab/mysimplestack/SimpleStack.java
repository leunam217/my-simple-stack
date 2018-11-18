package deqo.mcab.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Implements ISImpleStack
 */
public class SimpleStack implements ISimpleStack {
    private List<Item> items;

    /**
     * constructor
     */
    public SimpleStack() {
        this.items = new ArrayList<Item>() {
        };
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * @return
     */
    @Override
    public int getSize() {
        return items.size();
    }

    /**
     * @param item
     */
    @Override
    public void push(Item item) {
        items.add(item);
    }

    /**
     * @return
     * @throws EmptyStackException
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return items.get(items.size() - 1);
    }

    /**
     * @return
     * @throws EmptyStackException
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return items.remove(items.size() - 1);
    }
}
