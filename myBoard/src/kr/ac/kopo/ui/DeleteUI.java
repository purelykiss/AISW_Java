package kr.ac.kopo.ui;

public class DeleteUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		int no =scanInt("삭제할 게시물 번호를 입력: ");
		
		System.out.printf("게시글 [%d]번 게시글을 삭제하였습니다\n", no);
	}
	
}
