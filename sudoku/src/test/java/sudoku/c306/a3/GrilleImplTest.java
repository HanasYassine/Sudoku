
package sudoku.c306.a3;

import junit.framework.Assert;
import junit.framework.TestCase;
import sudoku.c306.a3.GrilleImpl;

/**
 * @author Donald
 *
 */
public class GrilleImplTest extends TestCase {

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
        GrilleImpl grille = new GrilleImpl(a);
        Assert.assertNotSame('@', grille.complete());
    }

    /**
     * Test method for {@link sudoku.c306.a3.GrilleImpl#possible(int, int, char)}.
     */
    public final void testPossible() {
        final int a = 3;
        final int x = 3;
        final int y = 4;
        GrilleImpl grille = new GrilleImpl(a);
        Assert.assertTrue(grille.possibleValues(x, y, '5'));
    }

}
