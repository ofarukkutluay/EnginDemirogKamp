
public class Main {

	public static void main(String[] args) {
		Kurs kurs1 = new Kurs(1,"C# kurs",1);
		Kurs kurs2 = new Kurs(2,"Java kurs",1);
		Kurs kurs3 = new Kurs(3,"Python kurs",1);
		
		Egitmen egitmen1 = new Egitmen(1,"Engin","Demiroğ");
		Egitmen egitmen2 = new Egitmen(2,"Murat","Kurtboğan");
		Egitmen egitmen3 = new Egitmen(3,"Kerem","Varış");
		
		Kurs[] kursList = {kurs1,kurs2,kurs3};
		Egitmen[] egitmenList = {egitmen1,egitmen2,egitmen3};
		
		for (Egitmen egitmen : egitmenList) {
			System.out.println(egitmen.id +" id " + egitmen.firstName + " " + egitmen.lastName);
		}
		
		for (Kurs kurs : kursList) {
			System.out.println(kurs.id +" id " + kurs.name + " eğitmen " + kurs.egitmenId);
		}
		
		KursManager kursManager = new KursManager();
		kursManager.add(kurs2);
		kursManager.delete(kurs3);
		

	}

}
