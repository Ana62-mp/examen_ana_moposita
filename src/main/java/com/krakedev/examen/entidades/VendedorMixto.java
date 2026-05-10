package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula) {
		super(cedula);
	}

	@Override
	public double calcularSueldo() {
		return getSueldoFijo() + (getSueldoFijo() * 0.01 * getNumeroVentas());
	}

	@Override
	public String toString() {
		return "VendedorMixto [cedula=" + getCedula() + ", numeroVentas=" + getNumeroVentas() + ", sueldoFijo="
				+ getSueldoFijo() + ", comisionPorVenta=" + getComisionPorVenta() + "]";
	}
}