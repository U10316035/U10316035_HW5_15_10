/*U1316035
 *Lin Tz Hau
 */
 
 //test program
 
public class testClone{
	public static void main(String[] args){
		//new an object of MyStack
		MyStack mystack = new MyStack();
		mystack.push("100");
		mystack.push("200");
		mystack.push("300");
		System.out.println("The original stack named mystack : \n" + mystack.toString());
		System.out.println("\n");
		//pass mystack reference to stackREFERENCE
		MyStack stackREFERENCE = mystack;
		//perform deep copy to stackDEEP
		MyStack stackDEEP = (MyStack)mystack.clone();;
		System.out.println("Sample of SAME REFERENCE of mystack named stackREFERENCE : \n" + stackREFERENCE.toString());
		System.out.println("\n");
		System.out.println("Sample of DEEP COPY of mystack named stackDEEP : \n" + stackDEEP.toString());
		System.out.println("\n");
		//Check if stackREFERENCE equals to mystack
		System.out.println("Check if stackREFERENCE equals to mystack : \n" + stackREFERENCE.equals(mystack));
		System.out.println("\n");
		//Check if stackDEEP equals to mystack
		System.out.println("Check if stackDEEP equals to mystack : \n" + stackDEEP.equals(mystack));
		System.out.println("\n");
		//Which means stackDEEP and mystack are DIFFERENT objects because of deep copy !!!
		
		//now we exchange the first object in the ArrayList of mystack
		mystack.list.set(0,"500");
		System.out.println("stackREFERENCE after exchange : \n" + stackREFERENCE.toString());
		System.out.println("\n");
		System.out.println("stackDEEP after exchange : \n" + stackDEEP.toString());
		//we can see only stackREFERENCE was exchanged because it share the same reference of mystack
		//and the reason why stackDEEP was not exchanged was the deep copy
		System.out.println("Only stackREFERENCE was exchanged \n");
		
		
	}
}
