package com.trimix.model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Persona {
	
	private long perId;
	
	@NotBlank(message="Ingresar nombre")
	@Pattern(regexp="^[A-Za-z \\s\\-]*$",message="Nombre invalido")
	private String perNombre;
	
	@NotBlank(message="Ingresar apellido")
	@Pattern(regexp="^[A-Za-z \\s\\-]*$",message="Apellido invalido")
	private String perApellido;
	
	@NotNull(message="Ingresar número de documento")
//	@Digits(fraction = 0, integer = 8)
	@Min(value=1000000, message="Documento invalido")
    @Max(value=99999999, message="Documento invalido")
	private Long perNumeroDocumento;
	
	@NotBlank(message="Ingresar tipo de documento")
	private String perTipoDocumento;
	
	@NotNull(message="Ingresar fecha de nacimiento")
	@Past(message="No se puede agregar una persona que no nació aún")
	@DateTimeFormat(pattern="dd/MM/yyyy")
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
