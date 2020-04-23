
public class Unidad {
	
	private String tipo_unidad;
	private String equipo;
	private Punto posicion;
	private int dagno;
	private int salud;
	
	public Unidad(Punto posicion, String equipo, int salud, int dagno) { // CONSTRUCTOR
		this.setSalud(salud);
		this.setDagno(dagno);
		this.setPosicion(posicion);
		this.setEquipo(equipo);
	}	
	
	// GETTERS & SETTERS
	public String getTipo_unidad() {
		return tipo_unidad;
	}
	public void setTipo_unidad(String tipo_unidad) {
		this.tipo_unidad=tipo_unidad;
	}
	public Punto getPosicion() {
		return posicion;
	}
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	public int getDagno() {
		return dagno;
	}
	public void setDagno(int dagno) {
		this.dagno = dagno;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo=equipo;
	}
	
	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidad other = (Unidad) obj;
		if (dagno != other.dagno)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		if (salud != other.salud)
			return false;
		if (tipo_unidad == null) {
			if (other.tipo_unidad != null)
				return false;
		} else if (!tipo_unidad.equals(other.tipo_unidad))
			return false;
		return true;
	}

	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// TOSTRING
	public String toString() {
		return "[Salud:"+this.getSalud()+"|Daño:"+this.getDagno()+"|Equipo:"+this.getEquipo();
	}
	
}