package API.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class SalesDetails implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	private Sales id;
	private String unitPrice;
	private short quantity;

	public SalesDetails() {
	}

	public Sales getId() {
		return id;
	}

	public void setId(Sales id) {
		this.id = id;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

}
