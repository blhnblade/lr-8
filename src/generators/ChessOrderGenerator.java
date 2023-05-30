package generators;

public class ChessOrderGenerator implements IGenerator {
	@Override
	public String getName() {
		return "Шахматная";
	}
	
	@Override
	public long getElement(int i, int j) {
		return (i+j)%2==0 ? 0 : 1;
	}
}
