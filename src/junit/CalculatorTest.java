package junit;

public class CalculatorTest {
	private static double result; //静态变量，用于存储变量结果
	public void add(int n){
		result = result +n;
	}
	public void substract(int n){
		result = result -1;  //Bug：正确的应该是result=result-n;
	}
	public void multiply(int n){
		// 此方法尚未写好
	}
	public void divide(int n){
		result = result /n;
	}
	public void square(int n){
		result = n*n;
	}
	public void squareRoot(int n){
		for (; ;);   //死循环
	}
	public void clear(){
		result = 0;
	}
	public double getresult(){
		return result;
	}
}
