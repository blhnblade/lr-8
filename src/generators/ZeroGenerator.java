package generators;

public class ZeroGenerator implements IGenerator {
	@Override
	public String getName() {
		return "Нулевая";
	}

//	@Override
//	public long getElement(int i, int j) {
//		return 0;
//	}
	
	@Override
	public long getElement(int i, int j) {
		return 0;
	}
	
}
