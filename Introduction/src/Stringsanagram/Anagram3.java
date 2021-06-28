package Stringsanagram;

public class Anagram3 {

	public static void main(String[] args) {
		String a = "aab";
		String b = "abc";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
		for(char c : a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			
	    for(char c1 : b.toCharArray()) {
	    	int index1 = (int)c;
	    	bl[index]++;
	    }
	    for(int i =0; i< 256;i++) {
	    	if(al[i] != bl[i]) {
	    		isAnagram = false;
	    		break;
	    	}
	    }
	    if(isAnagram) {
	    	System.out.println("anagram");
	    }else {
	    	System.out.println("not anagram");
	    }
		}

	}

}
