package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorMixto;

public class VendedorMixtoTest {

	@Test
	public void validarCalcularSueldoVendedorMixto() {
		// Arrange
		VendedorMixto vendedor = new VendedorMixto("1723456789", "M");
		vendedor.setSueldoFijo(500.0);
		vendedor.setNumeroVentas(4);
		
		// Act
		double sueldoCalculado = vendedor.calcularSueldo();
		
		// Assert
		assertEquals(520.0, sueldoCalculado, 0.001);
	}
}