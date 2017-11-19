package zoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestZoo {

	
	private Zoo zoo;	
	
	@Before
	public void Setup() {
		zoo = new Zoo();

	}	
	
	@Test
	public void PenguinInZooMakeNoise() {
		Penguin penguin = mock(Penguin.class);
		zoo.addAnimal(penguin);
		
		// stub method call with mockito
		when(penguin.makeNoise()).thenReturn("Beep Beep");
		assertEquals("Beep Beep", zoo.makeNoise());
	}
	
	@Test
	public void AnimalWasAdded() {
		
		Penguin penguin = mock(Penguin.class);
		Zoo mockzoo = mock(Zoo.class);
		mockzoo.addAnimal(penguin);
		mockzoo.addAnimal(penguin);
		
		// verify that the add method of class zoo was called (eg. two times)
		verify(mockzoo, times(2)).addAnimal(penguin);
	}

}
