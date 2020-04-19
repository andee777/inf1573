/** 
 *  Une classe pour controller un graphe.
*/
public class Controlleur {

	public static void main(String[] args) {
		
		// Creation des noeuds
		String noms = "qwertyuiopasdfghjklzxcvbnm";
		Noeud noeuds[] = new Noeud[noms.length()];
		for(int i=0; i < noms.length(); i++) {
			String nom = String.valueOf(noms.toUpperCase().charAt(i));
			// creation d'un noeud pour chaque lettre
			noeuds[i] = new Noeud(nom);
		}
		
		//creation des arcs
		noeuds[0].setArc(new Arc(noeuds[1], 15));
		noeuds[0].setArc(new Arc(noeuds[2], 5));
		
		// creation modele
		Modele m = new Modele(noeuds);
		
		// test affichage
		m.afficherModele();

	}
}
