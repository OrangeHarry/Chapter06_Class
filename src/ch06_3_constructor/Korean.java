package ch06_3_constructor;

public class Korean {
	//�ʵ�
	String nation = "���ѹα�";
	String name;
	String ssn; // �ֹι�ȣ�ΰ���
	
	//������
	public Korean(String n, String s) {
		name = n;       //�ʵ�� ���� �̸��� �� ��� �ؿ� ��ó���� 
		ssn = s;        //�򰥸� �� �־ this�� ����ϴ� ������ �ִ�.
	}
}
