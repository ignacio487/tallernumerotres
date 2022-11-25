public class Inmueble {
	private String _tipoDeConstruccion;
	private String _ubicacionGeografica;
	private int _precio;

	public String getTipoDeConstruccion() {
		return this._tipoDeConstruccion;
	}

	public void setTipoDeConstruccion(String aTipoDeConstruccion) {
		this.tipoDeConstruccion = TipoDeConstruccion;
	}

	public String getUbicacionGeografica() {
		return this._ubicacionGeografica;
	}

	public void setUbicacionGeografica(String aUbicacionGeografica) {
		this._ubicacionGeografica = aUbicacionGeografica;
	}

	public int getPrecio() {
		return this._precio;
	}

	public void setPrecio(int aPrecio) {
		this._precio = aPrecio;
	}

	public void TipoDeConstruccion(int opcion){
		switch (opcion){
			case 1:
				super.setTipoDeConstruccion("Madera");
				break;
			case 2:
				super.setTipoDeConstruccion("Cemento");
				break;
		}
	}
}