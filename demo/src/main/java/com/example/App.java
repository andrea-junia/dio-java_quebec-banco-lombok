package com.example;

public class App {
    
    public static void main(String[] args){         
		Cliente cliente = new Cliente();
		cliente.setNome("Andrea");
		
		Conta cc = new ContaCC(cliente);
		Conta poupanca = new ContaPP(cliente);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
        
}