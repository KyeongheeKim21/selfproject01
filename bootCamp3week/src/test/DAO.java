package test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//import test.DTO;

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
	public int tableTruncate() {
		int rownum = -1;
		try {
			SqlSession session = getSession().openSession();
			rownum = session.delete("mapper.truncate");
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return rownum;
	}
	
	public int tableInsert() {
		int rownum = -1;
		try {
			SqlSession session = getSession().openSession();
			rownum = session.insert("mapper.insert");
			session.commit();
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return rownum;
	}
	
	public int tableMerger() {
		int rownum = -1;
		try {
			SqlSession session = getSession().openSession();
			rownum = session.update("mapper.merge");
			session.commit();
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return rownum;
	}
	public List<DTO> check() {
		List<DTO> list = null;
		try {
			SqlSession session = getSession().openSession();
			list = session.selectList("mapper.check");
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return list;
	}
	public int countCheck() {
		int count = -1;
		try {
			SqlSession session = getSession().openSession();
			count = session.selectOne("mapper.countCheck");
			session.close();
		}catch(Exception e) {
			System.err.print(e);
		}
		return count;
	}
}
