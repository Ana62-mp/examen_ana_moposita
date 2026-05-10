package com.krakedev.examen.entidades;

public class Vendedor {
	private String cedula;
	private String tipo;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;

	public Vendedor(String cedula, String tipo) {
		super();
		this.cedula = cedula;
		this.tipo = tipo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}

	public double calcularSueldo() {
		return sueldoFijo;
	}

	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", tipo=" + tipo + ", numeroVentas=" + numeroVentas + ", sueldoFijo="
				+ sueldoFijo + ", comisionPorVenta=" + comisionPorVenta + "]";
	}
}