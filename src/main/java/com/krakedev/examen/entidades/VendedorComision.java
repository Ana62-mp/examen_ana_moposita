package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula, String tipo) {
		super(cedula, tipo);
	}

	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}

	@Override
	public String toString() {
		return "VendedorComision [cedula=" + getCedula() + ", tipo=" + getTipo() + ", numeroVentas=" + getNumeroVentas()
				+ ", sueldoFijo=" + getSueldoFijo() + ", comisionPorVenta=" + getComisionPorVenta() + "]";
	}
}