package test;

public class DTO {
	private String FA_ID;
	private String LT_ID;
	private String PROD_ID;
	private String FL_ID;
	private String OP_ID;
	private String TIMEKEY;
	private String CHG_TM;
	private String CRT_TM;
	
	public DTO() {
		super();
	}
	public DTO(String fA_ID, String lT_ID, String pROD_ID, String fL_ID, String oP_ID, String tIMEKEY, String cHG_TM,
			String cRT_TM) {
		super();
		this.FA_ID = fA_ID;
		this.LT_ID = lT_ID;
		this.PROD_ID = pROD_ID;
		this.FL_ID = fL_ID;
		this.OP_ID = oP_ID;
		this.TIMEKEY = tIMEKEY;
		this.CHG_TM = cHG_TM;
		this.CRT_TM = cRT_TM;
	}
	public String getFA_ID() {
		return FA_ID;
	}
	public void setFA_ID(String fA_ID) {
		FA_ID = fA_ID;
	}
	public String getLT_ID() {
		return LT_ID;
	}
	public void setLT_ID(String lT_ID) {
		LT_ID = lT_ID;
	}
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getFL_ID() {
		return FL_ID;
	}
	public void setFL_ID(String fL_ID) {
		FL_ID = fL_ID;
	}
	public String getOP_ID() {
		return OP_ID;
	}
	public void setOP_ID(String oP_ID) {
		OP_ID = oP_ID;
	}
	public String getTIMEKEY() {
		return TIMEKEY;
	}
	public void setTIMEKEY(String tIMEKEY) {
		TIMEKEY = tIMEKEY;
	}
	public String getCHG_TM() {
		return CHG_TM;
	}
	public void setCHG_TM(String cHG_TM) {
		CHG_TM = cHG_TM;
	}
	public String getCRT_TM() {
		return CRT_TM;
	}
	public void setCRT_TM(String cRT_TM) {
		CRT_TM = cRT_TM;
	}
	@Override
	public String toString() {
		return "DTO [FA_ID=" + FA_ID + ", LT_ID=" + LT_ID + ", PROD_ID=" + PROD_ID + ", FL_ID=" + FL_ID + ", OP_ID="
				+ OP_ID + ", TIMEKEY=" + TIMEKEY + ", CHG_TM=" + CHG_TM + ", CRT_TM=" + CRT_TM + "]";
	}
	
}
