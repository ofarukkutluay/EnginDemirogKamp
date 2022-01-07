
public class Main3Gun {

	public static void main(String[] args) {
		Instructor egitmen = new Instructor();
		egitmen.id = 1;
		egitmen.firstName = "Engin";
		egitmen.lastName = "Demiroð";
		egitmen.email = "engin@engin.com";
		egitmen.certificates= new String[] {"MCT","ITIL","PMP"};
		egitmen.specialties = new String[] {"C#","JAVA"};
		
		Student ogrenci = new Student();
		ogrenci.id=1;
		ogrenci.firstName="Omer";
		ogrenci.lastName="Kutluay";
		ogrenci.email="omer@omer.com";
		ogrenci.adress="Ýstanbul";
		ogrenci.registeredCourses=new String[] {"C#","JAVA"};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(egitmen);
		instructorManager.update(egitmen);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(ogrenci);
		studentManager.update(ogrenci);
		
		

	}

}
