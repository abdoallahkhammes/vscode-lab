package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {
    OrderProcessor processor = new OrderProcessor();

    @Test
    void testNonMember() {
        Order order = new Order(
            new Customer("Ali", false),
            List.of(new Item("Book", 20.0, 2), new Item("Pen", 5.0, 3))
        );
        assertEquals(55.0, processor.printOrderSummary(order), 0.001);
    }

    @Test
    void testMemberGetsDiscount() {
        Order order = new Order(
            new Customer("Sara", true),
            List.of(new Item("Laptop", 1000.0, 1))
        );
        assertEquals(900.0, processor.printOrderSummary(order), 0.001);
    }
}
