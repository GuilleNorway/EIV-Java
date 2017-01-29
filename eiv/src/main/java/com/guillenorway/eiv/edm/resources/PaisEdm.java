package com.guillenorway.eiv.edm.resources;

import com.guillenorway.eiv.EntityServiceRegistrar;
import com.guillenorway.eiv.entities.PaisEntity;
import com.sdl.odata.api.edm.annotations.EdmEntity;
import com.sdl.odata.api.edm.annotations.EdmEntitySet;
import com.sdl.odata.api.edm.annotations.EdmProperty;

@EdmEntity (name="Pais", key="Id", namespace = EntityServiceRegistrar.NAME_SPACE, containerName = EntityServiceRegistrar.CONTAINER_NAME)
@EdmEntitySet("Paises")
public class PaisEdm {
	
	@EdmProperty(name="Id", nullable = false)
	private Integer id = null;
	
	@EdmProperty(name="Nombre", nullable = false, maxLength = 100)
	private String nombre = null;
	
	@EdmProperty(name="Prefijo", nullable = true)
	private Integer prefijo = null;

	public PaisEdm() {
		super();
	}

	public PaisEdm(Integer id, String nombre, Integer prefijo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.prefijo = prefijo;
	}
	
	public PaisEdm(PaisEntity paisEntity){
		this(paisEntity.getIdPais(), paisEntity.getNombre(), paisEntity.getPrefijo());
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final Integer getPrefijo() {
		return prefijo;
	}

	public final void setPrefijo(Integer prefijo) {
		this.prefijo = prefijo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PaisEdm other = (PaisEdm) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
