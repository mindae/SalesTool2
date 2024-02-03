package mindae.salestool;

public class SalesData {
	private int data[] = {-1, 0, 4, 42, 84};
	public void display() {
		System.out.println("Data: ");
		for(int i: data) {
			
			System.out.println("Next Value: "+data[i]);
		}
	}
}
