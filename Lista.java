package Solucion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	private List<Auto> collecionautos = new ArrayList<>();

	public Lista() {
	}

	Scanner scanner = new Scanner(System.in);

	public void llenar() {
		while (true) {
			System.out.println("¿Que desea hacer con el programa?" + "\n Digite 1 | Añadir un auto.  "
					+ "\n Digite 2 | Eliminar auto de la lista. "
					+ "\n Digite 3 | Verificar auto dentro de la collecion." + "\n Digite 4 | Terminar programa.");

			int respuesta = scanner.nextInt();

			if (respuesta == 1) {
				Auto inidividual_car = new Auto();
				inidividual_car.set_ano_serie();

				inidividual_car.set_marca_auto();

				inidividual_car.set_color();

				inidividual_car.set_total_autos_s();

				inidividual_car.set_numero_serie();

				collecionautos.add(inidividual_car);
				System.out.println("Auto agregado correctamente.");
			} else if (respuesta == 2) {
				this.eliminar();
			} else if (respuesta == 3) {
				this.verificar();
			} else {
				break;
			}
		}
	}

	public void eliminar() {
		System.out.println("Estos son los carros de la lista");
		for (Auto auto : collecionautos) {
			System.out.println("Año de serie: " + auto.get_ano_serie());
			System.out.println("Marca: " + auto.get_marca_auto());
			System.out.println("Color: " + auto.get_color());
			System.out.println("Total de autos por serie: " + auto.get_total_autos_s());
			System.out.println("Número de serie: " + auto.get_numero_serie());
			System.out.println("-----------------------------");
			System.out.println("¿Desea Eliminar este auto ?" + "\n Digite 1 | Para SI.  " + "\n Digite 2 | Para NO.");
			int respuesta_eliminar = scanner.nextInt();
			if (respuesta_eliminar == 1) {
				collecionautos.remove(auto);
			}
		}
	}

	public void verificar() {
		System.out.println("Digite el año de serie del auto");
		int respuesta_verificar1 = scanner.nextInt();

		System.out.println("Digite el numero dentro de la serie del auto");
		int respuesta_verificar2 = scanner.nextInt();

		for (Auto auto : collecionautos) {
			if (auto.get_ano_serie() == respuesta_verificar1 && auto.get_numero_serie() == respuesta_verificar2) {
				System.out.println("El auto si esta dentro de la collecion");
				break;
			} else {
				System.out.println("El auto no esta dentro de la collecion");

			}

		}
	}

}
