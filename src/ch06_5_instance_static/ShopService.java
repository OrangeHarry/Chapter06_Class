package ch06_5_instance_static;

public class ShopService {
	//싱글톤 필드
	private static ShopService service = new ShopService();
	
	//생성자
	private ShopService() {
		
	}
	//메소드
	static ShopService getInstance(){
		return service;
	}
}
