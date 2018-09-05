
public class SandwichBarWOTO {
	public int whichOrder(String[] available, String[] orders){
		
		for(int k=0; k<orders.length; k+=1) {
			if (canMake(orders[k], available)) {
				return k;
			}
		}
		return -1;
	}
	/**
	 * return true if each part in sandwich is available and false otherwise
	 * @param string
	 * @param available
	 * @return
	 */
	private boolean canMake(String sandwich, String[] available) {
		// TODO Auto-generated method stub
		for (String s: sandwich.split(" ")) {
			//OR: if (! s in available) {
			//OR: if (! Arrays.asList(available).contains(s)) {
			if(! isIn(s,available)) {
				return false;
			}
		}
		return true;
	}
	private boolean isIn(String s, String[] list) {
		for (String t: list) {
			if (t.equals(s)) {
				return true;
			}
		}
		return false;
	}
}
