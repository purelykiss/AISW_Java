package kr.ac.kopo.day18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/test.txt");
			dos = new DataOutputStream(fos);
			
			fos.write(10);
			fos.write('A');
			fos.flush();
			
			dos.writeInt(10);
			dos.writeChar('A');
			dos.flush();
			
			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			FileClose.close(dos);
		}
	}
	
	public static void main(String[] args) {
		write();
	}
}
