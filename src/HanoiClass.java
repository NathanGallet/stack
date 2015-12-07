
public class HanoiClass {
	
	public static void hanoi(int n, String from, String to, String via ){
		if(n > 0){
			hanoi(n-1, from, via, to);
			System.out.println("Déplacez le disque " + n + " de " + from + " à " + via);
			hanoi(n-1, to, from, via);
		}
	}
	
	public static void main(String[] args){
		hanoi(9, "A", "B", "C");
	}
}
