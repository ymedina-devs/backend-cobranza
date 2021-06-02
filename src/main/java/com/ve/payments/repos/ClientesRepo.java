package com.ve.payments.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ve.payment.pojos.ClientesPojo;
import com.ve.payments.services.GeneracionCobros;

@Repository
public interface ClientesRepo extends JpaRepository<ClientesPojo, Integer> {
	@Query(value = "select u from clientes u where u.nu_documento=?1",nativeQuery = true)
	public ClientesPojo funcChequearCliente(String paramNuDocumento);
}
