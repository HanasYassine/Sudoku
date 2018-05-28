package com.act.hns;


import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Test unitaire pour la classe GrilleImpl. Ma classe GrilleImpl.
 * 
 * @author yassinehanas@gmail.com (Hanas Yassine).
 *
 */
public class GrilleTest extends TestCase {

	/**
	 * M�thode qui initialise notre Grille
	 * 
	 * @param grilleImpl
	 */
	private void initSudoku(final GrilleImpl grilleImpl) {
		grilleImpl.setValue(0, 0, '5');
		grilleImpl.setValue(0, 1, '7');
		grilleImpl.setValue(0, 2, '4');

		grilleImpl.setValue(0, 3, '9');
		grilleImpl.setValue(0, 4, '2');
		grilleImpl.setValue(0, 5, '3');

		grilleImpl.setValue(0, 6, '6');
		grilleImpl.setValue(0, 7, '8');
		grilleImpl.setValue(0, 8, '1');

		grilleImpl.setValue(1, 0, '8');
		grilleImpl.setValue(1, 1, '6');
		grilleImpl.setValue(1, 2, '9');

		grilleImpl.setValue(1, 3, '7');
		grilleImpl.setValue(1, 4, '5');
		grilleImpl.setValue(1, 5, '1');

		grilleImpl.setValue(1, 6, '3');
		grilleImpl.setValue(1, 7, '4');
		grilleImpl.setValue(1, 8, '2');

		grilleImpl.setValue(2, 0, '1');
		grilleImpl.setValue(2, 1, '3');
		grilleImpl.setValue(2, 2, '2');

		grilleImpl.setValue(2, 3, '4');
		grilleImpl.setValue(2, 4, '8');
		grilleImpl.setValue(2, 5, '6');

		grilleImpl.setValue(2, 6, '9');
		grilleImpl.setValue(2, 7, '5');
		grilleImpl.setValue(2, 8, '7');

		grilleImpl.setValue(3, 0, '3');
		grilleImpl.setValue(3, 1, '4');
		grilleImpl.setValue(3, 2, '5');

		grilleImpl.setValue(3, 3, '8');
		grilleImpl.setValue(3, 4, '1');
		grilleImpl.setValue(3, 5, '7');

		grilleImpl.setValue(3, 6, '2');
		grilleImpl.setValue(3, 7, '6');
		grilleImpl.setValue(3, 8, '9');

		grilleImpl.setValue(4, 0, '6');
		grilleImpl.setValue(4, 1, '9');
		grilleImpl.setValue(4, 2, '8');

		grilleImpl.setValue(4, 3, '3');
		grilleImpl.setValue(4, 4, '4');
		grilleImpl.setValue(4, 5, '2');

		grilleImpl.setValue(4, 6, '1');
		grilleImpl.setValue(4, 7, '7');
		grilleImpl.setValue(4, 8, '5');

		grilleImpl.setValue(5, 0, '7');
		grilleImpl.setValue(5, 1, '2');
		grilleImpl.setValue(5, 2, '1');

		grilleImpl.setValue(5, 3, '6');
		grilleImpl.setValue(5, 4, '9');
		grilleImpl.setValue(5, 5, '5');

		grilleImpl.setValue(5, 6, '8');
		grilleImpl.setValue(5, 7, '3');
		grilleImpl.setValue(5, 8, '4');

		grilleImpl.setValue(6, 0, '4');
		grilleImpl.setValue(6, 1, '1');
		grilleImpl.setValue(6, 2, '3');

		grilleImpl.setValue(6, 3, '5');
		grilleImpl.setValue(6, 4, '6');
		grilleImpl.setValue(6, 5, '9');

		grilleImpl.setValue(6, 6, '7');
		grilleImpl.setValue(6, 7, '2');
		grilleImpl.setValue(6, 8, '8');

		grilleImpl.setValue(7, 0, '9');
		grilleImpl.setValue(7, 1, '5');
		grilleImpl.setValue(7, 2, '7');

		grilleImpl.setValue(7, 3, '2');
		grilleImpl.setValue(7, 4, '3');
		grilleImpl.setValue(7, 5, '8');

		grilleImpl.setValue(7, 6, '4');
		grilleImpl.setValue(7, 7, '1');
		grilleImpl.setValue(7, 8, '6');

		grilleImpl.setValue(8, 0, '2');
		grilleImpl.setValue(8, 1, '8');
		grilleImpl.setValue(8, 2, '6');

		grilleImpl.setValue(8, 3, '1');
		grilleImpl.setValue(8, 4, '7');
		grilleImpl.setValue(8, 5, '4');

		grilleImpl.setValue(8, 6, '5');
		grilleImpl.setValue(8, 7, '9');
		grilleImpl.setValue(8, 8, '3');
	}

	/**
	 * Test de la methode testGetDimension() .
	 */
	public void testGetDimension() {
		GrilleImpl grille = new GrilleImpl(9);
		int val = 9;
		int resultat = grille.getDimension();
		Assert.assertEquals(val, resultat);
	}

	/**
	 * Test de la method testSetValue().
	 */
	public void testSetValue() {
		int x = 5;
		int y = 3;
		char value = '9';
		GrilleImpl grille = new GrilleImpl(9);
		grille.setValue(x, y, value);
		char val = grille.getValue(x, y);
		char result = '9';
		Assert.assertEquals(val, result);

		grille = new GrilleImpl(9);
		grille.setValue(1, 1, '1');

		try {
			grille.setValue(0, 1, '1');
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test de la m�thode testGetValue().
	 */
	public void testGetValue() {
		GrilleImpl grille = new GrilleImpl(9);
		try {
			grille.getValue(-1, 0);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.getValue(0, -1);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.getValue(19, 0);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.getValue(0, 19);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test de la methode testComplete().
	 */
	public void testComplete() {
		GrilleImpl instance = new GrilleImpl(9);
		initSudoku(instance);
		boolean expResult = true;
		boolean result = instance.complete();
		Assert.assertEquals(expResult, result);

		instance = new GrilleImpl(9);
		expResult = false;
		result = instance.complete();
		Assert.assertEquals(expResult, result);
	}

	/**
	 * Test of method testPossible().
	 */
	public void testPossible() {
		int x = 0;
		int y = 1;
		char value = '1';
		GrilleImpl grille = new GrilleImpl(9);
		grille.setValue(0, 0, '1');
		boolean val = false;
		boolean resultat = grille.possible(x, y, value);
		Assert.assertEquals(val, resultat);

		// Au cas o� l'indices est incorrects
		try {
			grille.possible(-1, y, value);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.possible(0, -1, value);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.possible(19, 0, value);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		try {
			grille.possible(0, 19, value);
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}

		// Au cas o� les caract�re non autoris�
		try {
			grille.setValue(x, y, 'Z');
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
		// Valeur existant en ligne
		grille = new GrilleImpl(9);
		initSudoku(grille);
		val = false;
		resultat = grille.possible(1, 0, '5');
		Assert.assertEquals(val, resultat);

		// Valeur existant en colone
		grille = new GrilleImpl(9);
		grille.setValue(1, 1, '1');
		val = false;
		resultat = grille.possible(0, 1, '1');
		Assert.assertEquals(val, resultat);

		// Valeur existant dans le carr� local
		grille = new GrilleImpl(9);
		grille.setValue(1, 1, '1');
		val = false;
		resultat = grille.possible(0, 0, '1');
		Assert.assertEquals(val, resultat);
	}
}
