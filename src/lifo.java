
public class lifo extends stack {
	
	/**
	 * Constructeur qui permet d'instancier notre stack en mode lifo
	 */
	public lifo(int taille){
		this.taille = taille;
		this.compteur = 0;
		stack = new int[taille];
	}

	/**
	 * Permet d'ajouter un élément à la stack
	 */
	@Override
	void push(int x) throws IllegalStateException {
		//il faut d'abord vérifier que la stack n'est pas pleine
		
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
	 * Permet de retirer un élément de la stack 
	 */
	@Override
	void pop() throws IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	int head() throws IllegalStateException {
		// TODO Auto-generated method stub
		return 0;
	}

}
