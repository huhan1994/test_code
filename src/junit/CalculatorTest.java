package junit;

public class CalculatorTest {
	private static double result; //��̬���������ڴ洢�������
	public void add(int n){
		result = result +n;
	}
	public void substract(int n){
		result = result -1;  //Bug����ȷ��Ӧ����result=result-n;
	}
	public void multiply(int n){
		// �˷�����δд��
	}
	public void divide(int n){
		result = result /n;
	}
	public void square(int n){
		result = n*n;
	}
	public void squareRoot(int n){
		for (; ;);   //��ѭ��
	}
	public void clear(){
		result = 0;
	}
	public double getresult(){
		return result;
	}
}
