package kr.ac.kopo.ui.receivedState;

import java.util.List;

import kr.ac.kopo.singleton.EmailService;
import kr.ac.kopo.singleton.InputManager;
import kr.ac.kopo.singleton.ViewManager;
import kr.ac.kopo.ui.mail.BaseMailState;
import kr.ac.kopo.ui.mail.IMailUI;
import kr.ac.kopo.vo.EmailVO;

public class ReceivedListViewState extends BaseMailState{
	int emailPerPage;
	int curPage;
	List<EmailVO> emailList;
	
	public ReceivedListViewState(IMailUI parent) {
		super(parent, "listView", "전체 메일 보기");
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
		
		boolean flagStateFinished = false;
		while(!flagStateFinished) {
			emailList = EmailService.getInstance().getEmailList(1, emailPerPage, curPage);
			
			System.out.println("번호\t코드\t제목\t보낸이\t아이디\t받은날짜");
			
			for(int i = 0; i < emailList.size(); i++) {
				EmailVO item = emailList.get(i);
				System.out.printf("%d\t%d\t%s\t%s\t%s\t%s\n", (curPage-1)*emailPerPage + 1 + i, item.getCode(), item.getTitle(), item.getSenderName(), item.getSenderID(), item.getDate());
			}
			
			System.out.println("현제페이지: " + curPage);
			System.out.println();
			System.out.println();
			boolean flagValid = false;
			while(!flagValid) {
				System.out.println("메일 번호를 입력해서 열람, 0번을 눌러 뒤로가기,");
				System.out.println("다음페이지로 넘어가려면 아무 입력 없이 엔터");
				String input = InputManager.getInstance().nextLine();
				if(input.equals("")) {
					curPage++;
					flagValid = true;
				}else if(input.equals("0")) {
					parent.changeState(0);
					flagValid = true;
					flagStateFinished = true;
				}else {
					boolean flagInt = false;
					try {
						int n = Integer.parseInt(input);
						if(n >= (curPage-1)*emailPerPage + 1 & n <= curPage*emailPerPage) {
							ViewManager.getInstance().ViewMail(1, n);
							flagInt = true;
						}
					} catch (Exception e) {}
					if(flagInt) {
						flagValid = true;
					}
				}
			}
		}
	}
	
}
