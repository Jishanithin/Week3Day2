package week3day2;

public  class AssignDesktop implements AssignHardware, AssignSoftware {

	public void desktopModel() {
		System.out.println("Desktop Model is: Dell XPS");

	}

	public void softwareResources( ) {
		System.out.println("The softwareResources are : OS");
	}

	public void hardwareResources( ) {
		 System.out.println("The HardwareResources are :Printer");
	}
	public static void main(String[] args) {
		
		AssignDesktop obj=new AssignDesktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();
		
		
	}
	
}
