public class Vendedor extends Persona {
	private String _tituloProfesional;
	private String _estadoCivil;
	public Venta _venta;

	public String getTituloProfesional() {
		return this._tituloProfesional;
	}

	public void setTituloProfesional(String aTituloProfesional) {
		this._tituloProfesional = aTituloProfesional;
	}

	public String getEstadoCivil() {
		return this._estadoCivil;
	}

	public void setEstadoCivil(String aEstadoCivil) {
		this._estadoCivil = aEstadoCivil;
	}

	public void EstadoCivil(int opcion){
		switch (opcion){
			case 1:
				super.setEstadoCivil("Soltero");
				break;
			case 2:
				super.setEstadoCivil("Casado");
				break;
		}
	}

}