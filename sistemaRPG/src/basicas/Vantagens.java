package basicas;

public class Vantagens {
	private int id;
	private String[] vantagens;
	private int posit;
	private int tamanho;
		public Vantagens(int id, int tamanho){
			this.id = id;
			this.vantagens = new String[tamanho];
			this.posit = 0;
			this.tamanho = tamanho;
		}
		public int getId(){
			return this.id;
		}
		public String[] getVantagens(){
			return this.vantagens;
		}
		public int getPosit(){
			return this.posit;
		}
		public void adicionarVantagem(String vantagem){
			this.vantagens[posit]=vantagem;
			posit++;
		}
		public void removerVantagem(String nome){
			for(int i = 0; i < this.posit; i++){
				if(nome.equals(this.vantagens[i])){
					vantagens[i] = null;
					for(int j = i; j < this.tamanho; j++){
						if(j != this.tamanho-1){
							this.vantagens[j] = this.vantagens[j + 1];
						}
					}
					this.posit = this.posit - 1;
				}
			}
		}
}