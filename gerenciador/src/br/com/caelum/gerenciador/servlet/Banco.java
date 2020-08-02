package br.com.caelum.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static List<Empresa> listaEmpresas = new ArrayList<>();
	
	public boolean adiciona(Empresa empresa) {
		
		return Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		
		return Banco.listaEmpresas;
	}
	
	static {
		
	  Empresa empresa = new Empresa();
	  empresa.setNome("Alura");
	  Empresa empresa2 = new Empresa();
	  empresa2.setNome("Caelum");
	  Banco.listaEmpresas.add(empresa);
	  Banco.listaEmpresas.add(empresa2);
	}
}
