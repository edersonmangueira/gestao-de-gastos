package com.edersonfm.gestaodegastos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.edersonfm.gestaodegastos.model.Gasto;
import com.edersonfm.gestaodegastos.services.GastoService;

@Controller
public class GastoController {

	@Autowired
	GastoService gastoService;

	@PostMapping("/integracao")
	public void insertGasto(@RequestBody Gasto gasto) {

		gastoService.insertGasto(gasto);
	}

	
//	  @GetMapping("/listagem/{codigoUsuario}") public @ResponseBody Optional<Gasto>
//	  findById(@PathVariable("codigoUsuario") String codigoUsuario) {
//	  
//	  return gastoService.findByDate(codigoUsuario); }
//	  
//	  @GetMapping("/find-by-date/{date}") public @ResponseBody Optional<Gasto>
//	  findByDate(@PathVariable("date") String date) {
//	  
//	  return gastoService.findByDate(date);
//	  
//	  }
	 

}
