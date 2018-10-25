package deqo.mcab.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    @Before //fixture
    public void setUp (){
        item=new Item (0);
    }
    @Test
    public void getId() {
        assertEquals("getId doit donner id",0,item.getId());
    }

    @Test
    public void setId() {
        item.setId(4);
        assertEquals("setId doit modifier Id",4,item.getId());

    }
}