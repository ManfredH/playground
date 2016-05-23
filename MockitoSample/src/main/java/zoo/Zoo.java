package zoo;

import java.util.ArrayList;

public class Zoo {

	
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public String makeNoise() {
		StringBuilder sounds = new StringBuilder();
		// for (T obj : objects)
		for (Animal a : animals) {
			if (sounds.length() > 0) {
				sounds.append(", ");			
			}
			sounds.append(a.makeNoise());
		}
		return sounds.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
