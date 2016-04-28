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
		 * 1. Напишите программу, печатающую количество максимальных элементов
		 * непустого массива, в которой используется только один цикл.
		 */
		System.out.println("---Задача1---");
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
		System.out.print("Количество макс. элементов нашего массива = " + nMax);
	}

	public static void array_task2() {
		/*
		 * 2. Напишите программу, печатает массив, затем инвертирует (то есть
		 * меняет местами первый элемент с последним, второй — с предпоследним и
		 * т.д.), и вновь печатает.
		 */
		System.out.println("\n---Задача2---");
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
		 * 3. Создать двумерный массив из случайных чисел так чтобы размер
		 * внутреннего массива был случайным. Вывести массив на экран.
		 */
		System.out.println("\n---Задача3---");
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
		 * 4. Выведите на экран первые 11 членов последовательности Фибоначчи.
		 * Напоминаем, что первый и второй члены последовательности равны
		 * единицам, а каждый следующий — сумме двух предыдущих.
		 */
		System.out.println("\n---Задача4---");
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
		 * 5. В городе N проезд в трамвае осуществляется по бумажным отрывным
		 * билетам. Каждую неделю трамвайное депо заказывает в местной
		 * типографии рулон билетов с номерами от 000001 до 999999. «Счастливым»
		 * считается билетик у которого сумма первых трёх цифр номера равна
		 * сумме последних трёх цифр, как, например, в билетах с номерами 003102
		 * или 567576. Трамвайное депо решило подарить сувенир обладателю
		 * каждого счастливого билета и теперь раздумывает, как много сувениров
		 * потребуется. С помощью программы подсчитайте сколько счастливых
		 * билетов в одном рулоне?
		 */
		System.out.println("\n---Задача5---");
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
		System.out.print("Счастливых билетов - " + count);
	}

	public static void array_task6() {
		/*
		 * Создать двумерный массив из 6 строк и 7 столбцов в каждой из
		 * случайных целых чисел из отрезка [0-9] . Вывести массив на эеран.
		 */
		System.out.println("\n---Задача6---");
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
		 * 7. Имеется массив String[] a, в котором хранятся числа. Требуется
		 * преобразовать его в двумерный массив int[][] c, потом найдите сумму
		 * каждой цифры этих чисел. Например: ["1 26 85", "89 265 86",
		 * "896 745 36"] [ [1, 26, 85], [89, 265, 86], [896, 745, 36]] Результат
		 * сумма каждого числа каждого элемента массива. [ [1, 8, 13], [17, 13,
		 * 14], [23, 16, 9]] Понадобится String.split
		 */
		System.out.println("\n---Задача7---");
		// не решил
	}

	public static void array_task8() {
		/*
		 * 8. Загадаем число от 0 до 100. У вас есть семь попыток на угадывание.
		 * При каждой попытке будет выводиться сообщение - "Мало" или "Много".
		 * Если угадаете, уложившись в семь попыток, то выиграли. Если нет,
		 * Выводим сообщение и снова загадываем и повторяем все снова Для
		 * генерации секретного числа и чтения с консоли используете код: Random
		 * r = new Random(); int secret = r.nextInt(100) + 1; int i =
		 * System.in.read();
		 */
		System.out.println("\n---Задача8---");
		Random random = new Random();
		int secret = random.nextInt(100 + 1);
		System.out.println(secret);
		System.out.println("Игра. Отгадай число от 0 до 100 с семи попыток");

		for (int i = 1; i <= 7; i++) {
			System.out.println("Попытка - " + i);
			System.out.print("Введите число - ");
			Scanner in = new Scanner(System.in);
			int chislo = in.nextInt();
			if (chislo > secret) {
				System.out.print("Много\n");
			} else if (chislo < secret) {
				System.out.print("Мало\n");
			} else if (chislo == secret) {
				System.out.print("Вы угадали! c " + i + " попытки");
				break;
			}
			System.out.println("Вы не угадали! ");
		}
	}

	public static void array_task9() {
		/*
		 * 9. Есть массив, заполненный случайными числами от 0 до 100. Вывести
		 * количество значений в диапазонах: 10-20, 30-40, 40-50.
		 */
		System.out.println("\n---Задача9---");
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
		System.out.println("Вхождений в диапазон 10-20 - " + item1);
		System.out.println("Вхождений в диапазон 30-40 - " + item2);
		System.out.println("Вхождений в диапазон 40-50 - " + item3);
	}

}
