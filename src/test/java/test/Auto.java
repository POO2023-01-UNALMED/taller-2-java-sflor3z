package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos () {
		int contadorAsientos = 0;
		for (int i = 0; i<asientos.length; i++) {
			if (asientos[i]!=null) {
				contadorAsientos++;
			}
		}
		return contadorAsientos;
	}
	
	String verificarIntegridad () {
		if (this.registro==motor.registro) {
			for (int i = 0; i<asientos.length; i++) {
				if (asientos[i]!=null) {
					if (asientos[i].registro!=this.registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	}
}
