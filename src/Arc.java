/** 
 *  Une classe pour definir l'arc d'un graphe.
*/
public class Arc {
	/** 
	 *  Le noeud adjacent.
	*/
	Noeud adj;
	
	/** 
	 *  La durée/le poid de l'arc.
	*/
	int duree;
	
	/** 
	 *  Le constructeur.
	*/
	public Arc(Noeud adj, int duree) {
		this.adj = adj;
		this.duree = duree;
	}

	/** 
	 *  Une fonction pour afficher les attributs de cet arc.
	*/
	public void afficherArc() {
		System.out.println("\t\t - Vers: Noeud " + this.adj.getNom());
		System.out.println("\t\t - Durée: " + this.duree + " mins");
	}

}
