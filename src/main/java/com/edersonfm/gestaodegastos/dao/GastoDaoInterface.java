package com.edersonfm.gestaodegastos.dao;

import java.util.Optional;

import com.edersonfm.gestaodegastos.model.Gasto;

public interface GastoDaoInterface{
	
	void save(Gasto gasto);
	
	Gasto findAll(Integer codigoUsuario);
}
