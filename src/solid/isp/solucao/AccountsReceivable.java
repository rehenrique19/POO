/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.isp.solucao;

import java.util.List;

/**
 *
 * @author 
 */
public class AccountsReceivable implements CustomerTransaction {
    private String name;
    private String date;
    private List<Product> products;
    
    
    // construtor
    public AccountsReceivable(String name, String date, List<Product> products) {
        this.name = name;
        this.date = date;
        this.products = products;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public List<Product> getProductBreakdown() {
        return products;
    }

    @Override
    public void prepareInvoice() {
        
    }

    @Override
    public void chargeCurtomer() {
        
    }
}
