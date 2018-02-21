package by.htp.homework20_02.runner;


import by.htp.homework20_02.model.Abonent;
import by.htp.homework20_02.model.Comfort;
import by.htp.homework20_02.model.Comfort2;
import by.htp.homework20_02.model.Comfort4;
import by.htp.homework20_02.model.Tariff;

public class MainApp {

	/**
	 * 12. Мобильная связь. Определить иерархию тарифов мобильной компании.
Создать список тарифов компании. Подсчитать общую численность клиентов.
Провести сортировку тарифов на основе размера абонентской платы. Найти
тариф в компании, соответствующий заданному диапазону параметров.

	 */
	
	public static void main(String[] args) {

Abonent ab1=new Abonent("Name1","SurName1");
Abonent ab2=new Abonent("Name2","SurName2");
Abonent ab3=new Abonent("Name3","SurName3");
Abonent ab4=new Abonent("Name4","SurName4");
	
	Tariff tf=new Tariff();
	
tf.addClients(ab1);
tf.addClients(ab2);
tf.addClients(ab3);
tf.addClients(ab4);
	
	


	tf.setK(1.5);
	tf.increaseCost();
Comfort cm=new Comfort("Comfort","ForSmartphone",tf.getMontlyCost());
cm.addClients(ab1);
cm.printClients(cm);

System.out.println("-----------------------");
tf.setK(2);
tf.increaseCost();
Comfort2 cm2=new Comfort2("Comfort2","ForSmartphone",tf.getMontlyCost());
cm2.addClients(ab2);
cm2.printClients(cm2);
System.out.println("-----------------------");
tf.setK(3);
tf.increaseCost();
Comfort4 cm4=new Comfort4("Comfort4","ForSmartphone",tf.getMontlyCost());
cm4.addClients(ab3);
cm4.addClients(ab4);
cm4.printClients(cm4);
System.out.println("--------------------------");

System.out.println("Total number is : "+tf.totalNumber(cm, cm2, cm4));

System.out.println("--------------------------");

tf.yourTariff();

//int[] cost= {cm.getMontlyCost(),cm2.getMontlyCost(),cm4.getMontlyCost()};
//
//
//		int a=0;
//		for (int i = 0; i < cost.length; i++) {
//			for (int j = 1; j < cost.length - i; j++) {
//				if (cost[j - 1] < cost[j]) {
//					a = cost[j - 1];
//					cost[j - 1] = cost[j];
//					cost[j] = a;
//				}
//			}
//		System.out.println(cost[i]);
//		
//		}
//		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}







	
	
	}


