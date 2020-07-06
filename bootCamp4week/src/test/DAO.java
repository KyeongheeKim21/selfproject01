package test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DAO {
	private SqlSessionFactory sqlSessionFactory;
	
	public SqlSessionFactory getSession() {
		try {
			String path = "test/mybatis-config.xml";
			
			Reader reader = Resources.getResourceAsReader(path);
			
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e) {
			System.err.print(e);
		}
		
		return sqlSessionFactory;
	}
	public List<String> distinct_STAT_TYP() {
		List<String> list = null;
		try {
			SqlSession session = getSession().openSession();
			list = session.selectList("mapper.distinct_STAT_TYP");
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return list;
	}
	
	public List<DTO> extract_STAT_TYP(String para) {
		List<DTO> list = null;
		try {
			SqlSession session = getSession().openSession();
			list = session.selectList("mapper.extract_excel", para);
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return list;
	}	
}
