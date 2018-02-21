package by.htp.homework20_02.model;

public class Comfort extends Tariff{

private String tariffName;


public Comfort() {
	
}

public Comfort (String tariffName,String tariffType, int montlyCost ) {
	super(tariffType,montlyCost);
	this.tariffName=tariffName;
}

public String getTariffName() {
	return this.tariffName;
}










}
