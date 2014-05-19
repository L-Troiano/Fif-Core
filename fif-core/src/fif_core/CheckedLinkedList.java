package fif_core;



import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**This is a proxy class that checks the data when the client uses the AbstractList objects.
 * 
 * @author Troiano Lorenzo
 * @version 1.0
 */

public class CheckedLinkedList<E> extends LinkedList<E>  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	
	@Override
	public boolean add(E element) {
		
		assert (element!=null) : "You are trying to set a null value.";
		
		return super.add(element);
	}




	@Override
	public void add(int index, E element) {
		
		assert(index >= 0 && index < size()) : "Index Out of Bound"; 
		assert (element!=null) : "You are trying to set a null value.";

		super.add(index, element);
	}




	@Override
	public boolean addAll(Collection<? extends E> collection) {

		 
		assert (collection!=null) : "You are trying to set a null value.";
		
		
		return super.addAll(collection);
	}




	@Override
	public boolean addAll(int index, Collection<? extends E> collection) {

		assert(index >= 0 && index < size()) : "Index Out of Bound"; 
		assert (collection!=null) : "You are trying to set a null value.";
		
		return super.addAll(index, collection);
	}




	@Override
	public E get(int index) {

		assert(index >= 0 && index < size()) : "Index Out of Bound";
		
		
		return super.get(index);
	}




	@Override
	public int indexOf(Object element) {

		
		assert (element!=null) : "You are trying to set a null value.";
		
		return super.indexOf(element);
	}




	@Override
	public int lastIndexOf(Object element) {
		
		 
		assert (element!=null) : "You are trying to set a null value.";
		
		return super.lastIndexOf(element);
	}




	@Override
	public ListIterator<E> listIterator(int index) {

		assert(index >= 0 && index < size()) : "Index Out of Bound";
		
		
		return super.listIterator(index);
	}








	@Override
	public boolean remove(Object element) {
		
		 
		assert (element!=null) : "You are trying to set a null value.";
		
		return super.remove(element);
	}




	public E remove(int index) {

		assert(index >= 0 && index < size()) : "Index Out of Bound";
		
		return super.remove();
	}
	
	

	
	public E set(int index, E element) {
		
		assert (element!=null) : "You are trying to set a null value.";
		assert(index >= 0 && index < size()) : "Index Out of Bound";
		
		return super.set(index, element);
	}

	

	

}
