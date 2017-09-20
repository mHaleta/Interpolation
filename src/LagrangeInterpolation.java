public class LagrangeInterpolation
{
	public static double lagrange(double x0, int n, double[] x, double[] y)
	{
		double[] xn = new double[n]; //Масив, елементами якого є L(i, n-1), i = 0..n-1
		double res=0;  //Результат
		for(int i=0; i<n; i++)
		{
			xn[i]=1;
			for(int j=0; j<n; j++)
			{
				if(i == j)
					continue;
				xn[i] *= (x0-x[j])/(x[i]-x[j]); //Формула обчислення L(i, n-1), i = 0..n-1
			}
			res = res + y[i]*xn[i]; //Формула обчислення результату: значення інтерполянти в заданій точці
		}
		return res;
	}
}
