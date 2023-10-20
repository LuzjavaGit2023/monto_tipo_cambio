package pe.monto.tipo.cambio.monto_tipo_cambio.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.monto.tipo.cambio.monto_tipo_cambio.exception.UnprocessableEntityException;
import pe.monto.tipo.cambio.monto_tipo_cambio.response.TipCambMsgResponse;
import pe.monto.tipo.cambio.monto_tipo_cambio.service.TipoCambioService;

@RestController
@RequestMapping("/retorna")
public class AtencionMascotaController {

	@Autowired
	private TipoCambioService tipoCambioService;

	@GetMapping("otramoneda/{monto}/{monedaOrig}/{monedaDest}")
	public ResponseEntity<TipCambMsgResponse> cambioMoneda(@PathVariable long monto, @PathVariable String monedaOrig,
			@PathVariable String monedaDest) throws UnprocessableEntityException {
		return new ResponseEntity<>(tipoCambioService.consultParaTipCambio(monto, monedaOrig, monedaDest),
				HttpStatus.OK);
	}

}
