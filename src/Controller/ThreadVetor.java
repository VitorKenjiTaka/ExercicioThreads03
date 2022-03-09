package Controller;

public class ThreadVetor extends Thread{
	private int[] vetor = new int[1000];
	private int i;
	
	public ThreadVetor(int vetor[], int i) {
		this.vetor = vetor;
		this.i = i;
		
	}
	
	public void run() { 
			
		double comeco = System.currentTimeMillis();
		double fim;
			if ( i % 2 == 0) {
				
				for(int l = 0 ; l < vetor.length ;l++) {
				}
				fim = System.currentTimeMillis();
				double total = fim - comeco;
				total = total / Math.pow(10, 9);
				System.out.println("Tempo do vetor 2 é: " + total);
				
				
			}
			else {
				
				for(int i : vetor){
				}
				
				fim = System.currentTimeMillis();
				double total = fim - comeco;
				total = total / Math.pow(10, 9);
				System.out.println("Tempo do vetor 1 é: " + total);
		}	
	}
}
