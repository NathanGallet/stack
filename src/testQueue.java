import static org.junit.Assert.*;

import org.junit.Test;

public class testQueue {

	@Test(expected = IllegalStateException.class)
	public void testPop() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new queue(3);
		
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		stack.pop();		
		if(stack.head()!=valNeg){
			fail("le nombre d'élèment devrait être valNeg !");
		}
		stack.pop();		
		if(stack.head()!=valPos){
			fail("le nombre d'élèment devrait être valPos !");
		}
	}

	@Test(expected = IllegalStateException.class)
	public void testHead() {
		int valNeg = -40;
		int val = 3;
		
		stack stack = new queue(3);
		
		stack.push(val);
		if(stack.head() != val){
			fail("le nombre d'élèment devrait être val !");
		}
		stack.push(valNeg);
		if(stack.head() != val){
			fail("le nombre d'élèment devrait être val !");
		}
		
		stack.pop();
		stack.pop();
		stack.head();
	}

}
