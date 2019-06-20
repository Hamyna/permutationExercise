package utility;

import java.util.ArrayList; 
import java.util.List; 

public class Permutation extends RuntimeException{   
	
 	
	public static List<String> of(String value) { 
	   // Set<String> set = new HashSet<String>(); - use set to eliminate duplicate 
	    List<String> list = new ArrayList<String>(); 
	    
	    if (value == null || value.isEmpty() || value.trim().isEmpty()) {
	        return null; 
	    } 
	    else if (value.length() == 1) {
	    	list.add(value);
	    } 
	    else if (value.length() > 1) { 
	        int lastIndex = value.length() - 1;
	        
	        // Find out the last character - suffix
	        String suffix =value.substring(lastIndex);
	        
	        // Rest of the string - prefix
	        String prefix = value.substring(0, lastIndex);   
	        
	        //Perform permutation on the prefix string and merge with the suffix character
	        list = merge( of(prefix), suffix );
	    }
	    return list;
	}

	
	private static List<String> merge(List<String> listOfPrefix, String suffix) {
		 List<String> list = new ArrayList<String>();
		 
	    // Loop through all the string in the list  
		for (String aPrefix : listOfPrefix) {
	        // For each prefix, insert the last character to all possible positions
	        // and add them to the new list
	        for (int i = 0; i <= aPrefix.length(); i++) {
	            String ps = new StringBuffer(aPrefix).insert(i, suffix).toString(); 
	            list.add(ps);
	        }
	    }
	    return list;
	} 

	public static void main(String[] args) { 
 		Permutation.of("ABC"); 
	}
	
	
}
