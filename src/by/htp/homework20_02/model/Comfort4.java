package by.htp.homework20_02.model;

public class Comfort4 extends Tariff{

	private String tariffName;


	public Comfort4() {
		
	}

	public Comfort4 (String tariffName,String tariffType, int montlyCost ) {
		super(tariffType,montlyCost);
		this.tariffName=tariffName;
	}

	public String getTariffName() {
		return tariffName;

	}

























}
