package com.krakedev.examen.test;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.services.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		AdminVentas adminVentas = new AdminVentas();

		Vendedor vendedor = new Vendedor("0101", "V");
		vendedor.setSueldoFijo(500.0);
		vendedor.setNumeroVentas(5);
		vendedor.setComisionPorVenta(20.0);

		VendedorComision vendedorComision = new VendedorComision("0202", "C");
		vendedorComision.setNumeroVentas(10);
		vendedorComision.setComisionPorVenta(25.0);
		vendedorComision.setSueldoFijo(0.0);

		VendedorMixto vendedorMixto = new VendedorMixto("0303", "M");
		vendedorMixto.setSueldoFijo(600.0);
		vendedorMixto.setNumeroVentas(8);
		vendedorMixto.setComisionPorVenta(0.0);

		adminVentas.agregar(vendedor);
		adminVentas.agregar(vendedorComision);
		adminVentas.agregar(vendedorMixto);

		System.out.println("Sueldo vendedor normal: " + adminVentas.calcularSueldo("0101"));
		System.out.println("Sueldo vendedor por comision: " + adminVentas.calcularSueldo("0202"));
		System.out.println("Sueldo vendedor mixto: " + adminVentas.calcularSueldo("0303"));
		System.out.println("Sueldo cedula inexistente: " + adminVentas.calcularSueldo("9999"));
	}
}