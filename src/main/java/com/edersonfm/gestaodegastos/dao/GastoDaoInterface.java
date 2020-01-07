package com.edersonfm.gestaodegastos.dao;

import java.util.Map;

import com.edersonfm.gestaodegastos.model.Gasto;

public interface GastoDaoInterface{
	
	void save(Gasto gasto);
	
	Gasto findById(String codigoUsuario);
	
	Map<String, Gasto> findAll();
}
