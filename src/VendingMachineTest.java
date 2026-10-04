import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class VendingMachineTest {

    @Test
    void testAddItemEmptySlot() {
        // Arrange
        VendingMachine vend = new VendingMachine();
        VendingMachineItem item = new VendingMachineItem("Chips", 4); 
        VendingMachineItem item2 = new VendingMachineItem("Cookie", 3); 
        //Act
        vend.addItem(item, "A");
        vend.addItem(item2, "B");
        //assert
        assertEquals("Chips", vend.getItem("A").getName());
        assertEquals(4, vend.getItem("A").getPrice(), 0.0001); 
        assertEquals("Cookie", vend.getItem("B").getName()); 
        assertEquals(3, vend.getItem("B").getPrice(), 0.0001); 
    }

    @Test
    void testAddItemFilledSlot() {
        // Arrange
        VendingMachine vend = new VendingMachine();
        VendingMachineItem item = new VendingMachineItem("Chips", 4); 
        VendingMachineItem item2 = new VendingMachineItem("Cookie", 3); 
        //Act
        vend.addItem(item, "A");
        //assert
        assertThrows(VendingMachineException.class, () -> vend.addItem(item2, "A"));
    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }
}
