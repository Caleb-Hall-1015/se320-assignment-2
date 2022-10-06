import java.util.ArrayList; 
 
public class Exercise19_03 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(14); 
	    list.add(24); 
	    list.add(14); 
	    list.add(42); 
	    list.add(25); 
	    list.add(28);
	    list.add(16);
	    list.add(46);
	    list.add(16);
	    list.add(48);
	    list.add(28);
	    list.add(28);
	    list.add(28);
	    list.add(25);
	    System.out.println(list);
	    ArrayList<Integer> newList = removeDuplicates(list); 
	     
	    System.out.println(newList);
	 } 
	 
	 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	 {
		 ArrayList<E> revisedList = new ArrayList<E>();
		 for (int i = 0; i < list.size(); i++)
		 {
			 if (!revisedList.contains(list.get(i)))
			 {
				 revisedList.add(list.get(i));
			 }
		 }
		 
		 return revisedList;
	 } 
}