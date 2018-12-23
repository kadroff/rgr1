package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test3
public class Test3 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(100, 20, 60);
		// сравнение результатов
		assertEquals(a.getFuel(),"20.0");
	}

}
