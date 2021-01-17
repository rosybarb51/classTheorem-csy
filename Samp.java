
//문제 1. 다음코드에서 잘못된 부분이 3군데 있다 모두 수정하시오
public class Samp {
	int id;

//	1. Samp은 생성자인데 반환값이 포함되어 있음 
//	public void Samp(int x) {
//		this.id = x;
//	}
	
	public Samp(int x) {
		this.id = x;
	}

//	2. Samp은 생성자인데 반환값이 포함되어 있음
//	public void Samp() {
//		System.out.println("생성자호출");
//		this() 는 생성자의 첫줄에 입력해야 함
//		this(0);
//	}
	
	public Samp() {
		this(0);
		System.out.println("생성자호출");
	}
}
