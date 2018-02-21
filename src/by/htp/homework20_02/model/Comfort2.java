package by.htp.homework20_02.model;

public class Comfort2 extends Tariff{

	private String tariffName;


	public Comfort2() {
		
	}

	public Comfort2 (String tariffName,String tariffType, int montlyCost ) {
		super(tariffType,montlyCost);
		this.tariffName=tariffName;
	}

public String getTariffName() {
	return tariffName;

}








}
