
public class Lancero extends Unidad {
	
	public Lancero(Punto posicion, String equipo) {
		super(posicion, equipo, 150, 25);
		this.setTipo_unidad("lancero");
		System.out.println(this.toString());
	}
	
	// ATAQUE PERSONALIZADO
	public void ataque(Unidad unidad) {
		if (unidad.getEquipo()!=this.getEquipo()) { // COMPROBACI�N MISMO EQUIPO
		if (this.getSalud()>=1) { // UNIDAD QUE ATACA EST� VIVA?
		if (unidad.getSalud()>=1) { // UNIDAD A LA QUE SE ATACA EST� VIVA? 
		if (this.getPosicion().calcularDistancia(unidad.getPosicion())>=1 && this.getPosicion().calcularDistancia(unidad.getPosicion())<=3){ // DENTRO DEL RANGO DE ATAQUE?
		unidad.setSalud(unidad.getSalud()-this.getDagno());
		System.out.println("El "+this.getTipo_unidad()+"[Salud:"+this.getSalud()+"] atac� al " + unidad.getTipo_unidad()+"[Salud:"+unidad.getSalud()+"] con "
				+this.getDagno()+" puntos de da�o."); // MUESTRO MENSAJE QUE COMPRUEBA EL ATAQUE
		}
		else {
			System.out.println("El lancero no se encuentra a una distancia favorable."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE DISTANCIA
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
	
	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// TOSTRING	
	public String toString() {
		return "Se entren� a un "+this.getTipo_unidad()+" "+super.toString()+"]";
	}
	
}
