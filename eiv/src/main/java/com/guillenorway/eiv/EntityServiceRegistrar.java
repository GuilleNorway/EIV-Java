package com.guillenorway.eiv;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guillenorway.eiv.edm.resources.PaisEdm;
import com.sdl.odata.api.ODataException;
import com.sdl.odata.api.edm.registry.ODataEdmRegistry;

@Component
public class EntityServiceRegistrar {

	public static final String NAME_SPACE = "com.guillenorway";
	
	public static final String CONTAINER_NAME = "eiv";
	
	@Autowired
	private ODataEdmRegistry oDataEdmRegistry = null;
	
	@PostConstruct
	public void registerEntities() throws ODataException {
		oDataEdmRegistry.registerClasses(
				Arrays.asList(
						PaisEdm.class
				)
		);
	}
	
}
