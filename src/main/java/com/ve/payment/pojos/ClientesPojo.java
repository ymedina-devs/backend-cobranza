package com.ve.payment.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Table(name = "clientes",schema = "public")
@Entity
@Getter
@Setter
public class ClientesPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "tp_documento")
	private String tpDocumento;
	@Column(name = "tx_documento")
	private String txDocumento;
	@Column(name = "tx_razonsocial")
	private String txRazonsocial;
	@Column(name = "txCorreo")
	private String txCorreo;
	@Column(name = "tx_telefono")
	private String txTelefono;
	@Column(name = "tx_cuenta")
	private String txCuenta;
	@Column(name = "cdBanco")
	private int cdBanco;
	@Column(name = "cd_empesa")
	private int cdEmpesa;
	@Column(name = "st_registro")
	private int stRegistro;
	@Column(name = "fe_registro")
	private Date feRegistro;
}
