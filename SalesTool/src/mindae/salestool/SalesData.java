package mindae.salestool;

/*
* Represents the sales data
*/
public class SalesData {
	private int data[] = {0,4,42};
	public void display() {
		System.out.println("Data: ");
		int sum=0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next Value: "+data[i]);
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
	}
}
