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
		noeuds[noms.indexOf("a")].setArc(new Arc(noeuds[noms.indexOf("e")], 1));
		noeuds[noms.indexOf("a")].setArc(new Arc(noeuds[noms.indexOf("c")], 6));
		noeuds[noms.indexOf("a")].setArc(new Arc(noeuds[noms.indexOf("b")], 1));
		noeuds[noms.indexOf("a")].setArc(new Arc(noeuds[noms.indexOf("h")], 2));
		
		noeuds[noms.indexOf("b")].setArc(new Arc(noeuds[noms.indexOf("f")], 1));
		noeuds[noms.indexOf("b")].setArc(new Arc(noeuds[noms.indexOf("c")], 4));
		noeuds[noms.indexOf("b")].setArc(new Arc(noeuds[noms.indexOf("d")], 1));

		noeuds[noms.indexOf("d")].setArc(new Arc(noeuds[noms.indexOf("c")], 5));
		noeuds[noms.indexOf("d")].setArc(new Arc(noeuds[noms.indexOf("f")], 2));
		
		noeuds[noms.indexOf("f")].setArc(new Arc(noeuds[noms.indexOf("g")], 2));
		noeuds[noms.indexOf("h")].setArc(new Arc(noeuds[noms.indexOf("i")], 3));
		noeuds[noms.indexOf("i")].setArc(new Arc(noeuds[noms.indexOf("j")], 4));
		
		// creation modele
		Modele m = new Modele(noeuds);
		
		// test affichage
		m.afficherModele();

	}
}
