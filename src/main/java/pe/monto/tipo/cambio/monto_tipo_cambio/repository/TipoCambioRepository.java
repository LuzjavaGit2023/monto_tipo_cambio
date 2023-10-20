package pe.monto.tipo.cambio.monto_tipo_cambio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.monto.tipo.cambio.monto_tipo_cambio.entity.TipoCambioEntity;
import org.springframework.data.repository.query.Param;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambioEntity,Long>{
		
	@Query("Select t from TipoCambioEntity t where t.monedaOrigen=:modorigen and t.monedaDestino=:moddestino")
	TipoCambioEntity findTcambio(@Param("modorigen") String modorigen, @Param("moddestino") String moddestino);
	
//	@Query("Select t from TipoCambioEntity t where upper(t.monedaOrigen) like :modorigen and upper(t.monedaDestino) like :moddestino")
//	TipoCambioEntity findTcambio(@Param("modorigen") String modorigen, @Param("moddestino") String moddestino);
	
	@Query("update TipoCambioEntity t set t.tipoCambioOrigen=:tipCambio where t.monedaOrigen=:modorigen")
	TipoCambioEntity actTipCambioRep(@Param("modorigen") String modorigen, @Param("tipCambio") long tipCambio);
	
}
