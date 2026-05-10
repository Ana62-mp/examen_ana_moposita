package com.krakedev.examen.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.services.AdminVentas;

@RequestMapping("/vendedores")
@RestController
public class VendedorController {

	private final AdminVentas adminVentas;

	public VendedorController(AdminVentas adminVentas) {
		super();
		this.adminVentas = adminVentas;
	}

	@PostMapping
	public void agregarVendedor(@RequestBody Vendedor vendedor) {
		Vendedor vendedorNuevo = null;

		if ("V".equals(vendedor.getTipo())) {
			vendedorNuevo = new Vendedor(vendedor.getCedula(), vendedor.getTipo());
		} else if ("C".equals(vendedor.getTipo())) {
			vendedorNuevo = new VendedorComision(vendedor.getCedula(), vendedor.getTipo());
		} else if ("M".equals(vendedor.getTipo())) {
			vendedorNuevo = new VendedorMixto(vendedor.getCedula(), vendedor.getTipo());
		}

		if (vendedorNuevo != null) {
			vendedorNuevo.setNumeroVentas(vendedor.getNumeroVentas());
			vendedorNuevo.setSueldoFijo(vendedor.getSueldoFijo());
			vendedorNuevo.setComisionPorVenta(vendedor.getComisionPorVenta());

			adminVentas.agregar(vendedorNuevo);
		}
	}

	@GetMapping("/{cedula}")
	public Double calcularSueldoVendedor(@PathVariable String cedula) {
		return adminVentas.calcularSueldo(cedula);
	}
	
	@GetMapping
	public ArrayList<Vendedor> listarVendedores() {
		return adminVentas.listarVendedores();
	}
}