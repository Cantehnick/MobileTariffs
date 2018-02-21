package by.htp.homework20_02.model;

import java.util.Scanner;



public class Tariff {

private Abonent[] abonents;
private String tariffType;
private int montlyCost=10;
private int countClients;
private String tariffName;
private static double k=1;




public Tariff() {
	
}

public Tariff( String tariffType, int montlyCost ) {

	
	this.tariffType=tariffType;
	this.montlyCost=montlyCost;

}

public void increaseCost() {
	montlyCost=(int)(montlyCost*k);
}

public static void setK(double newK) {
	k=newK;
}
public String getTariffName() {

	return tariffName;
}


public String getTariffType() {
	return tariffType;
}

public int getMontlyCost() {
	return montlyCost;
}

public int getCountClients() {
	return countClients;
}

public Abonent[] getAbonents() {
	return abonents;
}






public void addClients (Abonent ab) {
	if  (this.abonents != null) {
		if (countClients < abonents.length) {
			abonents[countClients] = ab;
			countClients++;
		} else {
			Abonent[] abonents = new Abonent[this.abonents.length + 10];
			for (int i = 0; i < this.abonents.length; i++) {
				abonents[i] = this.abonents[i];
			}
			this.abonents = abonents;
			this.abonents[countClients] = ab;
			countClients++;
		}
	} else {
		this.abonents = new Abonent[10];
		this.abonents[countClients] = ab;
		countClients++;
	}
}

public void printClients (Tariff tf) {
	for (int i=0; i<tf.getCountClients(); i++) {
		System.out.println(tf.getAbonents()[i].getName()+"  "+tf.getAbonents()[i].getSurName()+"   "+tf.getTariffName()+"   "+tf.getTariffType()+"   "+tf.getMontlyCost());
	}

//	public void printTariffs(Comfort cm,Comfort2 cm2,Comfort4 cm4) {
//		System.out.println("Tariff :"+cm.getTariffName()+"Tariff Type : "+cm.getTariffType()+"Mountly cost  "+cm.getMontlyCost());
//		System.out.println("Tariff :"+cm2.getTariffName()+"Tariff Type : "+cm2.getTariffType()+"Mountly cost  "+cm2.getMontlyCost());
//		System.out.println("Tariff :"+cm4.getTariffName()+"Tariff Type : "+cm4.getTariffType()+"Mountly cost  "+cm4.getMontlyCost());
//		
//		
//	}
	
	
	
	
	
	
	
	
	
}

public int countAbonents(Tariff tf) {
	int count=0;
	for (int i=0; i<tf.getCountClients();i++) {
		count=count+i;
		count=tf.getCountClients();
	}
return tf.getCountClients();
}


public int totalNumber (Comfort cm,Comfort2 cm2,Comfort4 cm4) {
	
	int totalNumber=cm.countAbonents(cm)+cm2.countAbonents(cm2)+cm4.countAbonents(cm4);
return totalNumber;
}


public void yourTariff() {
	System.out.println("Please enter the abonent amount (15 and ...):");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if (a>=0 && a<15) {
		System.out.println("Please enter the abonent amount (15 and ...):");
	}
	if (a>=15 && a<=30) {
		System.out.println("You tariff Comfort ");
	}else if (a>30 && a<90) {
System.out.println("You tariff Comfort2 ");
		
	}else {
		System.out.println("You tariff Comfort4 ");
		
	}
	}
	

	
	
	
	
	
	
	
}































