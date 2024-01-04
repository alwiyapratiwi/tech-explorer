package generic;

public class Pair<T, U> {
	
	private T name;
	private U nilai;
	
	public Pair(T name, U nilai) {
		this.name = name;
		this.nilai = nilai;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public U getNilai() {
		return nilai;
	}
	public void setNilai(U nilai) {
		this.nilai = nilai;
	}
	
	

}
