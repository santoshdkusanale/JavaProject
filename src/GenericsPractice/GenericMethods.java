package GenericsPractice;

public class GenericMethods {
	
	public class Pair <K, V> {
		private K key;
		private V value;
		
		public Pair(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
		
	
	}
	
	public static void main(String[] args) {
		
		GenericMethods mainObj = new GenericMethods();
		Pair<Integer, String> p1 = mainObj.new Pair<>(1, "apple");
		Pair<Integer, String> p2 = mainObj.new Pair<>(1, "pears");
		 boolean  same = Util.<Integer, String>compare(p1, p2);
		 boolean  same1 = Util.compare(p1, p2);
		
		 
		System.out.println("With <>:"+same);
		System.out.println("Without <>:"+same1);
		
	}
}
