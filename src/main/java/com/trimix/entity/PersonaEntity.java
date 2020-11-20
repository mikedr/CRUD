package com.trimix.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class PersonaEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long perId;
	
	@Column(name="perNombre")
	private String perNombre;
	
	@Column(name="perApellido")
	private String perApellido;
	
	@Column(name="perNumeroDocumento")
	private Long perNumeroDocumento;
	
	@Column(name="perTipoDocumento")
	private String perTipoDocumento;
	
	@Column(name="perFechaNacimiento")
	private Date perFechaNacimiento;
	
	public PersonaEntity() {
		
	}

	public long getPerId() {
		return perId;
	}

	public void setPerId(long perId) {
		this.perId = perId;
	}

	public String getPerNombre() {
		return perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public String getPerApellido() {
		return perApellido;
	}

	public void setPerApellido(String perApellido) {
		this.perApellido = perApellido;
	}

	public Long getPerNumeroDocumento() {
		return perNumeroDocumento;
	}

	public void setPerNumeroDocumento(Long perNumeroDocumento) {
		this.perNumeroDocumento = perNumeroDocumento;
	}

	public String getPerTipoDocumento() {
		return perTipoDocumento;
	}

	public void setPerTipoDocumento(String perTipoDocumento) {
		this.perTipoDocumento = perTipoDocumento;
	}

	public Date getPerFechaNacimiento() {
		return perFechaNacimiento;
	}

	public void setPerFechaNacimiento(Date perFechaNacimiento) {
		this.perFechaNacimiento = perFechaNacimiento;
	}
	
}
