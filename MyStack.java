/*U1316035
 *Lin Tz Hau
 */
 
 import java.util.ArrayList;
 
 /*class MyStack (LIST 11.10) revised
  *implement interface Cloneable
  */
 
public class MyStack implements Cloneable{
	ArrayList<Object> list = new ArrayList<Object>();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Object peek(){
		return list.get(getSize() - 1);
	}
	
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o){
		list.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}
	
	/** Override the protected clone method defined in the Object class
			,and strengtehen its accessibility */
	@Override
	public Object clone(){
		try{
			//perform a shallow copy of MyStack class
			MyStack stackClone = (MyStack)super.clone();
			//perform a deep copy of MyStack ArrayList
			stackClone.list = (ArrayList<Object>)list.clone();
			
			return stackClone;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
}
