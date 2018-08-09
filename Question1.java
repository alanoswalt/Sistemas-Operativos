public class FirstQuestion {
	
	
	
	public static void word (String str) {
		
		String [] n = str.split("");
		final long startTime = System.currentTimeMillis(); //Time of execution
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory(); //Use of memory
		
		//for (int  i = 0; i<str.length()-1; i++) {
			//if(str.charAt(i) == str.charAt(i+1)){
				//System. out. println("es igual");
		//	} 
		
		//Check for the first letter that does not repeat, complexity n square	
		for (int i = 0; i < n.length; i++) {
			
			int index = 0;
		    for (int k = 0; k < n.length; k++) {
		        if (str.charAt(i) == str.charAt(k)) {
		            //do stuff
		        	index++;
		        	//System.out.println(index);  	
		        }
		    }
		    
		    if(index == 1) {
		    	System.out.println(str.charAt(i));
		    break;	
		    }
		} 
		
		
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		
		System.out.println("Total memory used: " + actualMemUsed);
			
			//System. out. println("Google");
		//	System.out.println(Arrays.toString(n));
			
			
		}

	public static void main(String[] args) {
		String str = ("google");
		word(str);
		
		//String momo = ("g");
		//String memo = ("z");
		
		//if (momo ==memo) {
			//System.out.println("Es igual");
		
		
		// TODO Auto-generated method stub

	}

}
