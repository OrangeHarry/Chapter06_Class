package ch06_5_instance_static;

public class ShopService {
	//�̱��� �ʵ�
	private static ShopService service = new ShopService();
	
	//������
	private ShopService() {
		
	}
	//�޼ҵ�
	static ShopService getInstance(){
		return service;
	}
}
