package ch06_5_instance_static;

public class EarthExample {
	public static void main(String[] args) {
//		System.out.printf("지구의 반지름 : %fkm\n", Earth.EARTH_RADIUS);
//		System.out.printf("지구의 표면적 : %fkm^2\n", Earth.EARTH_AREA); 야 이거 값이 다르다??
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
	}
}
