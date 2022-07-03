package tests.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		Financing fin = FinancingFactory.createValidFinancing();
		
		assertEquals(100000.0, fin.getTotalAmount());
		assertEquals(2000.0, fin.getIncome());
		assertEquals(80, fin.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createInvalidFinancing();
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenValidData() {
		//arrange
		Financing fin = FinancingFactory.createValidFinancing();
		
		//action
		fin.setTotalAmount(80000.0);
		
		//assert
		assertEquals(80000.0, fin.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setTotalAmount(500000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		//arrange
		Financing fin = FinancingFactory.createValidFinancing();
		
		//action
		fin.setIncome(3000.0);
		
		//assert
		assertEquals(3000.0, fin.getIncome());
		
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setIncome(1999.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenValidData() {
		//arrange
		Financing fin = FinancingFactory.createValidFinancing();
		
		//action
		fin.setMonths(90);
		
		//assert
		assertEquals(90, fin.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setMonths(70);
		});
	}
	
	@Test
	public void entryShouldCaluculateCorrectly() {
		//arrange
		double expectedValue = 20000.0;
		Financing fin = FinancingFactory.createValidFinancing();
		
		assertEquals(expectedValue, fin.entry());
		
	}
	
	@Test
	public void quotaShouldCaluculateCorrectly() {
		//arrange
		double expectedValue = 1000.0;
		Financing fin = FinancingFactory.createValidFinancing();
		
		assertEquals(expectedValue, fin.quota());
		
	}
	
}
