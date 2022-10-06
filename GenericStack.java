public class GenericStack<E> 
{
	private E[] list;
	private int last = 0;
	
	public GenericStack()
	{
		//cannot create an array of generics, but since generic is an object,
		//it is possible to create an array of objects then cast it to the generic
		list = (E[]) new Object[10];
	}
	
	public GenericStack(int size)
	{
		list = (E[]) new Object[size];
	}
	
	public int getSize()
	{
		return last;
	}
	
	public E peek()
	{
		return list[last - 1];
	}
	
	public void push(E o)
	{
		if (isFull())
		{
			E[] doubledList = (E[]) new Object[getSize() * 2];
			for (int i = 0; i < last; i++)
			{
				doubledList[i] = list[i];
			}
			list = doubledList;
		}
		list[last] = o;
		last++;
	}
	
	public E pop()
	{
		//what if empty
		if (!isEmpty())
		{
			E lastObject = list[last - 1];
			list[last - 1] = null;
			last--;
			return lastObject;
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		if (last == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if (last == list.length)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		String s = new String();
		for (int i = 0; i < last; i++)
		{
			s += list[i].toString() + " ";
		}
		return "stack: " + s;
	}
}
