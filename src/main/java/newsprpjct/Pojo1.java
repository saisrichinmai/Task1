package newsprpjct;

public class Pojo1 {
	private int id;
	private String name;
//	public Pojo1(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	public int getId() {
		return id;
	}
	public Pojo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println(id+""+name);
	}
}
