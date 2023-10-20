package pe.monto.tipo.cambio.monto_tipo_cambio.response;

import pe.monto.tipo.cambio.monto_tipo_cambio.dto.ResponseDto;
import pe.monto.tipo.cambio.monto_tipo_cambio.dto.TipoCambioDto;

public class TipCambMsgResponse {

	private TipCambCabResponse cabResponse;
	private ResponseDto responseDto;
	private String mensaje;
	
	public TipCambCabResponse getCabResponse() {
		return cabResponse;
	}
	public void setCabResponse(TipCambCabResponse cabResponse) {
		this.cabResponse = cabResponse;
	}
	public ResponseDto getResponseDto() {
		return responseDto;
	}
	public void setResponseDto(ResponseDto responseDto) {
		this.responseDto = responseDto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

	
	
	

	
	

	
	
	
}
