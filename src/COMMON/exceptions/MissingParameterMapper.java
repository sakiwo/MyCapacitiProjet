package COMMON.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class MissingParameterMapper implements ExceptionMapper<MissingParameter>{

	@Override
	public Response toResponse(MissingParameter mp) {
		return Response.status(Status.NOT_FOUND).entity(new ErrorMessage(mp.getMessage(), 404)).build();
	}

}
