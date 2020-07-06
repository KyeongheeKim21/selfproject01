package test;
/*
 * https://www.youtube.com/watch?v=w1CQOhZIPTw
 * 유튜브 영상 참고
 * https://m.blog.naver.com/tkddlf4209/220539879514
 * 참고 블로그
 * */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//System.out.println(new DAO().getSession());
		//System.out.println(dao.distinct_STAT_TYP());
		Iterator<String> idx = new DAO().distinct_STAT_TYP().iterator();
		while(idx.hasNext()) {
			String stat_type =  idx.next().toString();
			List<DTO> dto = new DAO().extract_STAT_TYP(stat_type);
			//System.out.println(stat_type);
			
			ExcelWriter write = new ExcelWriter();
			write.excel_writer(dto,stat_type);
			//System.out.println(stat_type+" done");
			
		}
		/*List<DTO> dto = new DAO().extract_STAT_TYP("SELEECT");
		//System.out.println(dto.get(0).getTIMEKEY().substring(0, 12));
		ExcelWriter write = new ExcelWriter();
		write.excel_writer(dto,"SELEECT");
		System.out.println("SELEECT done");*/
	}
	
}
