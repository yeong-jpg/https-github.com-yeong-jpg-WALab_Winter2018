package workbook.StepD;

import java.util.Scanner;

public class D07 {
	private int a;
	private int b;
	private int x_begin;
	private int x_end;
	private int x;
	private int y;
 
	/** 생성자 **/
	public D07() {
		input();
	}

	/** 값 출력 **/
	public void printResult() {
		for (int i = x_begin; i <= x_end; i++) {
			x = i;
			y = getY();
			System.out.println("좌표 (" + x + ", " + y + ")");
		}
	}

	/** 갑 입력 **/
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오: ");
		x_begin = sc.nextInt();
		x_end = sc.nextInt();
	}

	/** 값 계산 **/
	int getY() {
		y = x * a + b;
		return y;
	}

}
