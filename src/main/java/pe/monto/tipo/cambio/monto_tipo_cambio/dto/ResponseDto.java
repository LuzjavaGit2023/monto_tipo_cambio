package pe.monto.tipo.cambio.monto_tipo_cambio.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;


public class ResponseDto  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	private long montoOrigen ;
	 private String   monedaOrigen ;
	 private long   tipoCambioOrigen ;
	private String monedaDestino;
	private long montoAplicandoTipoCambioDestino;
	
	public long getMontoOrigen() {
		return montoOrigen;
	}
	public void setMontoOrigen(long montoOrigen) {
		this.montoOrigen = montoOrigen;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public long getTipoCambioOrigen() {
		return tipoCambioOrigen;
	}
	public void setTipoCambioOrigen(long tipoCambioOrigen) {
		this.tipoCambioOrigen = tipoCambioOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public long getMontoAplicandoTipoCambioDestino() {
		return montoAplicandoTipoCambioDestino;
	}
	public void setMontoAplicandoTipoCambioDestino(long montoAplicandoTipoCambioDestino) {
		this.montoAplicandoTipoCambioDestino = montoAplicandoTipoCambioDestino;
	}

	

	   
	

	
	 
	
	
	 
}
