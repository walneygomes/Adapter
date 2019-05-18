
public class Adapter implements CelularTijolao {
	CelularJ1 cell;

	public Adapter() {
		this.cell = new CelularJ1();
	}

	@Override
	public void ligar() {
		cell.ligar();
	}

	@Override
	public void desligar() {
		cell.desligar();
	}

	@Override
	public void som() {
		cell.som();
	}

}
