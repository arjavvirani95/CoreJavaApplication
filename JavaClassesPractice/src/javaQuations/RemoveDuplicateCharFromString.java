package javaQuations;


public class RemoveDuplicateCharFromString {
	
	
	public static void main(String[] args) {
		
		
		// Through index of method
		String str = "programming";
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//System.out.println(ch);
			
			int ind = str.indexOf(ch, i+1);
			if(ind==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//Using char array
		char arr[] = str.toCharArray();
		
		StringBuilder sb3 = new StringBuilder();
		
		for(int j=0; j<arr.length; j++) {	//traverse the array of string
			boolean repeat = false;				
			for(int k=j+1; k<arr.length; k++) {	//check first to all char and 2nd to all
				if(arr[j]==arr[k]) {			//if match 
					repeat = true;				//boolean true
					break;
				}
			}
			if(!repeat) {	//if not repeat than append to stringbuilder
				sb3.append(arr[j]);
			}
		}
		System.out.println(sb3);
		
	}

	

}
