package itemInputDBApplication;

public class DTO {//Data Transfer Object
	private String iCode;
	private String name;
	private int price;
	public DTO() {
		super();
	}
	public DTO(String c, String n, int p) {
		this.iCode = c;
		this.name = n;
		this.price = p;
	}
	
	/**
	 * @return the iCode
	 */
	public String getiCode() {
		return iCode;
	}
	/**
	 * @param iCode the iCode to set
	 */
	public void setiCode(String iCode) {
		this.iCode = iCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}
