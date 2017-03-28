/**
	класс реализует калькулятор. 
*/
public class Calculator {
	/**
		Результат вычисления 
	*/

	private int result;

	public static void main(String args[]) {
		System.out.println("Calculator");
	}
	
	/**
		Симулируем аргументы
		@param params аргументы симулирования 
	*/	

	public void add(int... params) {
		for(Integer param : params){
			this.result += param;
		}
	}

	/**
		Получить результат.
		@return результат вычисления 
	*/

	public int getResult() {
		return this.result;
	}

	/**
		Очистить результат.
	*/

	public void cleanResult() {
		this.result = 0;	
	}
}