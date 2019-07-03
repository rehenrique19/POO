/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.dip;

/**
 *
 * @author 
 *
 */
public class ProcessoFabricacaoTelevision extends ProcessoFabricacaoGeral  {
    
	@Override
	protected void montagem(){
		System.out.println("montagem iniciada");
	}

	@Override
	protected void testeProduto(){
		System.out.println("produto testado");
		
	}

	@Override
	protected void embalagem(){
		System.out.println("produto embalado");
		
	}

	@Override
	protected void armazenamento(){
		System.out.println("produto armazenado");
		
	}
}
