package com.edersonfm.gestaodegastos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edersonfm.gestaodegastos.model.Gasto;
import com.edersonfm.gestaodegastos.services.GastoService;

public class GastoController {
	
    @Autowired GastoService gastoService;
    
    @PostMapping("/integracao")
    public @ResponseBody void insertGasto(Gasto gasto) {
           
           gastoService.insertGasto(gasto);
    }
    
    @GetMapping("/listagem/{codigoUsuario}")
    public  @ResponseBody Optional<Gasto> findById(@PathVariable("codigoUsuario") String codigoUsuario) {
           
            return  gastoService.findByDate(codigoUsuario);
    }
    
    @GetMapping("/find-by-date/{date}")
    public  @ResponseBody Optional<Gasto> findByDate(@PathVariable("date") String date) {
           
            return  gastoService.findByDate(date);
           
    }

}
