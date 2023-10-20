package pe.monto.tipo.cambio.monto_tipo_cambio.service;

import org.springframework.web.bind.annotation.PathVariable;

import pe.monto.tipo.cambio.monto_tipo_cambio.exception.UnprocessableEntityException;
import pe.monto.tipo.cambio.monto_tipo_cambio.response.TipCambMsgResponse;

public interface TipoCambioService {

	TipCambMsgResponse consultParaTipCambio(long monto, @PathVariable String monedaOrig,
			@PathVariable String monedaDest) throws UnprocessableEntityException;

}
