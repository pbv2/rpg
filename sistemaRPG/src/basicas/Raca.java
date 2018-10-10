package basicas;

public class Raca {
	private int id;
	private String nomeraca;
		public Raca(int id,String nomeraca){
			this.id = id;
			this.nomeraca = nomeraca;
		}
	public String getNome(){
		return this.nomeraca;
	}
	public int getId(){
		return this.id;
	}
}