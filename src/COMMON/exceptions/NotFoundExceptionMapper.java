package COMMON.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException>{

	@Override
	public Response toResponse(NotFoundException nfe) {
		return Response.status(Status.NOT_FOUND).entity(new ErrorMessage(nfe.getMessage(), 404)).build();
	}

}
