package com.edersonfm.gestaodegastos.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edersonfm.gestaodegastos.dao.GastoDaoInterface;
import com.edersonfm.gestaodegastos.model.Gasto;

@Service
public class GastoService {

	private static final Logger log = LoggerFactory.getLogger(GastoService.class);

	@Autowired
	GastoDaoInterface gastoDao;

	public void insertGasto(Gasto gasto) {

		gastoDao.save(gasto);
	}

//	public Optional<Gasto> findByDate(String date) {
//
//		try {
//
//			return gastoDao.findById(date);
//
//		} catch (Exception e) {
//			log.error(e.getMessage());
//		}
//		return null;
//
//	}
//
//	public Optional<Gasto> findById(String codigoUsuario) {
//
//		try {
//
//			return gastoDao.findById(codigoUsuario);
//
//		} catch (Exception e) {
//			log.error(e.getMessage());
//		}
//		return null;
//
//	}

}
