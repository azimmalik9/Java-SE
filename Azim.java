class Consultant{
String Name;
String Role;
String Company;

public void Message(){
		System.out.println("Welcome "+ Name);
		System.out.println("You are a " + Role + " at " + Company);
	}
}

class Azim{
	
public static void main (String abc[])
{
		Consultant C1;
		C1 = new Consultant();
		C1.Name = "Azim";
		C1.Role = "Consultant";
		C1.Company = "QAC";
		C1.Message();
		
		
		
}

}