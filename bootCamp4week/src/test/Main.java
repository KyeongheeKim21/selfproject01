package test;
/*
 * https://www.youtube.com/watch?v=w1CQOhZIPTw
 * 유튜브 영상 참고
 * https://m.blog.naver.com/tkddlf4209/220539879514
 * 참고 블로그
 * */

import test.DAO;

public class Main {

	public static void main(String[] args) {
		System.out.println(new DAO().getSession());
		
		DAO dao = new DAO();
		//dao.tableTruncate();
		//dao.tableInsert();
		//dao.tableMerger();
		System.out.println(dao.countCheck());
	}

}
