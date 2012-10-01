package share;

import java.util.HashMap;
import java.util.Map;

public class ShareController {
	
	Map<Integer, Share> sharesHolder = new HashMap<Integer, Share>();
	
	public void addShares(int shareId, Share share){
		sharesHolder.put(shareId, share);
		
	}
	
	public void updateShares(){
		
	}
	
	public void removeShares(){
		
	}
	
	public void getSharesById(){
		
	}
	
	public void getMostRecentIssue(){
		
	}
	
	public void getSharesAbovePrice(){
		
	}

}
