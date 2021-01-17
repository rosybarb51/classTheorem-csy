import java.util.Scanner;

public class Book3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1) 제목과 저자의 정보를 저장하는 멤버 변수를 가지고 있는 Book3 클래스를 생성하고, 사용자로부터 책의 제목과 저자를 입력받아 객체 배열에 저장하고 출력하는 프로그램을 작성하세요
//		조건1. 제목 : title, 저자 : author
//		조건2. Book3 클래스에 생성자를 사용하여 제목과 저자를 입력
//		조건3. 화면 출력은 Book3Main 클래스의 main 메서드에서 println 을 통해서 진행
		
		Scanner sc = new Scanner(System.in);
		
		Book3[] books = new Book3[3];
		
//		books[0] = new Book3("제목1", "저자1");
//		books[1] = new Book3("제목2", "저자2");
//		books[2] = new Book3("제목3", "저자3");
		
		for (int i = 0; i < books.length; i++) {
			books[i] = new Book3("제목" + i, "저자" + i);
//			books[i] = new Book3(sc.nextLine(), sc.nextLine());
		}
		
		for (int i = 0; i < books.length; i++) {
			System.out.println("책 " + books[i].title + "의 저자는 " + books[i].author + "입니다.");
		}
		
		
//		문제2) 문제 1번의 Book3 클래스의 내용을 수정하여 Book4 클래스를 생성하고, 멤버 변수인 title, author을 외부에서 직접 접근할 수 없도록하고, getter/setter를 이용하여 데이터는 변경할 수 있도록 하며, 사용자로부터 책의 정보를 입력받아 객체의 배열에 저장하고 출력하는 프로그램을 작성하세요
//		조건1. getter/setter 사용
//		조건2. 접근제한자 private 사용
//		조건3. 생성자 오버로딩을 통하여 3개의 생성자를 사용
//		조건4. this() 를 활용
		
// 파일명 : 20201229_1번_이름.zip
// 파일명 : 20201229_2번_이름.zip
		
		Book4[] books4 = new Book4[5];
		
		for (int i = 0; i < books4.length; i++) {
			books4[i] = new Book4("제목" + i, "저자" + i);
		}
		
		for (int i = 0; i < books4.length; i++) {
			System.out.println("책 " + books4[i].getTitle() + "의 저자는 " + books4[i].getAuthor() + "입니다.");
		}
		
		System.out.println("\n----------\n");
		
//		문자열은 문자의 배열임
//		c 언어에서는 문자열을 char 타입 배열로 선언해서 사용함
		String str = "안녕하세요";
		System.out.println(str.length());
//		charAt(index) : 해당 문자열의 index에 해당하는 글자를 가져옴
		char num1 = str.charAt(0);
		System.out.println(num1);
		
	}
	
//	문제3 ) 사용자 입력을 받아서 끝말잇기 프로그램을 작성하세요
//	조건 1. 처음 사용하는 단어는 '아버지'를 사용
//	조건 2. 끝말잇기가 실패 시 화면에 '끝말잇기 실패' 라는 메시지를 띄우고 프로그램 종료

//	끝말잇기를 시작합니다.
//	시작 단어는 '아버지' 입니다.
//	> 아버지
//	> 지하철
//	> 철근
//	> 근육
//	> ㅇㅇㅇ
//	끝말잇기를 실패했습니다.
//	프로그램을 종료합니다.
	
//	문제4) N명이 참가하는 끝말잇기 프로그램 작성하세요
//	조건1. 처음 시작 단어는 '아버지'를 사용
//	조건2. 프로그램 시작 시 참가 인원 및 이름을 입력 받음
//	조건3. 순서대로 끝말잇기를 진행함
//	조건4. 단어가 틀렸을 경우 'xxx가 틀렸습니다' 라는 메시지 출력
//	조건5. 지연시간을 확인하지는 않음
	
//	끝말잇기를 시작합니다.
//	참가 인원을 입력하세요 : 
//	참가자의 이름을 입력하세요 : 참가1
//	참가자의 이름을 입력하세요 : 참가2
//	참가자의 이름을 입력하세요 : 참가3
//	시작 단어는 '아버지' 입니다.
//	참가1> 아버지
//	참가2> 지하철
//	참가3> 철근
//	참가1> 근육
//	참가2> ㅇㅇㅇ
//	참가2가 끝말잇기를 실패했습니다.
//	프로그램을 종료합니다.
}











