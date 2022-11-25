import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Cliente> clientes;
	private ArrayList<Inmueble> inmuebles;
	private ArrayList<Vendedor> vendedores;

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarVendedores(Vendedor vendedor) {
		this.vendedores.add(vendedor);
	}

	public void agregarInmuebles(Inmueble inmueble) {
		this.inmuebles.add(inmueble);
	}

	public ArrayList<Inmueble> obtenerInmueblesPorPrecio(int precio) {
		ArrayList<Inmueble> InmueblesConElMismoPrecio = new ArrayList<>();
		for (Venta Inmueble : inmuebles) {
			for (Inmueble inmueble :.getInmuebles());
			{
			}
			if (inmuebles.getPrecio().equals(precio)) {
				InmueblesConElMismoPrecio.add(inmuebles);
			}
		}
		return inmueblesConElMismoPrecio;
	}

	public ArrayList<Inmueble> obtenerInmueblesPorTipoDeConstruccion(String TipoDeConstruccion) {
		ArrayList<Inmueble> InmueblesConElMismoMaterial = new ArrayList<>();
		if (inmuebles.get(inmuebles).equals(TipoDeConstruccion)) {
			(obtenerInmueblesPorTipoDeConstruccion().add(inmuebles));
		}
		return InmueblesConElMismoMaterial;
	}

	public void eliminarInmueble(Inmueble inmueble){
		this.inmuebles.remove(inmueble);
	}
}