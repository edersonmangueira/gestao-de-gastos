package com.edersonfm.gestaodegastos.dao;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.edersonfm.gestaodegastos.model.Gasto;

@Repository
public class GastoDaoImpl implements GastoDaoInterface{

	private RedisTemplate<String, Gasto> redisTemplate;
	
	private HashOperations hashOperations;
	
	public GastoDaoImpl(RedisTemplate<String, Gasto> redisTemplate) {
		this.redisTemplate = redisTemplate;
		
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(Gasto gasto) {
		
		hashOperations.put("GASTO", gasto.getId(), gasto);
	}

}
