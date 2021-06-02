package com.ve.payment.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneracionCobrosPojo {
	private Double mtCobro;
	private String txError;
	private int stCobro;
	private String txReferencia1;
	private String txReferencia2;
	private String txReferencia3;
	private int txReferenciaNu1; 
	private int txReferenciaNu2;
	private int cdConsecutivoEmpresa;
	private String tpDocumento;
	private String txDocumento;
	private String txRazonsocial;
	private String txCorreo;
	private String txTelefono;
	private String txCuenta;
	private int cdBanco;
}