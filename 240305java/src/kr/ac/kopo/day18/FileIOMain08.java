package kr.ac.kopo.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {

	public static void write() {
		Member m = new Member("hong", "홍길동", "010-1111-2222");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/member.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(m);
			oos.flush();
			
			System.out.println("member.dat 저장완료...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos, oos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/member.dat");
			ois = new ObjectInputStream(fis);
			
			Member m = (Member)ois.readObject();
			System.out.println("읽어온 데이터: "+ m.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis, ois);
		}
	}
	
	public static void main(String[] args) {
		read();
		//write();
	}
}
