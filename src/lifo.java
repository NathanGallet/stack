
public class lifo extends stack {
	
	/**
	 * Instancier notre stack en mode lifo
	 */
	public lifo(int taille) throws IllegalStateException{
		if(taille > 0){
			throw new IllegalStateException("Votre stack doit avoir une taille positive !");
		}
		else{
		this.taille = taille;
		this.compteur = 0;
		stack = new int[taille];
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
