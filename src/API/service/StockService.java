package API.service;

import API.dto.*;
import COMMON.exceptions.*;

public interface StockService {

	Stock createStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock readStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock updateStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock removeStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock acceptDelivery() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock acceptStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock transfer() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

	Stock adjustStock() throws NotFoundException, AlreadyExistException, MissingParameter, InvalidParameter;

}
