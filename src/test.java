import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test(expected = IllegalStateException.class)
	public void testGetSize() {
		stack stack = new lifo(10);
		stack stack1 = new lifo(0);
		
		if(stack.getSize() != 10){
			fail("taille incompatible");
		}
	}
	
	@Test(expected = IllegalStateException.class)
	public void testPush() {
		stack stack = new lifo(3);
		int valPos = 500;
		int valNeg = -40;
		int valNul = 0;
		int val = 3;
		
		stack.push(valNul);
		stack.push(valNeg);
		stack.push(valPos);
		stack.push(val);
	}

	@Test(expected = IllegalStateException.class)
	public void testPop() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new lifo(3);
		stack stack1 = new lifo(3);
		
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		stack.pop();
		stack1.pop();
		
		if(stack.getNumberOfElement()==3){
			fail("le nombre d'élèment devrait être 2 !");
		}
	}

	@Test
	public void testGetNumberOfElement() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new lifo(3);
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		if(stack.getNumberOfElement() != 3){
			fail("Le nombre d'élément devrait être différent !");
		}
	}

	@Test
	public void testIsFull() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack1 = new lifo(3);
		stack stack = new lifo(3);
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		if(stack.isFull() == false){
			fail("La stack est pleine !");
		}
		if(stack1.isFull() == true){
			fail("La stack est vide !");
		}
	}

	@Test
	public void testIsEmpty() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new lifo(3);
		if(stack.isEmpty() == false){
			fail("La stack est vide !");
		}
		
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		stack.pop();
		stack.pop();
		stack.pop();
		if(stack.isEmpty() == false){
			fail("La stack est vide !");
		}
		
	}


	@Test
	public void testHead() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new lifo(3);
		stack.push(val);
		stack.push(valNeg);
		stack.push(valPos);
		
		if(stack.head() != valPos){
			fail("La dernière valeur devrait être valPos !");
		}
		
	}
}
