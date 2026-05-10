package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorComision;

public class VendedorComisionTest {

	@Test
	public void validarCalcularSueldoVendedorComision() {
		// Arrange
		VendedorComision vendedor = new VendedorComision("1723456789", "C");
		vendedor.setNumeroVentas(5);
		vendedor.setComisionPorVenta(20.0);
		
		// Act
		double sueldoCalculado = vendedor.calcularSueldo();
		
		// Assert
		assertEquals(100.0, sueldoCalculado, 0.001);
	}
}