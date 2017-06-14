package API.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType
public class Store implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String storeName;
	private String ParentStoreId;
	@XmlElement
	private List<StoreStock> storeStock;

	public Store() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getParentStoreId() {
		return ParentStoreId;
	}

	public void setParentStoreId(String parentStoreId) {
		ParentStoreId = parentStoreId;
	}

	public List<StoreStock> getStoreStock() {
		
		if(storeStock == null) storeStock = new ArrayList<StoreStock>();
		
		return storeStock;
	}

	public void setStoreStock(List<StoreStock> storeStock) {
		this.storeStock = storeStock;
	}

}
