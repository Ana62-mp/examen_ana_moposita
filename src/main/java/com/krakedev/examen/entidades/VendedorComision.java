package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula) {
		super(cedula);
	}

	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}

	@Override
	public String toString() {
		return "VendedorComision [cedula=" + getCedula() + ", numeroVentas=" + getNumeroVentas() + ", sueldoFijo="
				+ getSueldoFijo() + ", comisionPorVenta=" + getComisionPorVenta() + "]";
	}
}