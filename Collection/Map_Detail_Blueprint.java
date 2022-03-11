        Map(interface)
        AbstractMap(abstract class)
        HashMap(Class)
		LinkedHashMap(Class)
													 /* Map */

/* Map is Not a True type Collection Type
 * Map is Not a Child Interface of Collection
 * Map is interface
 * Totally Three Sub class are Implements the Map They are HASHMAP,LINKEDHASHMAP,TREEMAP
 * Map Represents the Values By KEY
 * Duplicate KEY's are not allowed in MAP
 * But Duplicate values are allowed*/
 
                                                      /* HashMap */
	 Map(interface)							  
				|									  
	 AbstractMap <implements> Map
	            |
	 AbstractMap <implements> Map , Cloneable, Serializable	
                |	 
     HashMap <extends> AbstractMap
    
 
 
 /*Technique is Hashing
 * Duplicate keys or Not allowed but Duplicate values are Allowed
 * Only one null values are allowed
 * Insertion Order is Not MaintainedS
 * We can Only take a Value by the Key Reference
 * It is Not a Synchronization
 * Initial Capacity is 16*/
 
                                                       /* LinkedHashMap */
	Map(interface)							  
			|										  
	AbstractMap <implements> Map		
            |	
    HashMap <extends> AbstractMap
            |
    LinkedHashMap <extends> HashMap <implements> Map
  
  /*LinkedHashMap is Similar to HashMap but only  one Difference is LikedHashMap Maintain a Insertion Order*/
 
 
                                                      /* TreeMap */
													  
      Map(interface)							  
		     |									  
	 AbstractMap <implements> Map
             |
	TreeMap <extends> AbstractMap  <implements> NavigableMap Cloneable, java.io.Serializable
 
 /*Null Keys are not Allowed 
 * The elements are retrieved on Natural Sorting Order(Based on Key Values)*/