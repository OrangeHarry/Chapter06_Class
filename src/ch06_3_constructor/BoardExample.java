package ch06_3_constructor;

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board("����", "����");

		Board board2 = new Board("����", "����", "�����");

		Board board3 = new Board("����", "����", "�����", "2021-07-30");

		Board board4 = new Board("����", "����", "�����", "2021-07-30", 30);
	}
}
