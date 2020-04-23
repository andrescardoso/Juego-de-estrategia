//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TPTest {

	//@Test
	void testBasico() {
		// SE CREA UNA UNIDAD DE CADA TIPO DE UNIDAD DIFERENTE EN DOS EQUIPOS
		// CADA UNIDAD ATACA A DOS POSIBLES UNIDADES ATACABLES
		Soldado soldadoRomano = new Soldado (new Punto (1,3), "romano");
		Arquero arqueroPersa = new Arquero (new Punto (3,2), "persa");
		Lancero lanceroPersa = new Lancero (new Punto (1,2), "persa");
		Caballero caballeroRomano = new Caballero (new Punto (1,1), "romano");
		System.out.println();
		soldadoRomano.ataque(arqueroPersa);
		soldadoRomano.ataque(lanceroPersa);
		arqueroPersa.ataque(caballeroRomano);
		arqueroPersa.ataque(soldadoRomano);		
		caballeroRomano.ataque(lanceroPersa);
		caballeroRomano.ataque(arqueroPersa);
		lanceroPersa.ataque(soldadoRomano);
		lanceroPersa.ataque(caballeroRomano);
	}
	//@Test
	void testMuertes() {
		// SE CREAN TRES UNIDADES DE DIFERENTES TIPOS PERO DE DOS EQUIPOS DIFERENTES (2 Y 1)
		// UNO MATA AL CONTRINCANTE, OTRO MATA A ESTE
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		Arquero arqueroEgipcio = new Arquero (new Punto (1,1), "egipcio");
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		System.out.println();
		soldadoGriego.ataque(arqueroEgipcio);
		soldadoGriego.ataque(arqueroEgipcio);
		soldadoGriego.ataque(arqueroEgipcio);
		soldadoGriego.ataque(arqueroEgipcio);
		soldadoGriego.ataque(arqueroEgipcio);
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego);
	}
	//@Test
	void testMuerteRepetitiva() {
		// SE INTENTA ATACAR A UNA UNIDAD YA MUERTA
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		System.out.println();
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego);
	}
	//@Test
	void testAtacanteMuerto() {
		// UNIDAD MUERTA INTENTA ATACAR
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		System.out.println();
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego);
		soldadoGriego.ataque(caballeroEgipcio);
	}

	//@Test
	void testUsoMetodosPropios() {
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		Lancero lanceroEgipcio = new Lancero (new Punto (3,3), "egipcio");
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		Arquero arqueroRomano = new Arquero (new Punto (1,2), "romano");
		System.out.println();
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.pocion_agua_caballo();
		soldadoGriego.ataque(arqueroRomano);
		soldadoGriego.pocion_agua();
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.usar_paquete();
	}
	//@Test
	void testEquipo() {
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		Arquero arqueroGriego = new Arquero (new Punto (1,2), "griego");
		System.out.println();
		soldadoGriego.ataque(arqueroGriego);
		arqueroGriego.ataque(soldadoGriego);
	}
	//@Test
	void testCaballoRebelde() {
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		Soldado soldadoGriego2 = new Soldado (new Punto (1,1), "griego");
		System.out.println();
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego);
		caballeroEgipcio.ataque(soldadoGriego2);
		caballeroEgipcio.ataque(soldadoGriego2);
	}
	//@Test
	void testSoldadoCansado() {
		Soldado soldadoGriego = new Soldado (new Punto (1,1), "griego");
		Caballero caballeroEgipcio = new Caballero (new Punto (2,1), "egipcio");
		System.out.println();
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
		soldadoGriego.ataque(caballeroEgipcio);
	}
	@Test
	void testArqueroSinFlechas() {
		Arquero arqueroRomano = new Arquero (new Punto (1,2), "romano");
		Lancero lanceroEgipcio = new Lancero (new Punto (3,3), "egipcio");
		System.out.println();
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.ataque(lanceroEgipcio);
		arqueroRomano.usar_paquete();
		arqueroRomano.ataque(lanceroEgipcio);
	}
}
