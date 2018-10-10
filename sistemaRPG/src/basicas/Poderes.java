package basicas;

public class Poderes {
	private int id;
	private String[] poderes;
	private int posit;
	private int tamanho;
		public Poderes(int id, int tamanho){
			this.id = id;
			this.poderes = new String[tamanho];
			this.posit = 0;
			this.tamanho = tamanho;
		}
		public int getId(){
			return this.id;
		}
		public String[] getPoderes(){
			return this.poderes;
		}
		public int getPosit(){
			return this.posit;
		}
		public void adicionarPoder(String poder){
			this.poderes[posit]=poder;
			posit++;
		}
		public void removerPoder(String nome){
			for(int i = 0; i < this.posit; i++){
				if(nome.equals(this.poderes[i])){
					poderes[i] = null;
					for(int j = i; j < this.tamanho; j++){
						if(j != this.tamanho-1){
							this.poderes[j] = this.poderes[j + 1];
						}
					}
					this.posit = this.posit - 1;
				}
			}
		}
}