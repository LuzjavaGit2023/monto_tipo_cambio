package pe.monto.tipo.cambio.monto_tipo_cambio.utilitarios;

public interface ErrorCodeMessage {

	int getCodigo();
	String getMensaje();

	default String getMensaje(Object[] args) {
		return String.format(getMensaje(), (Object[]) args);
	}

}
