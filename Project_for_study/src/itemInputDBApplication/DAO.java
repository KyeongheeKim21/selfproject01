package itemInputDBApplication;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class DAO {//Data Access Object DTO: data transfer object
	private SqlSessionFactory ssf ;
	
	public SqlSessionFactory getSession() {
		
		try {
			String path = "itemInputDBApplication/myBatis-config.xml";
			Reader reader = Resources.getResourceAsReader(path);
			ssf = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ssf;
	}
	//mapping function here.
	public void uploadItem(String icode,String name, int price) {
		try {
		SqlSession ss = getSession().openSession();
		DTO data = new DTO(icode,name,price);
		ss.insert("mapper.uploadItem",data);
		//System.out.println(icode+ name+ price);
		ss.commit();
		ss.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("check item was inserted");
	}
	public void commitFunc() {
		SqlSession ss = getSession().openSession();
		ss.close();
	}
}
