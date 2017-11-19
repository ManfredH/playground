package zoo;

public class Penguin extends SeaBird implements Animal {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeNoise() {
		System.out.println("Penguin: makeNoise");
		String result = super.makeNoise();
		// TODO Auto-generated method stub
		return result;
	}

}
