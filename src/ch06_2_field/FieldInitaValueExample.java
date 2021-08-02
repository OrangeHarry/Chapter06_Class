package ch06_2_field;

class FieldInitaValue {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;

	float floatField;
	double doubleField;

	int[] arrField;
	String referenceField;
	
	public FieldInitaValue() {
		this.booleanField = true;
	}//생성자는 리턴값이 필요없당
}

public class FieldInitaValueExample {
	public static void main(String[] args) {
		FieldInitaValue fiv = new FieldInitaValue();

		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField); //char은 초기화값이 아무것도 없네
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}
}
