package com.ve.payments.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ve.payment.pojos.ClientesPojo;
import com.ve.payment.pojos.CobrosPojo;
import com.ve.payment.pojos.GeneracionCobrosPojo;
import com.ve.payments.repos.ClientesRepo;
import com.ve.payments.repos.CobrosRepo;

@Service
public class GeneracionCobros {
	@Autowired
	ClientesRepo clientesRepo;
	@Autowired
	CobrosRepo cobrosRepo;
	
	public List<GeneracionCobrosPojo> funcGenerarCobros(List <GeneracionCobrosPojo> paramCobros,int paramIdEmpresa){
		List <GeneracionCobrosPojo> varCobros=new ArrayList<GeneracionCobrosPojo>();
		try {
			for (GeneracionCobrosPojo generacionCobros : varCobros) {
				ClientesPojo varClientesPojo= new ClientesPojo();
				CobrosPojo varCobrosPojo=new CobrosPojo();
				ClientesPojo varValidacionClientes=clientesRepo.funcChequearCliente(generacionCobros.getTxDocumento());
				if(varValidacionClientes==null) {
					varClientesPojo.setCdBanco(generacionCobros.getCdBanco());
					varClientesPojo.setFeRegistro(new Date());
					varClientesPojo.setTpDocumento(generacionCobros.getTpDocumento());
					varClientesPojo.setTxDocumento(generacionCobros.getTxDocumento());
					varClientesPojo.setCdBanco(generacionCobros.getCdBanco());
					varClientesPojo.setTxCuenta(generacionCobros.getTxCuenta());
					varClientesPojo.setTxRazonsocial(generacionCobros.getTxRazonsocial());
					varClientesPojo.setTxCorreo(generacionCobros.getTxCorreo());
					varClientesPojo.setTxTelefono(generacionCobros.getTxTelefono());
					varClientesPojo.setStRegistro(1);
					varClientesPojo.setCdEmpesa(8);
					varValidacionClientes=clientesRepo.save(varClientesPojo);
					varCobrosPojo.setCdCliente(varValidacionClientes.getId());
					varCobrosPojo.setCdEmpresa(8);
					varCobrosPojo.setFeRegistro(new Date());
					varCobrosPojo.setTxError("");
					varCobrosPojo.setStCobro(1);
					varCobrosPojo.setMtCobro(generacionCobros.getMtCobro());
					varCobrosPojo.setTxReferencia1(generacionCobros.getTxReferencia1());
					varCobrosPojo.setTxReferencia2(generacionCobros.getTxReferencia2());
					varCobrosPojo.setTxReferencia3(generacionCobros.getTxReferencia3());
					varCobrosPojo.setTxReferenciaNu1(generacionCobros.getTxReferenciaNu1());
					varCobrosPojo.setTxReferenciaNu2(generacionCobros.getTxReferenciaNu2());
					varCobrosPojo.setCdConsecutivoArchivo(generacionCobros.getCdConsecutivoEmpresa());
				}else {
					if(
					cobrosRepo.funcChequearCliente(paramIdEmpresa,generacionCobros.getTxReferenciaNu1())==null) {
						varCobrosPojo.setCdCliente(varValidacionClientes.getId());
						varCobrosPojo.setCdEmpresa(8);
						varCobrosPojo.setFeRegistro(new Date());
						varCobrosPojo.setTxError("");
						varCobrosPojo.setStCobro(1);
						varCobrosPojo.setMtCobro(generacionCobros.getMtCobro());
						varCobrosPojo.setTxReferencia1(generacionCobros.getTxReferencia1());
						varCobrosPojo.setTxReferencia2(generacionCobros.getTxReferencia2());
						varCobrosPojo.setTxReferencia3(generacionCobros.getTxReferencia3());
						varCobrosPojo.setTxReferenciaNu1(generacionCobros.getTxReferenciaNu1());
						varCobrosPojo.setTxReferenciaNu2(generacionCobros.getTxReferenciaNu2());
						varCobrosPojo.setCdConsecutivoArchivo(generacionCobros.getCdConsecutivoEmpresa());
					}else {
						System.out.println("El cobro existe en nuestra base de datos.");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return varCobros;
	}
}
