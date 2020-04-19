import java.util.ArrayList;

/** 
 *  Une classe pour definir le noeud d'un graphe.
*/
public class Noeud {
	
	/** 
	 *  Le nom du noeud.
	*/
	String nom;
	
	/** 
	 *  Les arcs liés à ce noeud.
	*/
	ArrayList<Arc> arcs;
	
	/** 
	 *  Le constructeur
	*/
	public Noeud(String nom) {
		this.nom = nom;
		this.arcs= new ArrayList<Arc>();
	}

	/** 
	 *  Une fonction pour definir les arcs associés à ce noeud.
	*/
	public void setArcs(ArrayList<Arc> arcs) {
		this.arcs = arcs;
	}
	
	/** 
	 *  Une fonction pour ajouter un arc associé à ce noeud.
	*/
	public void setArc(Arc arc) {
		this.arcs.add(arc);
		arc.adj.arcs.add(new Arc(this, arc.duree));
	}
	
	/** 
	 *  Une fonction pour obtenir le nom de ce noeud.
	*/
	public String getNom() {
		return this.nom;
	}

	/** 
	 *  Une fonction pour afficher les attributs de ce noeud.
	*/
	public void afficherNoeud() {
		System.out.println("Noeud: " + this.nom);
		if(this.arcs != null) {
			for(int i=0; i < this.arcs.size(); i++) {
				System.out.println("\t * Arc " + (i+1));
				arcs.get(i).afficherArc();
			}
		}
		
	}



}
