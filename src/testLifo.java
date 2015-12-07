import static org.junit.Assert.*;

import org.junit.Test;

public class testLifo {

	@Test(expected = IllegalStateException.class)
	public void testGetSize() {
		stack stack = new lifo(10);
		//stack stack1 = new lifo(0);
		
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
		
		stack.push(valNeg);
		if(stack.head() != valNeg){
			fail("La valeur devrait être valNeg !");
		}
		
		stack.push(valNul);
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
		if(stack.getNumberOfElement()==3){
			fail("le nombre d'élèment devrait être 2 !");
		}
		stack1.pop();
	}

	@Test
	public void testGetNumberOfElement() {
		int valPos = 500;
		int valNeg = -40;
		int val = 3;
		
		stack stack = new lifo(3);
		
		stack.push(val);
		if(stack.getNumberOfElement() != 1){
			fail("Le nombre d'élément devrait être différent !");
		}
		
		stack.push(valNeg);
		if(stack.getNumberOfElement() != 2){
			fail("Le nombre d'élément devrait être différent !");
		}
		
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
		if(stack.isFull() == true){
			fail("La stack n'est pas vide !");
		}
		
		stack.push(valNeg);
		if(stack.isFull() == true){
			fail("La stack n'est pas vide !");
		}
		
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
		if(stack.isEmpty() == true){
			fail("La stack n'est pas vide !");
		}
		
		stack.pop();
		if(stack.isEmpty() == true){
			fail("La stack n'est pas vide !");
		}
		
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
		if(stack.head() != val){
			fail("La dernière valeur devrait être val !");
		}
		
		stack.push(valNeg);
		if(stack.head() != valNeg){
			fail("La dernière valeur devrait être valNeg !");
		}	
		
		stack.push(valPos);
		if(stack.head() != valPos){
			fail("La dernière valeur devrait être valPos !");
		}	
	}
}
