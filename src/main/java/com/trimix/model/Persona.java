package com.trimix.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Persona {
	
	private long perId;
	@NotBlank(message="Ingresar nombre")
	private String perNombre;
	@NotBlank(message="Ingresar apellido")
	private String perApellido;
	@NotNull(message="Ingresar número de documento")
	private Long perNumeroDocumento;
	@NotBlank(message="Ingresar tipo de documento")
	private String perTipoDocumento;
	@NotNull(message="Ingresar fecha de nacimiento")
	private Date perFechaNacimiento;
	
	public Persona(long perId, String perNombre, String perApellido, Long perNumeroDocumento, String perTipoDocumento,
			Date perFechaNacimiento) {
		super();
		this.perId = perId;
		this.perNombre = perNombre;
		this.perApellido = perApellido;
		this.perNumeroDocumento = perNumeroDocumento;
		this.perTipoDocumento = perTipoDocumento;
		this.perFechaNacimiento = perFechaNacimiento;
	}
	
	public Persona() {
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
