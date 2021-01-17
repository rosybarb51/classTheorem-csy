// 사용할 클래스를 직접 지정해서 사용
import ch06.hankook.Tire;
import ch06.hankook.SnowTire;
// 해당 패키지에 있는 모든 클래스를 한번에 다 로딩해서 사용
//import ch06.kumho.*;

public class Car {

	public static void main(String[] args) {
//		해당 패키지명 및 클래스 명을 모두 입력해야 클래스를 사용할 수 있음
//		import 를 사용해서 해당 패키지를 불러오면 클래스 명만 입력하여 사용할 수 있음
		Tire tire = new Tire();
		SnowTire snow = new SnowTire();
//		ch06.hankook.Tire tire = new ch06.hankook.Tire();
//		ch06.kumho.Tire tire2 = new ch06.kumho.Tire();
		Tire tire2 = new Tire();
		
		SnowTire snow1 = new SnowTire();
	}
}
