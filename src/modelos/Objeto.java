package modelos;

import java.util.Date;

//esto es un objeto basico
public class Objeto {

	//atributos o parametros del objeto
	private int id;
	private String nombre;
	private Date last_update;
	
	
	//contructor
	public Objeto(){
		//sirve para inicializar ciertos parametros con valores predeterminados
		// o para introducir los valores al instaciar el objeto.		
	}
	
	// METODOS SET y GET 
	// sirven para acceder a lso parameros de forma segura por POO y poder ser POJOS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	//Otros metodos del objeto
	
	//metodos privados
	private void actulizar()
	{
		this.last_update = new Date();
	}
	
	//metodos publicos
	public void Metodopublicocambiarnombre(String nuevonombre){
		
		this.nombre = nuevonombre;
		this.actulizar();
	}
}
