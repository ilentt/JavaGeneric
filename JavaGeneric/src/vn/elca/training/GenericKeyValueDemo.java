package vn.elca.training;

public class GenericKeyValueDemo {
	public GenericKeyValueDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void runApp() {
		GenericKeyValue<String, Integer> records = new GenericKeyValue<String, Integer>("A001", 12345);
		String id = records.getKey();
		Integer value = records.getValue();
		System.out.println("ID = " + id + " ; " + "Value = " + value);
	}
	
	public static void main(String[] args) {
		GenericKeyValueDemo g = new GenericKeyValueDemo();
		g.runApp();
	}
}
