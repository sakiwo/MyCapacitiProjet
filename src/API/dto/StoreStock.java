package API.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType
public class StoreStock implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String description;
	private int purchasedPrice;
	private short quantity;
	private byte preOrderLevel;

	public StoreStock() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPurchasedPrice() {
		return purchasedPrice;
	}

	public void setPurchasedPrice(int purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public byte getPreOrderLevel() {
		return preOrderLevel;
	}

	public void setPreOrderLevel(byte perOrderLevel) {
		this.preOrderLevel = preOrderLevel;
	}

}
