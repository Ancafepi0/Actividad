package Solucion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	private List<Auto> collecionautos = new ArrayList<>();

	public Lista() {

	}

	int respuesta;
	Scanner scanner = new Scanner(System.in);

	public void llenar() {
		while (true) {
			System.out.println("Desea continuar con el programa\n Digite 1 para si \n Digite 2 para no");
			respuesta = scanner.nextInt();

			if (respuesta == 1) {
				Auto inidividual_car = new Auto();
				inidividual_car.set_ano_serie();

				inidividual_car.set_marca_auto();

				inidividual_car.set_color();

				inidividual_car.set_total_autos_s();

				inidividual_car.set_numero_serie();

				collecionautos.add(inidividual_car);
			} else {
				break;

			}
		}
		scanner.close();
	}
}
