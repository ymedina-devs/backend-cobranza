package com.ve.payments.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ve.payment.pojos.CobrosPojo;

public interface CobrosRepo extends JpaRepository<CobrosPojo, Integer>{
	@Query(value = "select u from cobros u where u.id_cliente=?1 and u.tx_referencia_nu1!=?2 and u.st_cobro=1",nativeQuery = true)
	public CobrosPojo funcChequearCliente(int paramIdCliente,int paramTxReferencia);
	
}
