package takeaway.challenge.java;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuTest {
    @Test public void testMenuFirstItem() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsKey("piza"), true);
    }

    @Test public void testMenuSecondItem() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsKey("pasta"), true);
    }

    @Test public void testMenuThirdItem() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsKey("salad"), true);
    }

    @Test public void testMenuFirstItemPrice() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsValue(10), true);
    }

    @Test public void testMenuSecondItemPrice() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsValue(8), true);
    }

    @Test public void testMenuThirdItemPrice() {
        Menu menuTest = new Menu();
        assertEquals(menuTest.menu.containsValue(5), true);
    }
    
}
