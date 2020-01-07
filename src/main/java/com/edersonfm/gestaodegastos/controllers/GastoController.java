package com.edersonfm.gestaodegastos.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edersonfm.gestaodegastos.model.Gasto;
import com.edersonfm.gestaodegastos.services.GastoService;

@RestController
@RequestMapping("/gestao")
public class GastoController {

	@Autowired
	GastoService gastoService;

	@PostMapping("/integracao")
	public void insertGasto(@RequestBody Gasto gasto) {

		gastoService.insertGasto(gasto);
	}

	@GetMapping("/listagem/{codigoUsuario}")
	public @ResponseBody Gasto findById(@PathVariable("codigoUsuario") String codigoUsuario) {

		return gastoService.findById(codigoUsuario);
	}

	@GetMapping("/gastos")
	@ResponseBody
	public Map<String, Gasto> findByDate() {

		return gastoService.findAll();
	}

}
