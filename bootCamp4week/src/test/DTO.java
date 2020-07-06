package test;

public class DTO {
	private String FA_ID;
	private String LT_ID;
	private String PROD_ID;
	private String TIMEKEY;
	private String FL_ID;
	private String OP_ID;
	private String STAT_CD;
	private String STAT_TYP;
	
	public DTO() {
		super();
	}
	public DTO(String fA_ID, String lT_ID, String pROD_ID, String fL_ID, String oP_ID, String tIMEKEY
			, String sTAT_CD,String sTAT_TYP) {
		super();
		this.FA_ID = fA_ID;
		this.LT_ID = lT_ID;
		this.PROD_ID = pROD_ID;
		//String[] arr = tIMEKEY.split(".");
		//this.TIMEKEY = arr[0];
		this.TIMEKEY = tIMEKEY.substring(0, 12);
		this.FL_ID = fL_ID;
		this.OP_ID = oP_ID;
		this.STAT_CD = sTAT_CD;
		this.STAT_TYP = sTAT_TYP;
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
		//String[] arr = tIMEKEY.split(".");
		TIMEKEY = tIMEKEY.substring(0, 12);//arr[0];
	}
	public String getSTAT_CD() {
		return STAT_CD;
	}
	public void setSTAT_CD(String sTAT_CD) {
		STAT_CD = sTAT_CD;
	}
	public String getSTAT_TYP() {
		return STAT_TYP;
	}
	public void setSTAT_TYP(String sTAT_TYP) {
		STAT_TYP = sTAT_TYP;
	}
	@Override
	public String toString() {
		return "DTO [FA_ID=" + FA_ID + ", LT_ID=" + LT_ID + ", PROD_ID=" + PROD_ID + ", FL_ID=" + FL_ID + ", OP_ID="
				+ OP_ID + ", TIMEKEY=" + TIMEKEY + ", STAT_CD=" + STAT_CD + ", STAT_TYP=" + STAT_TYP + "]";
	}
	
}
