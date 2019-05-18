
public class CelularJ1 {

	private String marca;
	private int ano;
	private boolean ligar;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public void ligar() {

		this.setLigar(!this.isLigar());
		System.out.print("" + this.ligar);

	}

	public void desligar() {
		this.setLigar(!this.isLigar());
		System.out.print("" + this.ligar);

	}


	public void som() {
		System.out.println(" hello, "+this.getMarca());

	}

	
}