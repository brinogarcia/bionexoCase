package com.BionexoApi.bionexo.entitie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ubs {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	@Column
	private String vlr_latitude;
	@Column
	private String vlr_longitude;
	@Column
	private String cod_munic;
	@Column
	private String cod_cnes;
	@Column
	private String nom_estab;
	@Column
	private String dsc_endereco;
	@Column
	private String dsc_bairro;
	@Column
	private String dsc_cidade;
	@Column
	private String dsc_telefone;
	@Column
	private String dsc_estrut_fisic_ambiencia;
	@Column
	private String dsc_adap_defic_fisic_idosos;
	@Column
	private String dsc_equipamentos;
	@Column
	private String dsc_medicamentos;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVlr_latitude() {
		return vlr_latitude;
	}
	public void setVlr_latitude(String vlr_latitude) {
		this.vlr_latitude = vlr_latitude;
	}
	public String getVlr_longitude() {
		return vlr_longitude;
	}
	public void setVlr_longitude(String vlr_longitude) {
		this.vlr_longitude = vlr_longitude;
	}
	public String getCod_munic() {
		return cod_munic;
	}
	public void setCod_munic(String cod_munic) {
		this.cod_munic = cod_munic;
	}
	public String getCod_cnes() {
		return cod_cnes;
	}
	public void setCod_cnes(String cod_cnes) {
		this.cod_cnes = cod_cnes;
	}
	public String getNom_estab() {
		return nom_estab;
	}
	public void setNom_estab(String nom_estab) {
		this.nom_estab = nom_estab;
	}
	public String getDsc_endereco() {
		return dsc_endereco;
	}
	public void setDsc_endereco(String dsc_endereco) {
		this.dsc_endereco = dsc_endereco;
	}
	public String getDsc_bairro() {
		return dsc_bairro;
	}
	public void setDsc_bairro(String dsc_bairro) {
		this.dsc_bairro = dsc_bairro;
	}
	public String getDsc_cidade() {
		return dsc_cidade;
	}
	public void setDsc_cidade(String dsc_cidade) {
		this.dsc_cidade = dsc_cidade;
	}
	public String getDsc_telefone() {
		return dsc_telefone;
	}
	public void setDsc_telefone(String dsc_telefone) {
		this.dsc_telefone = dsc_telefone;
	}
	public String getDsc_estrut_fisic_ambiencia() {
		return dsc_estrut_fisic_ambiencia;
	}
	public void setDsc_estrut_fisic_ambiencia(String dsc_estrut_fisic_ambiencia) {
		this.dsc_estrut_fisic_ambiencia = dsc_estrut_fisic_ambiencia;
	}
	public String getDsc_adap_defic_fisic_idosos() {
		return dsc_adap_defic_fisic_idosos;
	}
	public void setDsc_adap_defic_fisic_idosos(String dsc_adap_defic_fisic_idosos) {
		this.dsc_adap_defic_fisic_idosos = dsc_adap_defic_fisic_idosos;
	}
	public String getDsc_equipamentos() {
		return dsc_equipamentos;
	}
	public void setDsc_equipamentos(String dsc_equipamentos) {
		this.dsc_equipamentos = dsc_equipamentos;
	}
	public String getDsc_medicamentos() {
		return dsc_medicamentos;
	}
	public void setDsc_medicamentos(String dsc_medicamentos) {
		this.dsc_medicamentos = dsc_medicamentos;
	}
	public Ubs(String vlr_latitude, String vlr_longitude, String cod_munic, String cod_cnes, String nom_estab,
			String dsc_endereco, String dsc_bairro, String dsc_cidade, String dsc_telefone,
			String dsc_estrut_fisic_ambiencia, String dsc_adap_defic_fisic_idosos, String dsc_equipamentos,
			String dsc_medicamentos) {
		this.vlr_latitude = vlr_latitude;
		this.vlr_longitude = vlr_longitude;
		this.cod_munic = cod_munic;
		this.cod_cnes = cod_cnes;
		this.nom_estab = nom_estab;
		this.dsc_endereco = dsc_endereco;
		this.dsc_bairro = dsc_bairro;
		this.dsc_cidade = dsc_cidade;
		this.dsc_telefone = dsc_telefone;
		this.dsc_estrut_fisic_ambiencia = dsc_estrut_fisic_ambiencia;
		this.dsc_adap_defic_fisic_idosos = dsc_adap_defic_fisic_idosos;
		this.dsc_equipamentos = dsc_equipamentos;
		this.dsc_medicamentos = dsc_medicamentos;
	}
	public Ubs() {

	}
	
}
