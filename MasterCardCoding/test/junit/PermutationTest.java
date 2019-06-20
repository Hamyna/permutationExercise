package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import utility.Permutation; 

public class PermutationTest { 
	
	@Test
    public void testPermutation() throws Exception { 
        
        //test for 3 letters 
        List<String> result1 = new ArrayList<String>(); 
        result1.add("jhg");
        result1.add("hjg");
        result1.add("hgj");
        result1.add("jgh");
        result1.add("gjh");
        result1.add("ghj"); 
    
         
        assertThat(result1,is(Permutation.of("ghj")));  
        
        //test for string with value null 
        List<String> result2 = Arrays.asList("llun", "llun", "luln", "lunl", "luln", "ulln", "ulln", "ulnl", "lunl", "ulnl", "unll", "unll", 
                								"llnu", "llnu", "lnlu", "lnul", "lnlu", "nllu", "nllu", "nlul", "lnul", "nlul", "null", "null");;  
         
       assertThat(result2, is(Permutation.of("null"))); 
        
        //test for null input  
        assertThat(null, is(Permutation.of(null))); 
        
        //test for empty input 
        assertThat(null, is(Permutation.of("")));  
        
        //test for one letter input 
        List<String> result3 = new ArrayList<String>(); 
        result3.add("a");
        assertThat(result3, is(Permutation.of("a")));  
        
        
        //test for string with empty space..  
        assertThat(null, is(Permutation.of("     ")));  
        
        //test string containing non alphabet value   
        List<String> result4 = Arrays.asList("$@?", "@$?", "@?$", "$?@", "?$@", "?@$");
        assertThat(result4, is(Permutation.of("?@$")));  
        
        //test string containing numeric values in string 
        List<String> result5 = Arrays.asList ("321", "231", "213", "312", "132", "123");
         
        assertThat(result5, is(Permutation.of("123")));  
        
	}
}
