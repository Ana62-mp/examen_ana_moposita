package com.krakedev.examen.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen.entidades.Vendedor;

@Service
public class AdminVentas {
	private ArrayList<Vendedor> vendedores;

	public AdminVentas() {
		vendedores = new ArrayList<Vendedor>();
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	} 

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public void agregar(Vendedor vendedor) {
		for (Vendedor ven : vendedores) {
			if (ven.getCedula().equals(vendedor.getCedula())) {
				return;
			}
		}
		vendedores.add(vendedor);
	}

	public Double calcularSueldo(String cedula) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCedula().equals(cedula)) {
				return vendedor.calcularSueldo();
			}
		}
		return null;
	}
	
	public ArrayList<Vendedor> listarVendedores() {
		return vendedores;
	}
}