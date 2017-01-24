package com.guillenorway.eiv.datasources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guillenorway.eiv.repositories.PaisRepository;
import com.sdl.odata.api.ODataException;
import com.sdl.odata.api.edm.model.EntityDataModel;
import com.sdl.odata.api.parser.ODataUri;
import com.sdl.odata.api.parser.TargetType;
import com.sdl.odata.api.processor.datasource.DataSource;
import com.sdl.odata.api.processor.datasource.DataSourceProvider;
import com.sdl.odata.api.processor.datasource.ODataDataSourceException;
import com.sdl.odata.api.processor.datasource.TransactionalDataSource;
import com.sdl.odata.api.processor.link.ODataLink;
import com.sdl.odata.api.processor.query.QueryOperation;
import com.sdl.odata.api.processor.query.strategy.QueryOperationStrategy;
import com.sdl.odata.api.service.ODataRequestContext;

@Component
public class PaisDataSource implements DataSourceProvider, DataSource{

	@Autowired
	private PaisRepository paisRepository = null;
	
	@Autowired
	private PaisFrmDtoValidator paisFrmDtoValidator = null;

	@Override
	public Object create(ODataUri arg0, Object arg1, EntityDataModel arg2) throws ODataException {
		
		return null;
	}

	@Override
	public void createLink(ODataUri arg0, ODataLink arg1, EntityDataModel arg2) throws ODataException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ODataUri arg0, EntityDataModel arg1) throws ODataException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLink(ODataUri arg0, ODataLink arg1, EntityDataModel arg2) throws ODataException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransactionalDataSource startTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(ODataUri arg0, Object arg1, EntityDataModel arg2) throws ODataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataSource getDataSource(ODataRequestContext arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryOperationStrategy getStrategy(ODataRequestContext arg0, QueryOperation arg1, TargetType arg2)
			throws ODataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSuitableFor(ODataRequestContext arg0, String arg1) throws ODataDataSourceException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
