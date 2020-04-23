

public class Punto {
	
	private double x;
	private double y;
	private double xoriginal;
	private double yoriginal;
	
	public Punto (double x, double y) { // CONSTRUCTOR
		this.setX(x);
		this.setY(y);
		this.setXoriginal(x);
		this.setYoriginal(y);
	}

	// SETTERS & GETTERS
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getXoriginal() {
		return xoriginal;
	}
	public void setXoriginal(double xoriginal) {
		this.xoriginal = xoriginal;
	}
	public double getYoriginal() {
		return yoriginal;
	}
	public void setYoriginal(double yoriginal) {
		this.yoriginal = yoriginal;
	}
	
	// CALCULAR DISTANCIA
	public double calcularDistancia(Punto p2) {
		return Math.hypot(this.getX() - p2.getX(), this.getY() - p2.getY());
	}
	
	// RESETEADOR
	public void reset() {
		this.setX(this.getXoriginal());
		this.setY(this.getYoriginal());
	}
	
	// TOSTRING
	public String toString(){
		return String.format("X: %.0f | Y: %.0f", x, y);
	}
	
}