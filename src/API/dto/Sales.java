package API.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType
public class Sales implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int totalPrice;
	private String salesDetails;

	public Sales() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getSalesDetails() {
		return salesDetails;
	}

	public void setSalesDetails(String salesDetails) {
		this.salesDetails = salesDetails;
	}

}
