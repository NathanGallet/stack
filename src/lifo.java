
public class lifo extends stack {
	
	/**
	 * Instancier notre stack en mode lifo
	 */
	public lifo(int taille){
		this.taille = taille;
		this.compteur = 0;
		stack = new int[taille];
	}

	/**
	 * Ajouter un élément à la stack
	 */
	@Override
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

	/**
	 * Retirer un élément de la stack 
	 */
	@Override
	void pop() throws IllegalStateException {
		//vérifier que la stack n'est pas pleine
		
		if(this.isEmpty()){
			throw new IllegalStateException("La stack est vide !");
		}
		else{
			this.stack[this.compteur -1] = 0;
			this.compteur -= 1;
		}
	}
	
	/**
	 * 
	 */
	@Override
	int head() throws IllegalStateException {
		//vérifier que la stack n'est pas pleine
	
		if(this.isEmpty()){
			throw new IllegalStateException("La stack est vide !");
		}
		else{
			return this.stack[this.compteur -1];
		}
	}

}
