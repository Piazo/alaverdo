package org.insa.graphs.model;

public class Label implements Comparable<Label> {
	
	private Node sommet_courrant; //noeud du label
	private boolean isMarked; //Vrai quand le noeud est deja connu de l'algo
	protected float cout; //cout du shortest path jusqu'a ce noeud
	private Arc pere; //arc precedent atteignant le noeud actuel
	
	public static Label[] Labels;
	
	public Label(Node noeud, boolean isMarked, float cout, Arc pere) {
		this.setSommet_courrant(noeud);
		this.setMarked(isMarked);
		this.cout = cout;
		this.setPere(pere);
	}
	
	
	public float getCost() {
		return this.cout;
	}
	
	public void setCost(float cout) {
		this.cout=cout;
	}


	public Arc getPere() {
		return pere;
	}


	public void setPere(Arc pere) {
		this.pere = pere;
	}


	public boolean isMarked() {
		return isMarked;
	}


	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}


	public Node getSommet_courrant() {
		return sommet_courrant;
	}


	public void setSommet_courrant(Node sommet_courrant) {
		this.sommet_courrant = sommet_courrant;
	}
	
	public float getTotalCost() {
		return this.cout;
	}
	
	@Override
	public int compareTo(Label label) {
		return Float.compare(this.getTotalCost(), label.getTotalCost());
	}
	

}
