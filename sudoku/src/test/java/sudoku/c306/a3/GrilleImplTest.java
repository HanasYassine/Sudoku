
package sudoku.c306.a3;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author Donald
 *
 */
public class GrilleImplTest extends TestCase {

	
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
     * Test method for {@link sudoku.c306.a3.GrilleImpl#getDimension()}.
     */
    public final void testGetDimension() {
        GrilleImpl g = new GrilleImpl();
        Assert.assertNotNull(g.getDimension());
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#GrilleImpl(int)}.
     */
    public final void testGrilleImplInt() {
        final int a = 3;
        final int b = 3;
        GrilleImpl g = new GrilleImpl(a);
        Assert.assertEquals(b, g.getDimension());
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#setValue(int, int, char)}.
     */
    public final void testSetValue() {
        final int a = 3;
        GrilleImpl g = new GrilleImpl(a);
        final int x = 3;
        final int y = 4;
        g.setValue(x, y, '5');
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#setValue(int, int, char)}.
     */
    /*public final void testSetValuePasAutorisee() {
        final int a = 3;
        GrilleImpl g = new GrilleImpl(a);
        final int x = 3;
        final int y = 4;
        g.setValue(x, y, 'a');
        }*/

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#setValue(int, int, char)}.
     */
    /*public final void testSetValueHorsGrille() {
        final int d = 3;
        GrilleImpl grille = new GrilleImpl(d);
        final int x = 11;
        final int y = 4;
        grille.setValue(x, y, '5');
        }*/

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#getValue(int, int)}.
     */
    public final void testGetValue() {
        final int a = 3;
        final int x = 3;
        final int y = 4;
        GrilleImpl g = new GrilleImpl(a);
        g.setValue(x, y, '5');
        Assert.assertSame('5', g.getValue(x, y));
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#getValue(int, int)}.
     */
    /*public final void testGetValueHorsGrille() {
        final int d = 3;
        final int x = 10;
        final int y = 4;
        GrilleImpl g = new GrilleImpl(d);
        g.setValue(x, y, '5');
        g.getValue(x, y);
    }*/

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#complete()}.
     */
    public final void testComplete() {
        final int a = 3;
        GrilleImpl instance = new GrilleImpl(9);
        initSudoku(instance);
        boolean expResult = true;
        boolean result = instance.complete();
        assertEquals(expResult, result);
        
        instance = new GrilleImpl(9);
        expResult = false;
        result = instance.complete();
        assertEquals(expResult, result);
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#possible(int, int, char)}.
     */
    public final void testPossible() {
        int x = 0;
        int y = 1;
        char value = '1';
        GrilleImpl grille = new GrilleImpl(9);
        grille.setValue(0, 0, '1');
        boolean val = false;
        boolean resultat = grille.possibleValues(x, y, value);
        assertEquals(val, resultat);
        
        //Au cas où l'indices est incorrects
        try {
            grille.possibleValues(-1, y, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            grille.possibleValues(0, -1, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            grille.possibleValues(19, 0, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            grille.possibleValues(0, 19, value);
            fail();
        } catch (IllegalArgumentException e) {
        }
        
        //Au cas où les caractère non autorisé
        try {
            grille.setValue(x, y, 'Z');
            fail();
        } catch (IllegalArgumentException e) {
        }
        //Valeur existant en ligne
        grille = new GrilleImpl(9);
        initSudoku(grille);
        val = false;
        resultat = grille.possibleValues(1, 0, '5');
        assertEquals(val, resultat);
        
        //Valeur existant en colone
        grille = new GrilleImpl(9);
        grille.setValue(1, 1, '1');
        val = false;
        resultat = grille.possibleValues(0, 1, '1');
        assertEquals(val, resultat);
        
        //Valeur existant dans le carré local
        grille = new GrilleImpl(9);
        grille.setValue(1, 1, '1');
        val = false;
        resultat = grille.possibleValues(0, 0, '1');
        assertEquals(val, resultat);
    }

}
