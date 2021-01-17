
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.getBookInfo();
		book1.setBookInfo("구름빵", "백희나");
		book1.getBookInfo();
		
		Book book2 = new Book("do it 자바프로그래밍 입문", "박은종");
		book2.getBookInfo();
		
		
		Book2 b2 = new Book2();
		b2.setPrice(1000);
		b2.setTitle("공정하다는 착각");
		b2.setAuthor("마이크센델");
		
		System.out.println(b2.getAuthor());
	}

}
