    Iterable(Inteface)
	Collection(Inteface)
	List(Inteface)
	AbstractList(abstract class)
	AbstractCollection(abstract class)
	AbstractSet(abstract class)
	ArrayList(class)
	Linkedlist(class)
	Set(class)
	HashSet(class)
	LinkedHashSet(class)
	TreeSet(class)
									   ----List----
									 ----ArrayList----
 
   Collection <Extends> Iterable(Inteface)
		 |        
   List <Extends> Collection(Interface)
         |
   AbstractCollection <implements> List(Interface)
         |
   AbstractList(abstract class) <Extends> AbstractCollection(abstract class) <Implements> List
         |
   ArrayList <Extends> AbstractList(abstract class)
         |
   ArrayList(Class) 

 
 /* 1) Collection Array list Not Easy to Search and Remove the Element or Not Better than LinkedList 
    But Retrieving the Element from List is faster than Linked List 
    2) Array List has Default Size() is 10
    3) List will  Allow Duplicate
    4) Insertion Order is Maintained */
   
   
             
             			           ----LinkedLlist----
	Collection <Extends> Iterable(Inteface)
		    |        
    List <Extends> Collection(Interface)
            |
    AbstractCollection <implements> List(Interface)
    AbstractSequentialList <Extends>  AbstractCollection <Implements> List(Interface)
	        |
	LinkedList <implements> AbstractSequentialList(abstract class) <implements> Deque, Cloneable, java.io.Serializable
	        |
	Linkedlist(class)
	
  /*1) Collection Linked list is Easy to Search and Remove the Element or Better than ArrayList 
     But Retrieving the Element from List is Slower than Array List
    2) Linked List has Default Size() is 10
    3) Insertion Order is Maintained */
                                       ----Set----
									 ----HashSet----
									 
    Collection <Extends> Iterable(Inteface)
	        |			 
	AbstractCollection <Implements>	Collection(Interface)
    Set<Extends> Collection
			| 
	AbstractSet(abstract Class) <Extends> AbstractCollection <Implements> Set						 
		    |
    HashSet(class) <Extends> AbstractSet <Implements> Set, Cloneable, java.io.Serializable

	
   /*1)Set will Not Allow Duplicate
     2)HashSet  has Default Size() is 16
     3)In Set We can add null value
     4)In HashSet Insertion Order Is not Maintained
     5)In set,The element will store according to hashcode so Searching is Effective
   */
                                      ----LinkedHashSet----
	Collection <extends> Iterable
	        |
	Set(Interface) <extends> Collection
	        |
	AbstractSet(abstract class) <extends> AbstractCollection <implements> Set
			|						  
    HashSet <extends> AbstractSet <implements> Set, Cloneable, java.io.Serializable
			|						  
    HashSet <implements> Set, Cloneable, java.io.Serializable 									  
			|
	LinkedHashSet(class) <Extends> HashSet
	
   /*1)Set will Not Allow Duplicate
     2)In Set We can add null value
     3)In HashSet Insertion Order Will be Maintained
     4)In set,The element will store according to hashcode so Searching is Effective
*/

                                         ----TreeSet----
	Collection <extends> Iterable
			|							 
    Set <extends> Collection
	AbstractCollection <implements> Collection 									 
			|							 
    AbstractSet <extends> AbstractCollection <implements> Set
            |
    TreeSet(class) <extends> AbstractSet

  /*1) Insertion Order Will Returns the accenting Order
    2) DS-It is Binary Search
    3) Tree Does not allow a Heterogeneous object Because All Element Should be comparable Ex: if(1=='a') Not true so, That 
       tree does not allow a Heterogeneous object
    4)Tree Don't allow a Duplicate value
  */
  