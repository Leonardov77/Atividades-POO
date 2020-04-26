package testadata;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){}
    
    public void setData(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        if(a >= 1 && a <= 2020){
           if(a%4 == 0){
               
               if(m >= 1 && m <= 12){
               
               if(m == 1 && m == 3 && m == 5 && m == 7 && m == 8 && m == 10 && m == 12){
                    if(d >=1 && d <= 31){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }else if(m == 2){
                    if(d >=1 && d <= 29){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }else{
                    if(d >=1 && d <= 20){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }
               
               }else{
                   System.out.println("Mês inválido");
               }
               
           }else{
               
               if(m >= 1 && m <= 12){
               
               if(m == 1 && m == 3 && m == 5 && m == 7 && m == 8 && m == 10 && m == 12){
                    if(d >=1 && d <= 31){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }else if(m == 2){
                    if(d >=1 && d <= 28){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }else{
                    if(d >=1 && d <= 20){
                        this.dia = d;
                    }else{
                        System.out.println("Dia inválido");
                    }
                }
               
               }else{
                   System.out.println("Mês inválido");
               }
               
           }
           
        }else{
            System.out.println("Ano inválido");
        }
        
    }
    
    public String getData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
}
