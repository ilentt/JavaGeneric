package vn.elca.training;

public class GenericExtend2<V> extends GenericKeyValue<Integer, V>{

	/**
	 * @param key
	 * @param value
	 */
	public GenericExtend2(Integer key, V value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		GenericExtend2<String> records = new GenericExtend2<String>(123456, "Audi");
		Integer key = records.getKey();
		String value = records.getValue();
		System.out.println(key + " " + value);
	}
}
