package API.service;

import API.dto.*;
import COMMON.exceptions.*;

public interface SalesService {

	void reOrderSales(Sales sales, String userID)
			throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	void sales(Sales sales, String userID)
			throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	void returnSales() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

}
