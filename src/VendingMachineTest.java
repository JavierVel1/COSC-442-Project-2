import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class VendingMachineTest {

    @Test
    void testAddItem() {
        // Arrange
        VendingMachine vend = new VendingMachine();
        VendingMachineItem item = new VendingMachineItem("Chips", 4); 
        //Act
        vend.addItem(item, "A");
        //assert
        assertEquals("Chips", vend.getItem("A").getName());
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
