package sudani.adapter;

public class YemeniAdapter implements ISudani {
	private IYemeni yemeni;
	
	public YemeniAdapter(IYemeni yemeni) {
		this.yemeni=yemeni;
	}

	@Override
	public String eat() {
		return yemeni.eat();
	}

	@Override
	public String wear() {
		return yemeni.eat();
	}

	@Override
	public String live() {
		return yemeni.fight();
	}
	
	
}
