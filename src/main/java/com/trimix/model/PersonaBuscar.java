package com.trimix.model;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class PersonaBuscar {
	
	@Pattern(regexp="^[A-Za-z \\s\\-]*$",message="Nombre invalido")
	private String perNombre;
	
	private String perTipoDocumento;
	
	public PersonaBuscar(String perNombre, String perTipoDocumento) {
		super();
		this.perNombre = perNombre;
		this.perTipoDocumento = perTipoDocumento;
	}
	

	public String getPerNombre() {
		return perNombre;
	}



	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}



	public String getPerTipoDocumento() {
		return perTipoDocumento;
	}



	public void setPerTipoDocumento(String perTipoDocumento) {
		this.perTipoDocumento = perTipoDocumento;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perNombre == null) ? 0 : perNombre.hashCode());
		result = prime * result + ((perTipoDocumento == null) ? 0 : perTipoDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaBuscar other = (PersonaBuscar) obj;
		if (perNombre == null) {
			if (other.perNombre != null)
				return false;
		} else if (!perNombre.equals(other.perNombre))
			return false;
		if (perTipoDocumento == null) {
			if (other.perTipoDocumento != null)
				return false;
		} else if (!perTipoDocumento.equals(other.perTipoDocumento))
			return false;
		return true;
	}
}
