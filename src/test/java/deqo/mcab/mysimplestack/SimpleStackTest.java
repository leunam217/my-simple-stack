package deqo.mcab.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {
    private SimpleStack stack;
    private  Item item;
    @Before //fixture
    public void setUp (){
        stack=new SimpleStack();
        item=new Item(0);
    }
    @Test
    public void isEmpty() {
        assertTrue("une pile au début est vide",stack.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("quand la pile est vide la taille est 0",0,stack.getSize());
        stack.push(item);
        assertEquals("quand on ajoute un element la taille doit augmenter de 1",1,stack.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void peek1() {
        stack.peek();
    }
    @Test
    public void testpush_peek2() {
        stack.push(item);
        assertEquals("peek(push item,empty)=item",stack.peek().getId(),item.getId());
    }

    @Test(expected = EmptyStackException.class)
    public void pop1() {
        stack.pop();
    }

    @Test
    public void pop2() {
        stack.push(item);
        assertEquals("pop(push(item,p))=item ",item.getId(),stack.pop().getId());
        assertTrue("apres pop(push(item,p)) nouvelle p =p",stack.isEmpty());
    }
}