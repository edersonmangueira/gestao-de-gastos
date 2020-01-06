package com.edersonfm.gestaodegastos.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.edersonfm.gestaodegastos.model.Gasto;

@Repository
public class GastoDaoImpl implements GastoDaoInterface {

	private RedisTemplate<String, Gasto> redisTemplate;

	private HashOperations hashOperations;

	@Autowired
	public GastoDaoImpl(RedisTemplate<String, Gasto> redisTemplate) {
		this.redisTemplate = redisTemplate;

		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(Gasto gasto) {

		hashOperations.put("GASTO", gasto.getCodigoUsuario(), gasto);
	}
	
	@Override
	public Gasto findAll(Integer codigoUsuario) {
		
		return (Gasto) hashOperations.get("GASTO", codigoUsuario);
		
	}

}
