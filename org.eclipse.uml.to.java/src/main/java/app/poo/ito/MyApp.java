package app.poo.ito;

import java.time.LocalDate;
import Clase.ito.poo.CuentaBancaria;

public class MyApp {

	static void run() {
		System.out.println (new CuentaBancaria (89393l, "Lucia Mendoza", 15000, LocalDate.of(2021,2,18)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}


}
