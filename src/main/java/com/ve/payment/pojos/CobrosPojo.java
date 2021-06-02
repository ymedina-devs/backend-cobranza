package com.ve.payment.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "clientes",schema = "public")
@Entity
@Getter
@Setter
public class CobrosPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cd_cliente")
	private int cdCliente;
	@Column(name="cd_empresa")
	private int cdEmpresa;
	@Column(name="mt_cobro")
	private Double mtCobro;
	@Column(name="tx_error")
	private String txError;
	@Column(name="st_cobro")
	private int stCobro;
	@Column(name="tx_referencia1")
	private String txReferencia1;
	@Column(name="tx_referencia2")
	private String txReferencia2;
	@Column(name="tx_referencia3")
	private String txReferencia3;
	@Column(name="tx_referencia_nu1")
	private int txReferenciaNu1; 
	@Column(name="tx_referencia_nu2")
	private int txReferenciaNu2;
	@Column(name="cd_consecutivo_archivo")
	private int cdConsecutivoArchivo;
	@Column(name="fe_registro")
	private Date feRegistro;
	@Column(name="fe_cobro")
	private Date feCobro;
}
