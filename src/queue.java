
public class queue extends stack{

	public queue(int taille) throws IllegalStateException{
		if(taille > 0){
			throw new IllegalStateException("Votre stack doit avoir une taille positive !");
		}
		else{
			this.taille = taille;
			this.compteur = 0;
			this.stack = new int[taille];
			this.stack1 = new int[taille];
		}
	}

	@Override
	void pop() throws IllegalStateException {
		//vérifier que la stack n'est pas pleine
		if(this.isEmpty()){
			throw new IllegalStateException("La stack est vide !");
		}
		else{
			int cpt = 0;
			while(cpt +1 != this.compteur ){
				this.stack1[cpt] = this.stack[this.compteur -1 - cpt]; 
				cpt++;
			}
			this.stack[cpt] = 0;
			this.stack1[cpt] = 0;
		
			while(cpt != 0){
				this.stack[this.compteur -1 - cpt] = this.stack1[cpt -1];
				cpt --;
			}
			this.compteur --;
		}
	}

	@Override
	int head() throws IllegalStateException {
		//vérifier que la stack n'est pas pleine
		if(this.isEmpty()){
			throw new IllegalStateException("La stack est vide !");
		}
		else{
			return this.stack[0];
		}
	}
	

}
