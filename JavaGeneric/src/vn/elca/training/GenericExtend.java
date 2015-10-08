package vn.elca.training;

public class GenericExtend extends GenericKeyValue<Integer, String> {

	public GenericExtend(Integer key, String value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		GenericExtend records = new GenericExtend(1000, "Audi");
		Integer key = records.getKey();
		String value = records.getValue();
		System.out.println("Key: " + key + " Value: " + value);
	}
}
