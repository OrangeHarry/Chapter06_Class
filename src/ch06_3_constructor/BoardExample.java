package ch06_3_constructor;

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board("Á¦¸ñ", "³»¿ë");

		Board board2 = new Board("Á¦¸ñ", "³»¿ë", "ÇÏÇå¹Î");

		Board board3 = new Board("Á¦¸ñ", "³»¿ë", "ÇÏÇå¹Î", "2021-07-30");

		Board board4 = new Board("Á¦¸ñ", "³»¿ë", "ÇÏÇå¹Î", "2021-07-30", 30);
	}
}
