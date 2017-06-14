package API.service;

import COMMON.exceptions.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import API.dto.*;

public interface StockRestService {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Stock createStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Stock readStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Stock uupdateStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;
	
	
}
