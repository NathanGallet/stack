
public abstract class stack {
	
	protected int stack[];
	protected int stack1[];
	protected int taille;
	protected int compteur;
	
	/**
	 * Retourne la taille de la stack
	 */
	public int getSize(){
		return this.taille;	
	}
	
	/**
	 * Retourne le nombre d'élement présent dans notre stack
	 */
	public int getNumberOfElement(){
		return this.compteur;
	}
	
	/**
	 * Si l'utilisateur à atteint la taille maximum
	 * le compteur d'élement aura la taille de la stack	
	*/
	public boolean isFull(){
		if(this.taille == this.compteur){
			return true;	//retourne true si notre stack est remplie
		}
		else{
			return false;	//retourne false si notre stack n'est pas remplie
		}
	}
	
	/**
	 * Permet de savoir si la stack est vide
	 */
	public boolean isEmpty(){
		if(this.compteur == 0){
			return true; //retourne true si notre stack est vide
		}
		else{
			return false; //retourne false si notre stack contient au moins 1 élement
		}
	}
	
	/**
	 * Ajouter un élément à la stack
	 */
	void push(int x) throws IllegalStateException {
		//vérifier que la stack n'est pas pleine
		
		if(this.isFull()){
			throw new IllegalStateException("La stack est pleine !");
		}
		else{
		//On ajoute l'élément en haut de la stack et on incrément compteur
			
			this.stack[this.compteur] = x;
			this.compteur += 1;
		}
	}
	
	abstract void pop() throws IllegalStateException;
	abstract int head() throws IllegalStateException;
}
