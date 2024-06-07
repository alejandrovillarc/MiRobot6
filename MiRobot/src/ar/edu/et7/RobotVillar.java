package ar.edu.et7;

import robocode.Robot;


//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class RobotVillar extends Robot {
	
	public void run() {
		
		while(true) {
			// Desplaza el robot 100 pixels hacia adelante
			ahead(1000);

			// Gira el cañon hacia la derecha 90 grados
			turnGunRight(1000);

			// Dispara con la maxima potencia
		//	fire(Rules.MAX_BULLET_POWER);

			// Desplaza el robot 100 pixels hacia adelante
			ahead(1000);

			// Gira el cañon hacia la derecha 180 grados
			turnGunLeft(1800);

			// Dispara con la maxima potencia
	//		fire(Rules.MAX_BULLET_POWER);

			// Gira hacia la izquierda 90 grados
			turnLeft(9000);

			// Gira el radar hacia la izquierda 15 grados
			turnRadarLeft(10005);
			
			// Escanear otros robots
			scan();
		}
		
	}
}
