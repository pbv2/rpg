package basicas;

public class Pericias {
	private int id;
	private String[] descricaopericias;
	private int posit;
	private int tamanho;
		public Pericias(int id, int tamanho){
			this.id=id;
			this.descricaopericias = new String[tamanho];
			this.posit = 0;
			this.tamanho = tamanho;
		}
	public int getId(){
		return this.id;
	}
	public String[] getDescricoesPericias(){
		return this.descricaopericias;
	}
	public int getPosit(){
		return this.posit;
	}
	public void adicionarPericia(String pericia){
		this.descricaopericias[posit]=pericia;
		posit++;
	}
	public void removerPericia(String nome){
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(this.descricaopericias[i])){
				descricaopericias[i] = null;
				for(int j = i; j < this.tamanho; j++){
					if(j != this.tamanho-1){
						this.descricaopericias[j] = this.descricaopericias[j + 1];
					}
				}
				this.posit = this.posit - 1;
			}
		}
	}
}