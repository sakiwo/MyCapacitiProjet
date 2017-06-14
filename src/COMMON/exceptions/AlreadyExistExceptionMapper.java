package COMMON.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class AlreadyExistExceptionMapper implements ExceptionMapper<AlreadyExistException> {

	@Override
	public Response toResponse(AlreadyExistException aee) {
		return Response.status(Status.CONFLICT).entity(new ErrorMessage(aee.getMessage(), 409)).build();
	}

}
