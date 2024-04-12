package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		int no =scanInt("조회할 게시물 번호를 입력: ");
		
		System.out.println("--------------------------------");
		System.out.println("게시판 번호: "+ no);
		System.out.println("제목: ");
		System.out.println("글쓴이: ");
		System.out.println("--------------------------------");
	}

}
