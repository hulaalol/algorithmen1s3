package boyerMoore;

import java.util.HashMap;

public class BoyerMoore2 {
	
	
	public static String muster = "ACBABCBA";
	public static String text = "ABASBABABA";
	
	
	//index bestimmen
	public class musterElement{
		
		Character musterChar;
		
		int lastOcc;
		
		int index;
		int suffix;
		int matchUnsafe;
		int match;
		
		public musterElement() {
	
		}

		public char getMusterChar() {
			return musterChar;
		}

		public void setMusterChar(char musterChar) {
			this.musterChar = musterChar;
		}

		public int getLastOcc() {
			return lastOcc;
		}

		public void setLastOcc(int lastOcc) {
			this.lastOcc = lastOcc;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getSuffix() {
			return suffix;
		}

		public void setSuffix(int suffix) {
			this.suffix = suffix;
		}

		public int getMatchUnsafe() {
			return matchUnsafe;
		}

		public void setMatchUnsafe(int matchUnsafe) {
			this.matchUnsafe = matchUnsafe;
		}

		public int getMatch() {
			return match;
		}

		public void setMatch(int match) {
			this.match = match;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		HashMap<Integer,musterElement> musterMap = new HashMap<>();
		
		BoyerMoore2 app = new BoyerMoore2();
		
		//index zuordnen
		char[] musterChars = muster.toCharArray();

		for(int i=0; i<musterChars.length; i++){
			
			musterElement e = app.new musterElement();
			e.setIndex(i);
			e.setMusterChar(musterChars[i]);
			
			musterMap.put(i,e);

		}
		
		System.out.println("test2");
		
		//suffix
		musterMap.forEach((index,musterElement) -> {
			
		int lastIndexChecked = (musterChars.length-1); 	
		
		musterElement checked = musterElement;
		
		
		if(musterElement.index!=lastIndexChecked){
			while(musterElement.musterChar.compareTo(musterMap.get(lastIndexChecked).musterChar)==0){
				checked.suffix++;
				
				if(lastIndexChecked!=1){
					lastIndexChecked--;
				}
				
				
				if(musterElement.getIndex()!=0){
					
					musterElement = musterMap.get(musterElement.getIndex()-1);
				}
				
			}
		}else{
			musterElement.suffix = musterChars.length;
		}
		});
		
		
		
		
		System.out.println("test");
		
		
		
		
		
		
		
		
	}

	 
	
	
	
	
	
	
}