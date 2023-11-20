package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinancingTests {

    @Test
    public void shouldCreateObjectWithCorrectDataWhenDataIsValid() {
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;

        Financing financing = FinancingFactory.createFinancing(totalAmount, income, months);

        assertEquals(totalAmount, financing.getTotalAmount());
        assertEquals(income, financing.getIncome());
        assertEquals(months, financing.getMonths());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDataIsInvalid() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createFinancing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {
        Financing financing = FinancingFactory.createFinancing(100000.0, 2000.0, 80);

        financing.setTotalAmount(90000.0);

        assertEquals(90000.0, financing.getTotalAmount());
    }
}
