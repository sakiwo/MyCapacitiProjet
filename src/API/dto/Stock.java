package API.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType
public class Stock implements Serializable {

	private Long id;
	private String stockName;

	private enum measurementType {
		mg, g, kg, ml, l, kl
	};

	@XmlElement
	private List<StoreStock> storeStcok;

	public Stock() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public List<StoreStock> getStoreStcok() {
		
		if(storeStcok == null) storeStcok = new ArrayList<StoreStock>();
		
		return storeStcok;
	}

	public void setStoreStcok(List<StoreStock> storeStcok) {
		this.storeStcok = storeStcok;
	}

}
