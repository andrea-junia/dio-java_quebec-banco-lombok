package com.example;

public class ContaCC extends Conta {

    public ContaCC(Cliente cliente) {
		super(cliente);
	}

    @Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
    
}
