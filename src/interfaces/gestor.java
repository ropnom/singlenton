package interfaces;

import modelos.gestion;

//Sihacemso la clase final, no es posible heredar de ella, clonar el objeto nimodificarla (sobreescribirla)
final class gestor implements gestion {

	//Estructura de SINGLETON
	
	public gestor()	{
		
	}
	//declaramos la instancia vacia
	private static gestor instance = null;
	
	//Metodo obtener instancia la devuelve si existe o la crea si no existe aun
	public static gestor getIntance()
	{
		//para eviatar problemas de sincronia bloqueamos la funcion a una unica instancia
		synchronized(gestor.class) {
			if(instance==null)
				instance = new gestor();
			
			return instance;
	    }
	}
	
	// FIN ESTRUCTURA DEL SINGLENTON
	
	@Override
	public String get_gestor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Contarobjetos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
