package processos;


import junit.framework.TestCase;

public class CaculoTest extends TestCase{
	
	public void testExecutaCalculo() {
		
		
		float PassaValor1 = 10;
		float PassaValor2 = 5;
		float RetornoEsperado = 15;
		
		
		float RetornaFeito = Calculo.ExecutaCalculo(PassaValor1, PassaValor2);
		
		assertEquals( RetornoEsperado, RetornaFeito, 0);
		
	}



}
