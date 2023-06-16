
public class Main {

	public static void main(String[] args) {
		
		GenericDriver Tom = new GenericDriver("Tom", true);
		Tom.deduct(3);
		Tom.setMedicalReport();
		
		CommercialDriver Lily = new CommercialDriver("Lily", false, "inflammable", "truck");
		Lily.deduct(5);
		Lily.setMedicalReport();
		
		GenericDriver[] driverArray = new GenericDriver[2];
		driverArray[0] = Tom;
		driverArray[1] = Lily; // up casted as GenericDriver
		
		for(int i=0; i<driverArray.length; i++) {
			System.out.println(driverArray[i].getName() + "'s license is provisional: " + driverArray[i].getIsProvisional());
			System.out.println(driverArray[i].getName() + " has " + driverArray[i].getPoints() + " points");
			System.out.println(driverArray[i].getMedicalReport());
		}

	}

}
