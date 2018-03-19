
package Uygulama;


public class Validator {
    
    public boolean harfkontrol(String gelen)
    {
        boolean kontrol=true;
     for(Character harf:gelen.toCharArray())
     {
     if(!(Character.isAlphabetic(harf))|| gelen.equals(" "))
     {
     kontrol=false;
     break;
     
     }
     
     }
    
    return kontrol;
    }
    public boolean rakamkontrol(String gelen)
    {
               boolean kontrol=true;
     for(Character harf:gelen.toCharArray())
     {
     if(!(Character.isDigit(harf)))
     {
     kontrol=false;
     break;
     
     }
     
     }
    
    return kontrol;
   
    }
    public boolean tckontrol(String tc)
            
    {
              boolean kontrol=true;
     for(Character harf:tc.toCharArray())
     {
     if(!(Character.isDigit(harf)))
     {
     kontrol=false;
     break;
     
     }
     if(tc.length()!=11)
     {
     kontrol=false;
     }
     }
    
    return kontrol;
    }
            
    
}
