/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionfat;

/**
 *
 * @author edgames
 */
public class Fat {
    
    private Integer num = 0;
    private Integer fat = 1;
    private String formula = "";
    
   
    public void SetValor(int n){
    
        num = n;
        int f = 1;
        String s = "";
        
        for(Integer c = n; c>1; c--){
        
            f*= c;
            
            s += c + " x ";
        }
        
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public Integer getFat(){
        
        return fat;
    }
    
    public String getFormula(){
        
        return formula;
    }
    
}
