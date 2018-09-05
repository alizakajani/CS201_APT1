
public class SandwichBar {
	public int whichOrder(String[] available, String[] orders){
		
        for(int k = 0; k < orders.length; k += 1) {
        	boolean goodOrder = false;
        	String order = orders[k];
        	String[] ingredients = order.split(" ");
        	for (String ingredient : ingredients) {
        		goodOrder = false;
        		for (String avail : available) {
        			if (ingredient.equals(avail)) {
        				goodOrder = true;
        			}
        		}
        		if (!goodOrder) {
        			break;
        		}
        	}
        	if(goodOrder) {
        		return k;
        	}
        }
        return -1;
     }
}
