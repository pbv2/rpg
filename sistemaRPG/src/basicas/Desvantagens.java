package basicas;

public class Desvantagens {
	private int id;
	private String[] desvantagens;
	private int posit;
	private int tamanho;
		public Desvantagens(int id,int tamanho){
			this.id = id;
			this.desvantagens = new String[tamanho];
			this.posit = 0;
			this.tamanho = tamanho;
		}
		public int getId(){
			return this.id;
		}
		public String[] getDesvantagens(){
			return this.desvantagens;
		}
		public int getPosit(){
			return this.posit;
		}
		public void adicionarDesvantagem(String desvantagem){
			this.desvantagens[posit]=desvantagem;
			posit++;
		}
		public void removerDesvantagem(String nome){
			for(int i = 0; i < this.posit; i++){
				if(nome.equals(this.desvantagens[i])){
					desvantagens[i] = null;
					for(int j = i; j < this.tamanho; j++){
						if(j != this.tamanho-1){
							this.desvantagens[j] = this.desvantagens[j + 1];
						}
					}
					this.posit = this.posit - 1;
				}
			}
		}
}