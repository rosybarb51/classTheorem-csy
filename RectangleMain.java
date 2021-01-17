
public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 2) 사각형 클래스를 생성하고 가로의 길이, 세로의 길이는 저장할 수 있는 멤버 변수를 선언 후 해당 사각형의 넓이를 구하는 메서드와 가로 및 세로의 길이의 합을 구하는 메서드를 선언한 후 실행 클래스에서 객체를 생성하여 넓이와 길이의 합을 구하는 프로그램을 작성하세요
		
		Rectangle rect = new Rectangle();
		rect.width = 10;
		rect.height = 5;
		
		rect.recArea();
		rect.recTotalLength();
	}

}
