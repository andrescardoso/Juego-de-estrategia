
public class Soldado extends Unidad {
	
	private int energia;

	public Soldado (Punto posicion, String equipo) { // CONSTRUCTOR
		super(posicion, equipo, 100, 10);
		this.setEnergia(100);
		this.setEnergia(this.getEnergia());
		this.setTipo_unidad("soldado");
		System.out.println(this.toString());
	}

	// SETTERS & GETTERS
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	// ATAQUE PERSONALIZADO
	public void ataque(Unidad unidad) {
		if (unidad.getEquipo()!=this.getEquipo()) { // COMPROBACIÓN MISMO EQUIPO
		if (this.getSalud()>=1) { // UNIDAD QUE ATACA ESTÁ VIVA?
		if (unidad.getSalud()>=1) { // UNIDAD A LA QUE SE ATACA ESTÁ VIVA? 
		if (this.getPosicion().calcularDistancia(unidad.getPosicion())<=1){ // DENTRO DEL RANGO DE ATAQUE?
		if (this.getEnergia()>=10) { // CUENTA CON ENERGÍA SUFICIENTE?
		unidad.setSalud(unidad.getSalud()-this.getDagno()); // NUEVA SALUD DE LA UNIDAD ATACADA LUEGO DEL ATAQUE
		this.setEnergia(this.getEnergia()-10); // DESCONTAMOS ENERGÍA DEL SOLDADO TRAS EL ATAQUE
		System.out.println("El "+this.getTipo_unidad()+"[Salud:"+this.getSalud()+"] atacó al " + unidad.getTipo_unidad()+"[Salud:"+unidad.getSalud()+"] con "
				+this.getDagno()+" puntos de daño. Queda "+this.getEnergia()+" de energía."); // MUESTRO MENSAJE QUE COMPRUEBA EL ATAQUE
		}
		
		else {
			System.out.println("El soldado no tiene suficiente energía para atacar."); // ELSE CORRESPONDIENTE A COMPROBACIÓN DE ENERGÍA
		}
		}
		else {
			System.out.println("El soldado no se encuentra cuerpo a cuerpo."); // ELSE CORRESPONDIENTE A COMPROBACIÓN DE DISTANCIA
		}
		}
		else { 
			System.out.println("El "+unidad.getTipo_unidad()+" al que se intenta atacar ha muerto."); // ELSE CORRESPONDIENTE A COMPROBACIÓN DE VIDA DE DEL ATACADO
		}
		}
		else {
			System.out.println("Este "+this.getTipo_unidad()+" ha muerto, no puede realizar ninguna acción."); // ELSE CORRESPONDIENTE A COMPROBACIÓN DE VIDA DEL ATACANTE
		}
		}
		else {
			System.out.println("El "+this.getTipo_unidad()+" no puede atacar a su mismo equipo.");
		}
		if (unidad.getSalud()<1) { // SI LA UNIDAD ATACADA MUERE, SE MUESTRA EN PANTALLA
			System.out.println("El " + unidad.getTipo_unidad() + " murió a manos del " + this.getTipo_unidad());
		}
		
	}
	
	// POCIÓN DE AGUA
	public void pocion_agua() {
		this.setEnergia(100);
		System.out.println("Se utilizó poción de agua. Energía: +100.");
	}
	
	// EQUALS
		public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		if (energia != other.energia)
			return false;
		return true;
	}
	// CLONE
		protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING
	public String toString() {
		return "Se entrenó a un "+this.getTipo_unidad()+" "+super.toString()+"|Energía:"+this.getEnergia()+"]";
	}
	
}