package vn.elca.training;

public class GenericExtend3<K,V,I> extends GenericKeyValue<K, V>{

	private I info;
	
	public GenericExtend3(K key, V value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param key
	 * @param value
	 * @param info
	 */
	public GenericExtend3(K key, V value, I info) {
		super(key, value);
		this.info = info;
	}

	public I getInfo() {
		return info;
	}

	public void setInfo(I info) {
		this.info = info;
	}
	
	
}
