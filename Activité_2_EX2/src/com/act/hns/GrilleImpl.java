package com.act.hns;
/**
 * Ma classe GrilleImpl.
 * @author yassinehanas@gmail.com (Hanas Yassine).
 */
public class GrilleImpl implements Grille {
	/**
	 * Variable grille caractère.
	 */
	private char[][] grille;
	/**
	 * Constructeur de la classe GrilleImpl.
	 * @param dimension entier.
	 */
    public GrilleImpl(final int dimension) {
        grille = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                grille[i][j] = EMPTY;
            }
        }
    }
    /**
     * Méthode qui retourne la taille de l a grille.
     */
	@Override
	public int getDimension() {
		// TODO Auto-generated method stub
		return grille.length;
	}
    /**
     * Méthode setValue.
     * @param    x entier.
     * @param    y entier.
     * @param    value  chaine de caractère.
     */
	@Override
	public void setValue(final int x, final int y, final char value)
		throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (!possible(x, y, value)) {
            throw new IllegalArgumentException("la valeur est interdite aux "
            		+ "vues des autres valeurs de la grille");
        }
        grille[x][y] = value;
	}
	 /**
     * Méthode setValue.
     * @param    x entier.
     * @param    y entier.
     * @return   grille[x][y].
     */
	@Override
	public char getValue(final int x, final int y)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
	    if (x < 0 || y < 0 || x >= grille.length || y >= grille.length) {
            throw new IllegalArgumentException("Les valeurs"
            		+ " ne correspond pas ");
        }
        return grille[x][y];
	}
    /**
     * Méthode Complete.
     * @return true ou false.
     */
	@Override
	public boolean complete() {
		// TODO Auto-generated method stub
		 for (int i = 0; i < grille.length; i++) {
	            for (int j = 0; j < grille.length; j++) {
	                if (grille[i][j] == EMPTY) {
	                    return false;
	                }
	            }
	        }
	        return true;
	}
	/**
	 * Méthode SiPossible.
	 * @param value caractère.
	 * @return true ou false.
	 */
	private boolean siPossible(final char value) {
        int i = 0;
        while (i < grille.length) {
            if (possible[i] == value) {
                return true;
            }
            i++;
        }
        return false;
    }
	/**
	 * Méthode possible.
	 * @param x entier.
	 * @param y entier.
	 * @param value caractère.
	 * @return false ou true.
	 */
	@Override
	public boolean possible(final int x, final int y, final char value)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		 if (x < 0 || y < 0 || x >= grille.length || y >= grille.length) {
	            throw new IllegalArgumentException("index hors"
	            		+ " des bornes");
	        }
			if (!siPossible(value)) {
         throw new IllegalArgumentException("value caractere non autorisé");
     }

	        //Recherche d'une occurence du caractère dans la ligne
	        for (int col = 0; col < grille.length; col++) {
	            if (grille[x][col] == value) {
	                return false;
	            }
	        }

	        //Recherche d'une occurence du caractère dans la colone
	        for (int row = 0; row < grille.length; row++) {
	            if (grille[row][y] == value) {
	                return false;
	            }
	        }

	        //Recherche d'une occurence du caractère
	        int taillePetitCarre = (int) Math.sqrt(grille.length);
	        int incX = (x / taillePetitCarre) * taillePetitCarre;
	        int incY = (y / taillePetitCarre) * taillePetitCarre;
	        for (int row = 0; row < taillePetitCarre; row++) {
	            for (int col = 0; col < taillePetitCarre; col++) {
	                if (grille[row + incX][col + incY] == value) {
	                    return false;
	                }
	            }
	        }
	        return true;
	}
}
