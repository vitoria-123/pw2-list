
public class Produto {
	private int id;
	private String nome;
	private CategoriaEnum categoria;
	public Produto(int id, String nome, CategoriaEnum categoria, int preco) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	private int preco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	

}
