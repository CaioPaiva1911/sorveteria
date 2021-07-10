package controller;

import java.util.List;

import bd.BDFornecedor;
import model.Fornecedor;

public class ControllerFornecedor {
	
	public List<Fornecedor> fornecedores;
	public Fornecedor fornecedor;
	
	private BDFornecedor bdFornecedor = new BDFornecedor();
	
	public boolean cadastrarFornecedor(String nome, String endereco) {
		Fornecedor forn = new Fornecedor(nome,endereco);
		bdFornecedor.insertFornecedor(fornecedor);
		return true;
	}
	
	public Fornecedor pegarFornecedor(int ID) {
		Fornecedor forn = bdFornecedor.getFornecedorById(ID);
		return forn;
	}
	
	public boolean alterarFornecedor(String nome, String endereco) {
		Fornecedor forn = new Fornecedor(nome,endereco);
		return bdFornecedor.updateFornecedor(forn);
	}
	
	

}
