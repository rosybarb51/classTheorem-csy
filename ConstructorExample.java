
//문제 2. 다음 코드는 오류를 포함하고 있다. 이유를 설명하고 올바르게 수정하시오
public class ConstructorExample {
	int x;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public ConstructorExample(int x) {
		this.x = x;
	}

//	ConstructorExample 클래스에는 매개변수를 1개 입력 받는 생성자가 존재할 뿐 기본생성자는 없으나
//	기본생성자를 사용해서 객체를 생성하고 있음
//	public static void main(String[] args) {
//		ConstructorExample a = new ConstructorExample();
//		int n = a.getX();
//	}
	
	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample(10);
		int n = a.getX();
	}
}


// 문제 3) this와 this()의 차이
// this 는 객체 자기 자신을 뜻하는 키워드로 객체 내에서 지역 변수와 이름이 동일한 멤버를 선택할 때
// 주로 사용하고, this() 는 객체 내에서 동일한 이름의 생성자가 있을 경우 해당하는 생성자 내에서
// 다른 생성자를 호출하기 위해서 사용하는 명령어