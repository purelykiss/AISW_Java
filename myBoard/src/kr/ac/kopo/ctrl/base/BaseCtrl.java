package kr.ac.kopo.ctrl.base;

import java.util.Scanner;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;

public abstract class BaseCtrl implements IBoardCtrl{
	private Scanner sc;
	protected BoardService service;
	
	public BaseCtrl() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
