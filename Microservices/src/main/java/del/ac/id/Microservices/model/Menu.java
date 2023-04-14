package del.ac.id.Microservices.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	private int id, stok, harga;
	private String nama, jenis;
	
	public Menu() { }

	public Menu(int id, int stok, int harga, String nama, String jenis) {
		this.id = id;
		this.stok = stok;
		this.harga = harga;
		this.nama = nama;
		this.jenis = jenis;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getStok() { return stok; }
	public void setStok(int stok) { this.stok = stok; }

	public int getHarga() { return harga; }
	public void setHarga(int harga) { this.harga = harga; }

	public String getNama() { return nama; }
	public void setNama(String nama) { this.nama = nama; }

	public String getJenis() { return jenis; }
	public void setJenis(String jenis) { this.jenis = jenis; }
}
