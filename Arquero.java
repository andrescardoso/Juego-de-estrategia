
public class Arquero extends Unidad {

	private int flechas_disponibles;
	
	public Arquero (Punto posicion, String equipo) { // CONSTRUCTOR
		super(posicion, equipo, 50, 5);
		this.setFlechas_disponibles(20);
		this.setTipo_unidad("arquero");
		System.out.println(this.toString());
	}
	
	// ATAQUE PERSONALIZADO
	public void ataque(Unidad unidad) {
		if (unidad.getEquipo()!=this.getEquipo()) { // COMPROBACI�N MISMO EQUIPO
		if (this.getSalud()>=1) { // UNIDAD QUE ATACA EST� VIVA?
		if (unidad.getSalud()>=1) { // UNIDAD A LA QUE SE ATACA EST� VIVA? 
		if (this.getPosicion().calcularDistancia(unidad.getPosicion())>=2 && this.getPosicion().calcularDistancia(unidad.getPosicion())<=5){ // DENTRO DEL RANGO DE ATAQUE?
		if (this.getFlechas_disponibles()>=1) { // CUENTA CON FLECHAS SUFICIENTES?
		unidad.setSalud(unidad.getSalud()-this.getDagno()); // NUEVA SALUD DE LA UNIDAD ATACADA LUEGO DEL ATAQUE
		this.setFlechas_disponibles(this.getFlechas_disponibles()-1); // DESCONTAMOS UNA FLECHA AL ARQUERO
		System.out.println("El " +this.getTipo_unidad()+"[Salud:"+this.getSalud()+"] atac� al " + unidad.getTipo_unidad()+"[Salud:"+unidad.getSalud()+"] con "
				+this.getDagno()+" puntos de da�o. Quedan "+this.getFlechas_disponibles()+" flechas."); // MUESTRO MENSAJE QUE COMPRUEBA EL ATAQUE
		}
		else {
			System.out.println("No hay flechas para lanzar."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE FLECHAS
		}
		}
		else {
			System.out.println("El arquero no se encuentra a una distancia favorable."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE DISTANCIA
		}
		}
		else {
			System.out.println("El "+unidad.getTipo_unidad()+" al que se intenta atacar ha muerto."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE VIDA DE DEL ATACADO
		}	
		}
		else {
			System.out.println("Este "+this.getTipo_unidad()+" ha muerto, no puede realizar ninguna acci�n."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE VIDA DEL ATACANTE
		}
		}
		else {
			System.out.println("El "+this.getTipo_unidad()+" no puede atacar a su mismo equipo.");
		}
		if (unidad.getSalud()<1) { // SI LA UNIDAD ATACADA MUERE, SE MUESTRA EN PANTALLA
			System.out.println("El " + unidad.getTipo_unidad() + " muri� a manos del " + this.getTipo_unidad()); 
		}
	}
	
	// PAQUETE DE FLECHAS
	public void usar_paquete() {
		this.setFlechas_disponibles(this.getFlechas_disponibles()+6);
		System.out.println("Se utiliz� un paquete de flechas (+6), ahora este arquero tiene " + this.getFlechas_disponibles() + " flechas.");
	}
	
	// SETTERS & GETTERS
	public int getFlechas_disponibles() {
		return flechas_disponibles;
	}
	public void setFlechas_disponibles(int flechas_disponibles) {
		this.flechas_disponibles=flechas_disponibles;
	}
	
	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquero other = (Arquero) obj;
		if (flechas_disponibles != other.flechas_disponibles)
			return false;
		return true;
	}
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING	
	public String toString() {
		return "Se entren� a un "+this.getTipo_unidad()+" "+super.toString()+"|Flechas:"+this.getFlechas_disponibles()+"]";
	}

}