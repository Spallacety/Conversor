import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifpi.conversor.Conversor;

public class ConversorTest {

	Conversor conversor;
	
	@Before
	public void init() {
		conversor = new Conversor();
	}
	
	@Test
	public void testa_valores_simples_de_um_digito(){
		assertEquals(1, conversor.converter("I"));
		assertEquals(50, conversor.converter("L"));
		assertEquals(1000, conversor.converter("M"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testa_letras_invalidas(){
		assertEquals(1, conversor.converter("R"));
	}
	
	@Test
	public void testa_conversao_de_valores_compostos_de_mais_de_uma_letra(){
		assertEquals(4, conversor.converter("IV"));
		assertEquals(900, conversor.converter("CM"));
		assertEquals(18, conversor.converter("XVIII"));
	}

}
