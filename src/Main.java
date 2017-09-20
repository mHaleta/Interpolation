import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args)
	{
		System.out.printf("!!!УВАГА!!!\n");
		System.out.printf("Програма працює в тестовому режимі, і в ній не передбачені помилки введення\n\n");
		Scanner in = new Scanner(System.in);
		System.out.print("Введіть кількість вузлів інтерполяції: ");
		int n = in.nextInt();
		System.out.println();
		double[] x = new double[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Введіть х["+i+"]: ");
			x[i] = in.nextDouble();
		}
		System.out.printf("\n");
		double[] y = new double[n];
		for(int i=0; i<n; i++)
		{
			y[i] = Math.log(x[i]);
			System.out.printf("ln(x[%d]) = %.3f\n", i, y[i]);
		}
		System.out.printf("\n");
		System.out.print("Знайти значення інтерполянти в точці х0 = ");
		double x0 = in.nextDouble();
		System.out.printf("\nНатисніть 1 для інтерполювання методом Лагранжа");
		System.out.printf("\nНатисніть 2 для інтерполювання методом Ньютона");
		System.out.printf("\n\nНатисніть потрібну клавішу: ");
		byte choise = in.nextByte();
		System.out.println();
		in.close();
		switch(choise)
		{
			case 1:
				System.out.printf("Результат: %.3f", LagrangeInterpolation.lagrange(x0, n, x, y));
				break;
			case 2:
				System.out.printf("Результат: %.3f", NewtonInterpolation.newton(x0, n, x, y));
				break;
		}
	}
}
