
//		문제1) 제목과 저자의 정보를 저장하는 멤버 변수를 가지고 있는 Book3 클래스를 생성하고, 사용자로부터 책의 제목과 저자를 입력받아 객체 배열에 저장하고 출력하는 프로그램을 작성하세요
//		조건1. 제목 : title, 저자 : author
//		조건2. Book3 클래스에 생성자를 사용하여 제목과 저자를 입력
//		조건3. 화면 출력은 Book3Main 클래스의 main 메서드에서 println 을 통해서 진행
public class Book3 {
	String title;
	String author;
	
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
