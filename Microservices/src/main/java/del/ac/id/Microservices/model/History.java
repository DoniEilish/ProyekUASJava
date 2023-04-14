package del.ac.id.Microservices.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {
	private int id, jumlah, harga, idUser, status;
	private String nama, jenis, tanggal;
	
	public History() { }

	public History(int id, int jumlah, int harga, String nama, String jenis, int idUser, String tanggal, int status) {
		this.id = id;
		this.jumlah = jumlah;
		this.harga = harga;
		this.nama = nama;
		this.jenis = jenis;
		this.idUser = idUser;
		this.tanggal = tanggal;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getJumlah() { return jumlah; }
	public void setJumlah(int jumlah) { this.jumlah = jumlah; }

	public int getHarga() { return harga; }
	public void setHarga(int harga) { this.harga = harga; }

	public String getNama() { return nama; }
	public void setNama(String nama) { this.nama = nama; }

	public String getJenis() { return jenis; }
	public void setJenis(String jenis) { this.jenis = jenis; }

	public int getIdUser() { return idUser; }
	public void setIdUser(int idUser) { this.idUser = idUser; }

	public String getTanggal() { return tanggal; }
	public void setTanggal(String tanggal) { this.tanggal = tanggal; }

	public int getStatus() { return status; }
	public void setStatus(int status) { this.status = status; }
}
