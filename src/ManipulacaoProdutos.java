
public class ManipulacaoProdutos {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Pão");
		p1.setCategoria(padaria);
		p1.setPreco(10);
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("batata");
		p2.setPreco(11);
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("pãozinho");
		p3.setPreco(13);
		Produto p4 = new Produto();
		p4.setId(4);
		p4.setNome("pãozinho");
		p4.setPreco(14);
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setNome("pãozinho");
		p5.setPreco(15);

		list<Produto> lista= list.of(p1, p2, p3, p4, p5);
		lista.stream().filter(e -> e.getCategoria()==CategoriaEnum.bebida).findFirst();
		
	}

}
