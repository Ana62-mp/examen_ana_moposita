package com.krakedev.examen.test;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("1723456789", "V");

		vendedor.setNumeroVentas(5);
		vendedor.setSueldoFijo(500.0);
		vendedor.setComisionPorVenta(20.0);

		System.out.println(vendedor);
	}
}