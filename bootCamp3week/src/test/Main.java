package test;
/*
 * https://www.youtube.com/watch?v=w1CQOhZIPTw
 * ��Ʃ�� ���� ����
 * https://m.blog.naver.com/tkddlf4209/220539879514
 * ���� ��α�
 * */

//import test.DAO;

public class Main {

	public static void main(String[] args) {
		//System.out.println(new DAO().getSession());
		
		DAO dao = new DAO();
		//dao.tableTruncate();
		//dao.tableInsert();
		//dao.tableMerger();
		System.out.println(dao.countCheck());
	}

}
