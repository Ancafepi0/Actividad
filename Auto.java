package Solucion2;

import java.util.Scanner;

public class Auto {
	private int ano_serie;
	private String marca_auto;
	private String color;
	private int total_autos_s;
	private int numero_serie;

	public Auto() {
	}

	Scanner scanner = new Scanner(System.in);

	public void set_ano_serie() {
		System.out.println("Por favor ingresa el año de serie del vehiculo:");
		ano_serie = scanner.nextInt();
		scanner.nextLine();
	}

	public void set_marca_auto() {
		System.out.println("Por favor ingresa la marca del auto:");
		marca_auto = scanner.nextLine();
	}

	public void set_color() {
		System.out.println("Por favor ingresa el color del auto:");
		color = scanner.nextLine();
	}

	public void set_total_autos_s() {
		System.out.println("Por favor ingresa el total de autos por serie:");
		total_autos_s = scanner.nextInt();
	}

	public void set_numero_serie() {
		System.out.println("Por favor ingresa el numero dentro de la serie:");
		numero_serie = scanner.nextInt();
	}

	public int get_numero_serie() {
		return this.numero_serie;
	}

	public int get_total_autos_s() {
		return this.total_autos_s;
	}

	public int get_ano_serie() {
		return this.ano_serie;
	}

	public String get_marca_auto() {
		return this.marca_auto;
	}

	public String get_color() {
		return this.color;
	}
}
