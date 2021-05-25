package org.insa.graphs.model;

public class Label implements Comparable<Label> {
	
	private Node sommet_courrant;
	private boolean isMarked;
	protected float cout;
	private Arc pere;
	
	public static Label[] Labels;
	
	public Label(Node n, boolean isMarked, float cout, Arc pere) {
		this.setSommet_courrant(n);
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
	
	@Override
	public int compareTo(Label l) {
		return Float.compare(this.getCost(), l.getCost());
	}
	

}
