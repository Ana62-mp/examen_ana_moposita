package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.Vendedor;

public class VendedorTest {

	@Test
	public void validarCalcularSueldoVendedor() {
		// Arrange
		Vendedor vendedor = new Vendedor("1723456789", "V");
		vendedor.setSueldoFijo(500.0);

		// Act
		double sueldoCalculado = vendedor.calcularSueldo();

		// Assert
		assertEquals(500.0, sueldoCalculado, 0.001);
	}
}