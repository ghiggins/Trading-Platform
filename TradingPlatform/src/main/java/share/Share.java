package share;

import java.math.BigDecimal;
import java.util.Date;

public class Share {
	int shareId;
	BigDecimal price;
	Date dateIssued;
	Date dateEnded;
	Date lastUpdate;
	int shareIssueId;
	
	
	public Share(int shareId, BigDecimal price, int shareIssueId){
		this.shareId= shareId;
		this.price = price;
		this.dateIssued=new Date();
		this.shareIssueId=shareIssueId;
	}
	
	public int getShareId() {
		return shareId;
	}
	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	public Date getDateEnded() {
		return dateEnded;
	}
	public void setDateEnded(Date tdateEnded) {
		this.dateEnded = tdateEnded;
	}
	public Date getLastUpdate(){
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate){
		this.lastUpdate = lastUpdate;
	}
	public int getShareIssueId() {
		return shareIssueId;
	}
	public void setShareIssueId(int shareIssueId) {
		this.shareIssueId = shareIssueId;
	}
	

}
