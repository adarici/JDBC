package summer21jdbc1;

public class MyCompaniesPojo {

	private int company_id;
	private String company_name;
	
	public MyCompaniesPojo() {
		
	}

	public MyCompaniesPojo(int company_id, String company_name) {
		
		this.company_id = company_id;
		this.company_name = company_name;
	}

	/**
	 * @return the company_id
	 */
	public int getCompany_id() {
		return company_id;
	}

	/**
	 * @param company_id the company_id to set
	 */
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	/**
	 * @return the company_name
	 */
	public String getCompany_name() {
		return company_name;
	}

	/**
	 * @param company_name the company_name to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	@Override
	public String toString() {
		return "MyCompaniesPojo company_id=" + company_id + ", company_name=" + company_name;
	}
	
}
