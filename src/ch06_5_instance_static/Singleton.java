package ch06_5_instance_static;

/*
 * �̱��� ��ü �����
 * ��ü ���α׷����� only 1���� ��ü ����
 */

public class Singleton {
	
	//���� �ʵ�(������ ��ü [1��]�� �������� ����)
	private static Singleton ref = new Singleton(); //new�� ���ؼ� 1���� �ν��Ͻ�(��ü) ���� 
	               //Ŭ����                                  //Ŭ����
	
	//private ������
	//�ܺο��� ������ ȣ���� �ȵǵ���
	private Singleton() {
		System.out.println("Singlton Constructor");
	}
	
	//���� �޼ҵ�
	static Singleton getInstance() {
		  //Ŭ����            //�ּҹ�ȯ
		return ref;
	}
}
