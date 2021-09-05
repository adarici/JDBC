package summer21jdbc1;

public class MyDemo {

	private int demo_id;
	private String name_of_demo;
	private String demo_adress;
	private int demo_code;
	
	/**
	 * @return the demo_id
	 */
	public int getDemo_id() {
		return demo_id;
	}

	/**
	 * @param demo_id the demo_id to set
	 */
	public void setDemo_id(int demo_id) {
		this.demo_id = demo_id;
	}

	/**
	 * @return the name_of_demo
	 */
	public String getName_of_demo() {
		return name_of_demo;
	}

	/**
	 * @param name_of_demo the name_of_demo to set
	 */
	public void setName_of_demo(String name_of_demo) {
		this.name_of_demo = name_of_demo;
	}

	/**
	 * @return the demo_adress
	 */
	public String getDemo_adress() {
		return demo_adress;
	}

	/**
	 * @param demo_adress the demo_adress to set
	 */
	public void setDemo_adress(String demo_adress) {
		this.demo_adress = demo_adress;
	}

	/**
	 * @return the demo_code
	 */
	public int getDemo_code() {
		return demo_code;
	}

	/**
	 * @param demo_code the demo_code to set
	 */
	public void setDemo_code(int demo_code) {
		this.demo_code = demo_code;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public MyDemo(int demo_id, String name_of_demo, String demo_adress, int demo_code) {
		super();
		this.demo_id = demo_id;
		this.name_of_demo = name_of_demo;
		this.demo_adress = demo_adress;
		this.demo_code = demo_code;
	}

	@Override
	public String toString() {
		return "MyDemo [demo_id=" + demo_id + ", name_of_demo=" + name_of_demo + ", demo_adress=" + demo_adress
				+ ", demo_code=" + demo_code + "]";
	}

}
