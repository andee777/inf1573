/** 
 *  Une classe pour definir le modèle d'un graphe.
*/
public class Modele {
	
	/** 
	 *  Tableau des noeuds
	*/
	Noeud noeuds[];
	
	/** 
	 *  Contructeur
	*/
	public Modele(Noeud noeuds[]) {
		this.noeuds = noeuds;
	}
	
	/** 
	 *  Fonction d'affichage
	 *  Appelle la fonction afficherNoeud() pour chaque noeud dans le tableau
	*/
	public void afficherModele() {
		for(int i=0; i < this.noeuds.length; i++) {
			noeuds[i].afficherNoeud();
		}

	}
	


}
