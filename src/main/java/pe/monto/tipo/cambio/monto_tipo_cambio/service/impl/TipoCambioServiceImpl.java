package pe.monto.tipo.cambio.monto_tipo_cambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.monto.tipo.cambio.monto_tipo_cambio.dto.ResponseDto;
import pe.monto.tipo.cambio.monto_tipo_cambio.entity.TipoCambioEntity;
import pe.monto.tipo.cambio.monto_tipo_cambio.exception.UnprocessableEntityException;
import pe.monto.tipo.cambio.monto_tipo_cambio.repository.TipoCambioRepository;
import pe.monto.tipo.cambio.monto_tipo_cambio.response.TipCambCabResponse;
import pe.monto.tipo.cambio.monto_tipo_cambio.response.TipCambMsgResponse;
import pe.monto.tipo.cambio.monto_tipo_cambio.service.TipoCambioService;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {

	@Autowired
	private TipoCambioRepository tipoCambioRepos;

	@Override
	public TipCambMsgResponse consultParaTipCambio(long monto, String monedaOrig, String monedaDest)
			throws UnprocessableEntityException {

		try {

			TipoCambioEntity tipCambioEntity = tipoCambioRepos.findTcambio(monedaOrig,monedaDest);
			String sOperador = tipCambioEntity.getOperadorDestino();
			long lTipoCambioDestino = tipCambioEntity.getTipoCambioDestino();
			long lTipoCambioOrigen = tipCambioEntity.getTipoCambioOrigen();

			ResponseDto responseDto = new ResponseDto();
			responseDto.setMontoOrigen(monto);
			responseDto.setTipoCambioOrigen(lTipoCambioOrigen);
			responseDto.setMonedaOrigen(monedaOrig);
			responseDto.setMonedaDestino(tipCambioEntity.getMonedaDestino());
			if(sOperador.trim().equals("DIVISION")) {
				responseDto.setMontoAplicandoTipoCambioDestino(monto / lTipoCambioOrigen);
			}
			else if(sOperador.trim().equals("MULTIPLICACION")) {
				responseDto.setMontoAplicandoTipoCambioDestino(monto * lTipoCambioOrigen);
			}
			
			TipCambCabResponse tipCambCabResponse = new TipCambCabResponse();
			tipCambCabResponse.setCodigo(200);
			tipCambCabResponse.setMsgError("Exito");

			TipCambMsgResponse tipCambMsgResponse = new TipCambMsgResponse();
			tipCambMsgResponse.setCabResponse(tipCambCabResponse);
			tipCambMsgResponse.setResponseDto(responseDto);
			tipCambMsgResponse.setMensaje("Se Calculo el Monto a otra moneda");

			return tipCambMsgResponse;
		} catch (Exception e) {
			ResponseDto responseDto = new ResponseDto();
			responseDto.setMontoOrigen(monto);
			responseDto.setTipoCambioOrigen(0);
			responseDto.setMonedaOrigen(monedaOrig);
			responseDto.setMonedaDestino(monedaDest);
			responseDto.setMontoAplicandoTipoCambioDestino(0);

			TipCambCabResponse tipCambCabResponse = new TipCambCabResponse();
			tipCambCabResponse.setCodigo(500);
			tipCambCabResponse.setMsgError(e.getMessage());

			TipCambMsgResponse tipCambMsgResponse = new TipCambMsgResponse();
			tipCambMsgResponse.setCabResponse(tipCambCabResponse);
			tipCambMsgResponse.setResponseDto(responseDto);
			tipCambMsgResponse.setMensaje("No se Calculo el Monto a otra moneda");

			return tipCambMsgResponse;
		}

	}

}
