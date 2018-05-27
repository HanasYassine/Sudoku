package sudoku.c306.a3;

/**
 * @author Donald
 *
 */
public class GrilleImpl extends Grille {

    /** variable dimension de la grille de Sudoku.
     * si dimension 3, taille = 3²= 9
     */
    private int dimension;
    private int taille;

    /** variable tableau de valeurs de la grille.
     *
     */
    private char[][] grille;

    /** variable valeurs.
    *
    */
    private char[] possibleValue = new char[] {'1', '2', '3', '4', '5', '6',
            '7', '8', '9', '0'};

    /**
     * Caractere de case vide.
     */
    private char emptyValue = '@';

    /** Default Constructor.
     *
     */
    public GrilleImpl() {
    }

    /** Constructeur.
     *@param d dimension de la grille
     *
     */
    public GrilleImpl(final int d) {
        dimension = d;
        taille = dimension * dimension;
        grille = new char[taille][taille];
    }

    /* (non-Javadoc)
     * @see sudoku.Grille#getDimension()
     */
    @Override
    public int getDimension() {
        return dimension;
    }

    /* (non-Javadoc)
     * @see sudoku.Grille#setValue(int, int, char)
     */
    @Override
    public void setValue(final int x, final int y, final char value) {
        if (x < 0 || y < 0 || x > taille || y > taille) {
            throw new IllegalArgumentException("Erreur:,"
                    + " position hors de la grille");
        }

        int i = 0;
        // on parcours la liste de valeurs possibles
        while (i < possibleValue.length && value != possibleValue[i]) {
            i++;
        }

        // si la valeur est trouv�e dans la liste
        if (i < possibleValue.length) {
            if (possibleValues(x, y, value)) {
                grille[x][y] = value;
            } else {
                throw new IllegalArgumentException("Erreur,"
                        + "la valeur existe deja");
            }
        } else { // la liste a ete parcouru et la valeur n'a pas ete retrouvee
            throw new IllegalArgumentException("Erreur,"
                    + "la valeur n'est pas autorisee");
        }
    }

    /* (non-Javadoc)
     * @see sudoku.Grille#getValue(int, int)
     */
    @Override
    public char getValue(final int x, final int y) {
        if (x < 0 || y < 0 || x > taille || y > taille) {
            throw new IllegalArgumentException("Erreur:,"
                    + " position hors de la grille");
        } else {
            return grille[x][y];
        }
    }

    /* (non-Javadoc)
     * @see sudoku.Grille#complete()
     */
    @Override
    public boolean complete() {
        for (char[] tab : grille) {
            for (char v : tab) {
                if (v == emptyValue) {
                    return false;
                }
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see sudoku.Grille#possible(int, int, char)
     */
    @Override
    public boolean possibleValues(final int x, final int y, final char value) {
        // TODO Auto-generated method stub
        return true;
    }

}
