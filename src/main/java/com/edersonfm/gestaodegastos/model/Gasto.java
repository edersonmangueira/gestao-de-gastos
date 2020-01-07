package com.edersonfm.gestaodegastos.model;

import java.io.Serializable;

import com.edersonfm.gestaodegastos.model.enuns.TipoGasto;

public class Gasto implements Serializable{
	
	String codigoUsuario;
//	String id;
	String dataGasto;
	TipoGasto tipoGasto;
	String descricao;
	double valor;

	
	public Gasto(
//			String id, 
			String dataGasto, TipoGasto tipoGasto, String descricao, 
			double valor,
			String codigoUsuario) {
		super();
//		this.id = id;
		this.codigoUsuario = codigoUsuario;		
		this.dataGasto = dataGasto;
		this.tipoGasto = tipoGasto;
		this.descricao = descricao;
		this.valor = valor;

	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public String getDataGasto() {
		return dataGasto;
	}
	public void setDataGasto(String dataGasto) {
		this.dataGasto = dataGasto;
	}
	public TipoGasto getTipoGasto() {
		return tipoGasto;
	}
	public void setTipoGasto(TipoGasto tipoGasto) {
		this.tipoGasto = tipoGasto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	@Override
	public String toString() {
		return "Gasto [ "
//				+ "id=" + id + ", "
				+ "dataGasto=" + dataGasto + ", tipoGasto=" + tipoGasto + ", descricao=" + descricao
				+ ", valor=" + valor + ", "
						+ "codigoUsuario=" + codigoUsuario + "]";
	}
	
}
