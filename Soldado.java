
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
		if (unidad.getEquipo()!=this.getEquipo()) { // COMPROBACI�N MISMO EQUIPO
		if (this.getSalud()>=1) { // UNIDAD QUE ATACA EST� VIVA?
		if (unidad.getSalud()>=1) { // UNIDAD A LA QUE SE ATACA EST� VIVA? 
		if (this.getPosicion().calcularDistancia(unidad.getPosicion())<=1){ // DENTRO DEL RANGO DE ATAQUE?
		if (this.getEnergia()>=10) { // CUENTA CON ENERG�A SUFICIENTE?
		unidad.setSalud(unidad.getSalud()-this.getDagno()); // NUEVA SALUD DE LA UNIDAD ATACADA LUEGO DEL ATAQUE
		this.setEnergia(this.getEnergia()-10); // DESCONTAMOS ENERG�A DEL SOLDADO TRAS EL ATAQUE
		System.out.println("El "+this.getTipo_unidad()+"[Salud:"+this.getSalud()+"] atac� al " + unidad.getTipo_unidad()+"[Salud:"+unidad.getSalud()+"] con "
				+this.getDagno()+" puntos de da�o. Queda "+this.getEnergia()+" de energ�a."); // MUESTRO MENSAJE QUE COMPRUEBA EL ATAQUE
		}
		
		else {
			System.out.println("El soldado no tiene suficiente energ�a para atacar."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE ENERG�A
		}
		}
		else {
			System.out.println("El soldado no se encuentra cuerpo a cuerpo."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE DISTANCIA
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
	
	// POCI�N DE AGUA
	public void pocion_agua() {
		this.setEnergia(100);
		System.out.println("Se utiliz� poci�n de agua. Energ�a: +100.");
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
		return "Se entren� a un "+this.getTipo_unidad()+" "+super.toString()+"|Energ�a:"+this.getEnergia()+"]";
	}
	
}