package kr.ac.kopo.ui.receivedState;

import java.util.List;

import kr.ac.kopo.singleton.EmailService;
import kr.ac.kopo.singleton.InputManager;
import kr.ac.kopo.ui.mail.BaseMailState;
import kr.ac.kopo.ui.mail.IMailUI;
import kr.ac.kopo.vo.EmailVO;

public class ReceivedListViewState extends BaseMailState{
	int emailPerPage;
	int curPage;
	List<EmailVO> emailList;
	
	public ReceivedListViewState(IMailUI parent, String id, String description) {
		super(parent, id, description);
		//emailPerPage = ;
		//curPage = ;
	}

	@Override
	public void execute() {
		System.out.print("페이지당 노출할 이메일 개수를 입력하십시오: ");
		emailPerPage = InputManager.getInstance().nextInt();
		System.out.print("볼 페이지를 입력하십시오(첫 페이지 1): ");
		curPage = InputManager.getInstance().nextInt();

		System.out.println();
		System.out.println();
		
		while(true) {
			emailList = EmailService.getInstance().getEmailList(emailPerPage, curPage);
			
			System.out.println("번호\t코드\t제목\t보낸이\t아이디\t받은날짜");
			
			for(int i = 0; i < emailList.size(); i++) {
				EmailVO item = emailList.get(i);
				System.out.printf("%d\t%d\t%s\t%s\t%d\t%s\n", (curPage-1)*emailPerPage + 1 + i, item.getCode(), item.getTitle(), item.getSenderName(), item.getSenderID(), item.getDate());
			}
			
			System.out.println("현제페이지: " + curPage);
			System.out.println();
			System.out.println();
			System.out.println("번호를 입력하거나 0번을 눌러 뒤로가기");
			
			InputManager.getInstance().nextInt();
		}
	}
	
}
