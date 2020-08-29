package itemInputDBApplication;
/*
 * Mybatis blog
 * https://doublesprogramming.tistory.com/176
 * 
 * mybatis document site
 * https://mybatis.org/mybatis-3/sqlmap-xml.html
 * */
public class UploaditemToDB {//upload item to DB

	public static void main(String[] args) {
		System.out.println("item upload here. working only ones.");
		//DAO.uploadItem(icode,name,price);
		for(int i = 65, code = 10065; i < 91; i++) {
			new DAO().uploadItem(Integer.toString(code++), ("item"+(char)i), i*100);	
		}
	}

}
