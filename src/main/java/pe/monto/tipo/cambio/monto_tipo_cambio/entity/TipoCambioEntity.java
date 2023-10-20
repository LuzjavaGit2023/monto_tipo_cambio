package pe.monto.tipo.cambio.monto_tipo_cambio.entity;

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


@Table(name="TIPOCAMBIO")
@Entity
public class TipoCambioEntity  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_TIPOCAMB")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_TIPOCAMB")
	private long idTipoCambio ;

	@Column(name="MONEDORIGEN")
	 private String   monedaOrigen ;
	
	@Column(name="TIPOCAMBIOORIGEN")
	 private long   tipoCambioOrigen ;
	
	@Column(name="MONEDDESTINO")
	private String monedaDestino;
	
	@Column(name="TIPOCAMBIODESTINO")
	private long tipoCambioDestino;
	
	@Column(name="OPERADORDESTINO")
	private String operadorDestino;

	@Column(name="FECREGISTRO")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	 private LocalDateTime  fecRegistroTipoCamb ;

	public long getIdTipoCambio() {
		return idTipoCambio;
	}

	public void setIdTipoCambio(long idTipoCambio) {
		this.idTipoCambio = idTipoCambio;
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

	public long getTipoCambioDestino() {
		return tipoCambioDestino;
	}

	public void setTipoCambioDestino(long tipoCambioDestino) {
		this.tipoCambioDestino = tipoCambioDestino;
	}

	public String getOperadorDestino() {
		return operadorDestino;
	}

	public void setOperadorDestino(String operadorDestino) {
		this.operadorDestino = operadorDestino;
	}

	public LocalDateTime getFecRegistroTipoCamb() {
		return fecRegistroTipoCamb;
	}

	public void setFecRegistroTipoCamb(LocalDateTime fecRegistroTipoCamb) {
		this.fecRegistroTipoCamb = fecRegistroTipoCamb;
	}

	@Override
	public String toString() {
		return "MascotaEntity [idTipoCambio=" + idTipoCambio + ", monedaOrigen=" + monedaOrigen + ", tipoCambioOrigen="
				+ tipoCambioOrigen + ", monedaDestino=" + monedaDestino + ", tipoCambioDestino=" + tipoCambioDestino
				+ ", operadorDestino=" + operadorDestino + ", fecRegistroTipoCamb=" + fecRegistroTipoCamb + "]";
	}


	   
	

	
	 
	
	
	 
}
