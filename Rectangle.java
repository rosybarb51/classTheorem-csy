
public class Rectangle {
//	너비와 높이를 저장할 멤버 변수
	int width;
	int height;
	
//	사각형의 넓이를 구하는 메서드
	public void recArea() {
		System.out.println("사각형의 넓이는 " + width * height);
	}
	
//	사각형의 둘레를 구하는 메서드
	public void recTotalLength() {
		System.out.println("사각형의 둘레는 " + (width*2 + height * 2));
	}
}
