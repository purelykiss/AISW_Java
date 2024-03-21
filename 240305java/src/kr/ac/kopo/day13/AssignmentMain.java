package kr.ac.kopo.day13;

public class AssignmentMain {
	public static void main(String[] args) {
		Shape[] shapes = {new Triangle(), new Square(), new Rectangle(), new Circle()};
		Calculator cal = new Calculator(shapes);
		
		int inputNum = cal.input();
		cal.calculate(inputNum);
	}
}
