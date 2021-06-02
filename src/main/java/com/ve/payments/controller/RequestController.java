package com.ve.payments.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ve.payment.pojos.GeneracionCobrosPojo;

@RestController
@RequestMapping("api.generar.cobros")
public class RequestController {
	@PostMapping("generarCobros")
	public ResponseEntity<List<GeneracionCobrosPojo>> funcGenerarCobros(List<GeneracionCobrosPojo> paramCobros,int paramCdEmpresa, int nuConsecutivo){
		List<GeneracionCobrosPojo> varRetorno=new ArrayList<GeneracionCobrosPojo>;
		return ResponseEntity<List<GeneracionCobrosPojo>>. ;
	}
}
