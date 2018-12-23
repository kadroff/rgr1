package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test4
public class Test4 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(1000, 45, 50);
		// сравнение результатов
		assertEquals(a.getCost(),"22500.0");
	}

}
