package COMMON.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class InvalidParameterMapper implements ExceptionMapper<InvalidParameter> {

	@Override
	public Response toResponse(InvalidParameter ip) {
		return Response.status(Status.NOT_ACCEPTABLE).entity(new ErrorMessage(ip.getMessage(), 406)).build();
	}

}
