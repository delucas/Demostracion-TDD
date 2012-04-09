package ar.edu.untref.tdd;

import org.junit.Test;

import junit.framework.Assert;

public class RangoTests {

	@Test
	public void testQueUnRangoSeCreeCorrectamente(){
		
		Rango r = new Rango(0, 5);
		
		Assert.assertNotNull(r);
		
	}
	
	@Test(expected=Error.class)
	public void testQueUnRangoNoValidoFalle(){
		
		Rango r = new Rango(5, 0);
		
	}
	
	@Test
	public void testQueUnNumeroDentroDelRangoEstaDentroDelRango(){
		
		Rango r = new Rango(0, 5);
		int numero = 2;
		
		Assert.assertTrue("El número debería estar dentro del rango", r.contiene(numero));
		
	}
	
	@Test
	public void testQueUnNumeroFueraDelRangoNoEstaDentroDelRango(){
		
		Rango r = new Rango(0, 5);
		int numero = 10;
		
		Assert.assertFalse("El número debería estar fuera del rango", r.contiene(numero));
		
	}
	
	@Test
	public void testQueUnNumeroEnElBordeDelRangoEstaDentroDelRango(){
		
		Rango r = new Rango(0, 5);
		int numero = 5;
		
		Assert.assertTrue("El número debería estar dentro del rango", r.contiene(numero));
		
	}
	
	// Cómo seguir: intersección de rangos.
	// Otro caso: verificar casos en que los rangos sean "abiertos", o "mixtos"
	
}
