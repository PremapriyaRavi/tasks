package org.tcs;

public class Desktop implements Hardware,Software {
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.hardwareResources();
	d.softwareResources();
	d.desktopModel();
}

@Override
public void softwareResources() {
	System.out.println("c,c++");
	
}

@Override
public void hardwareResources() {
	System.out.println("resistor,capacitor");
	
}
public  void desktopModel() {
	System.out.println("lenova,hp");

}
}
