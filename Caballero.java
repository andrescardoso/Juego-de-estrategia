
public class Caballero extends Unidad {

	private int ataques_caballo;
	
		public Caballero(Punto posicion, String equipo) {
			super(posicion, equipo, 200, 50);
			this.setAtaques_caballo(3);
			this.setTipo_unidad("caballero");
			System.out.println(this.toString());
		}
		
	// ATAQUE PERSONALIZADO
		public void ataque(Unidad unidad) {
			if (unidad.getEquipo()!=this.getEquipo()) { // COMPROBACI�N MISMO EQUIPO
			if (this.getSalud()>=1) { // UNIDAD QUE ATACA EST� VIVA?
			if (unidad.getSalud()>=1) { // UNIDAD A LA QUE SE ATACA EST� VIVA? 
			if (this.getPosicion().calcularDistancia(unidad.getPosicion())>=1 && this.getPosicion().calcularDistancia(unidad.getPosicion())<=2) { // DENTRO DEL RANGO DE ATAQUE?
			if (this.getAtaques_caballo()>0){ // COMPROBACI�N DE DISPONIBILIDAD DEL CABALLO PARA ATACAR
			unidad.setSalud(unidad.getSalud()-this.getDagno()); // NUEVA SALUD DE LA UNIDAD ATACADA LUEGO DEL ATAQUE
			this.setAtaques_caballo(this.getAtaques_caballo()-1); // QUITAMOS UN ATAQUE DISPONIBLE AL CABALLO 
			System.out.println("El "+this.getTipo_unidad()+"[Salud:"+this.getSalud()+"] atac� al " + unidad.getTipo_unidad()+"[Salud:"+unidad.getSalud()+"] con "
					+this.getDagno()+" puntos de da�o."); // MUESTRO MENSAJE QUE COMPRUEBA EL ATAQUE
			}
			else {
				System.out.println("No se puede atacar porque el caballo se encuentra rebelde. Utiliza una poci�n de agua para recuperarlo."); // ELSE CORRESPONDIENTE A ATAQUE DE CABALLO
			}
			}
			else {
				System.out.println("El caballero no se encuentra a una distancia favorable."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE DISTANCIA
			}
			}
			else {
				System.out.println("El "+unidad.getTipo_unidad()+" al que se intenta atacar ha muerto."); // ELSE CORRESPONDIENTE A COMPROBACI�N DE VIDA DEL ATACADO
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
		
	// POCI�N AGUA CABALLO
		public void pocion_agua_caballo() {
			this.setAtaques_caballo(3);
			System.out.println("El caballo bebi� una poci�n de agua y se recuper� para tres ataques m�s.");
		}
		
	//SETTERS & GETTERS
	public int getAtaques_caballo() {
		return ataques_caballo;
	}
	public void setAtaques_caballo(int ataques_caballo) {
		this.ataques_caballo=ataques_caballo;
	}
	
	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caballero other = (Caballero) obj;
		if (ataques_caballo != other.ataques_caballo)
			return false;
		return true;
	}
	
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// TOSTRING
	public String toString() {
		return "Se entren� a un "+this.getTipo_unidad()+" "+super.toString()+"|Caballo:"+this.getAtaques_caballo()+" ataques]";
	}

}

