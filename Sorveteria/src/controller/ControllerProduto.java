package controller;

import bd.BDProdutos;
import model.Produto;
import model.Usuario;
import utils.Logar;

public class ControllerProduto {
	
	public Produto pegarProduto(Usuario usuarioLogado, Integer id) {
		if (Logar.isAdmin(usuarioLogado)) {
			BDProdutos bd = new BDProdutos();
			return bd.getProdutoById(id);
		}
		return null;
	}
	
	public boolean inserirProduto(Usuario usuarioLogado, Produto prod) {
		if (Logar.isAdmin(usuarioLogado)) {
			BDProdutos bd = new BDProdutos();
			return bd.insertProduto(prod);
		}
		return false;
	}

	public Float buscarValorProduto(String nomeProduto) {
		BDProdutos bd = new BDProdutos();
		Produto produto = bd.getProdutoByName(nomeProduto);
		return produto.getPreco();
		
	}


	public void aplicarDesconto(Usuario usuarioLogado,String nomeProduto, String descontoPorcentagem) {
		if (Logar.isAdmin(usuarioLogado)) {
		
			BDProdutos bd = new BDProdutos();
			Produto produto = bd.getProdutoByName(nomeProduto);
			produto.setPreco((produto.getPreco() * Float.parseFloat(descontoPorcentagem))/100);
			bd.updateProduto(produto);
		}
	}
	
	public boolean alterarProduto(Usuario usuarioLogado, Produto prod) {
		if (Logar.isAdmin(usuarioLogado)) {
			BDProdutos bd = new BDProdutos();
			return bd.updateProduto(prod);
		}
		return false;
	}

}
