package homework5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		array_task1();
		array_task2();
		array_task3();
		array_task4();
		array_task5();
		array_task6();
		array_task7();
		array_task8();
		array_task9();

	}

	public static void array_task1() {
		/*
		 * 1. �������� ���������, ���������� ���������� ������������ ���������
		 * ��������� �������, � ������� ������������ ������ ���� ����.
		 */
		System.out.println("---������1---");
		int[] array = { 1, 2, 2, 6, 6, 6, 6, 4 };
		int max = Integer.MIN_VALUE;
		int nMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				nMax = 1;
			} else if (array[i] == max)
				nMax += 1;
		}
		System.out.print("���������� ����. ��������� ������ ������� = " + nMax);
	}

	public static void array_task2() {
		/*
		 * 2. �������� ���������, �������� ������, ����� ����������� (�� ����
		 * ������ ������� ������ ������� � ���������, ������ � � ������������� �
		 * �.�.), � ����� ��������.
		 */
		System.out.println("\n---������2---");
		int[] array = { 2, 4, 6, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int t1 = array[0];
		array[0] = array[3];
		array[3] = t1;

		int t2 = array[1];
		array[1] = array[2];
		array[2] = t2;

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void array_task3() {
		/*
		 * 3. ������� ��������� ������ �� ��������� ����� ��� ����� ������
		 * ����������� ������� ��� ���������. ������� ������ �� �����.
		 */
		System.out.println("\n---������3---");
		int[][] array = new int[3][(int) Math.floor(Math.random() * 10)];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor(Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void array_task4() {
		/*
		 * 4. �������� �� ����� ������ 11 ������ ������������������ ���������.
		 * ����������, ��� ������ � ������ ����� ������������������ �����
		 * ��������, � ������ ��������� � ����� ���� ����������.
		 */
		System.out.println("\n---������4---");
		int n1 = 1, n2 = 1, nn = 0;
		System.out.print(n1 + ", " + n2 + ", ");
		for (int i = 3; i <= 11; i++) {
			nn = n1 + n2;
			n1 = n2;
			n2 = nn;
			System.out.print(nn + ", ");
		}
	}

	public static void array_task5() {
		/*
		 * 5. � ������ N ������ � ������� �������������� �� �������� ��������
		 * �������. ������ ������ ���������� ���� ���������� � �������
		 * ���������� ����� ������� � �������� �� 000001 �� 999999. �����������
		 * ��������� ������� � �������� ����� ������ ��� ���� ������ �����
		 * ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102
		 * ��� 567576. ���������� ���� ������ �������� ������� ����������
		 * ������� ����������� ������ � ������ �����������, ��� ����� ���������
		 * �����������. � ������� ��������� ����������� ������� ����������
		 * ������� � ����� ������?
		 */
		System.out.println("\n---������5---");
		int count = 0;
		int a0, a1, a2, a3, a4, a5;
		for (a0 = 0; a0 <= 9; a0++) {
			for (a1 = 0; a1 <= 9; a1++) {
				for (a2 = 0; a2 <= 9; a2++) {
					for (a3 = 0; a3 <= 9; a3++) {
						for (a4 = 0; a4 <= 9; a4++) {
							for (a5 = 1; a5 <= 9; a5++) {
								if ((a0 + a1 + a2) == (a3 + a4 + a5))
									count++;
							}
						}
					}
				}
			}
		}
		System.out.print("���������� ������� - " + count);
	}

	public static void array_task6() {
		/*
		 * ������� ��������� ������ �� 6 ����� � 7 �������� � ������ ��
		 * ��������� ����� ����� �� ������� [0-9] . ������� ������ �� �����.
		 */
		System.out.println("\n---������6---");
		int array[][] = new int[6][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor(Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void array_task7() {
		/*
		 * 7. ������� ������ String[] a, � ������� �������� �����. ���������
		 * ������������� ��� � ��������� ������ int[][] c, ����� ������� �����
		 * ������ ����� ���� �����. ��������: ["1 26 85", "89 265 86",
		 * "896 745 36"] [ [1, 26, 85], [89, 265, 86], [896, 745, 36]] ���������
		 * ����� ������� ����� ������� �������� �������. [ [1, 8, 13], [17, 13,
		 * 14], [23, 16, 9]] ����������� String.split
		 */
		System.out.println("\n---������7---");
		// �� �����
	}

	public static void array_task8() {
		/*
		 * 8. �������� ����� �� 0 �� 100. � ��� ���� ���� ������� �� ����������.
		 * ��� ������ ������� ����� ���������� ��������� - "����" ��� "�����".
		 * ���� ��������, ���������� � ���� �������, �� ��������. ���� ���,
		 * ������� ��������� � ����� ���������� � ��������� ��� ����� ���
		 * ��������� ���������� ����� � ������ � ������� ����������� ���: Random
		 * r = new Random(); int secret = r.nextInt(100) + 1; int i =
		 * System.in.read();
		 */
		System.out.println("\n---������8---");
		Random random = new Random();
		int secret = random.nextInt(100 + 1);
		System.out.println(secret);
		System.out.println("����. ������� ����� �� 0 �� 100 � ���� �������");

		for (int i = 1; i <= 7; i++) {
			System.out.println("������� - " + i);
			System.out.print("������� ����� - ");
			Scanner in = new Scanner(System.in);
			int chislo = in.nextInt();
			if (chislo > secret) {
				System.out.print("�����\n");
			} else if (chislo < secret) {
				System.out.print("����\n");
			} else if (chislo == secret) {
				System.out.print("�� �������! c " + i + " �������");
				break;
			}
			System.out.println("�� �� �������! ");
		}
	}

	public static void array_task9() {
		/*
		 * 9. ���� ������, ����������� ���������� ������� �� 0 �� 100. �������
		 * ���������� �������� � ����������: 10-20, 30-40, 40-50.
		 */
		System.out.println("\n---������9---");
		Random random = new Random();
		Integer array[][] = new Integer[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(101);
			}
		}
		System.out.println(Arrays.deepToString(array));

		int item1 = 0, item2 = 0, item3 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] >= 10) & (array[i][j] <= 20)) {
					item1++;
				} else if ((array[i][j] >= 30) & (array[i][j] <= 40)) {
					item2++;
				} else if ((array[i][j] >= 40) & (array[i][j] <= 50)) {
					item3++;
				}
			}
		}
		System.out.println("��������� � �������� 10-20 - " + item1);
		System.out.println("��������� � �������� 30-40 - " + item2);
		System.out.println("��������� � �������� 40-50 - " + item3);
	}

}
