package exemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.casnav.mauro.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora c = new Calculadora();
		assertEquals(c.somar(8, 5), 13);
	}

	@Test
	public void testSubtracao() {
		Calculadora c = new Calculadora();
		assertEquals(c.subtracao(8, 5),3);
	}

	@Test
	public void testMultiplicacao() {
		Calculadora c = new Calculadora();
		assertEquals(c.multiplicacao(8, 5),40);
	}

	@Test
	public void testDivisao() {
		Calculadora c = new Calculadora();
		assertEquals(c.divisao(4, 2),2 );
	}
	

}
