package ch06_4_method;

public class Square {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
    // 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
//이게 오버로딩이지