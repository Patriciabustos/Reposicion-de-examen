import java.util.Scanner;
public class RepocisiondeExamen {
    
    
    public static void main(String[]args){
    Scanner Captura=new Scanner(System.in);
    System.out.println("Cuales su nombre?");
    String Nombre;
    int Dia;
    String Mes;
    int Año;
    int Edad;
    float Monto;
    float Junior;
    float Executive;
    float Senior;
    float TotalJunior;
    float TotalExecutive;
    float TotalSenior;
    Nombre=Captura.next();
    System.out.println("Bienvenido "+ Nombre);
    
    System.out.println("Que día nació?");
    Dia= Captura.nextInt();
    System.out.println("Que mes nació?");
    Mes= Captura.next();
    System.out.println("Que año nació?");
    Año= Captura.nextInt();
    
    Edad = 2022-Año;
    System.out.println("Usted tiene " +Edad +"años" );
    
    System.out.println("Digite el monto");
    
    Monto=Captura.nextInt();
    
    Junior=(float) (Monto* 0.10);
    Executive=(float)(Monto* 0.15);
    Senior=(float)(Monto* 0.20);
    
    TotalJunior=Monto-Junior;
    TotalExecutive=Monto-Executive;
    TotalSenior=Monto-Senior;
    
    if(Edad>15&& Edad < 25){
        System.out.println("Aplica descuento Junior del 10%" + "\nSu precio final es: "+ TotalJunior);
        
    }
    
    else if(Edad >25 && Edad<35){
    System.out.println("Aplica descuento Executive del 15%" +"\nSu precio final es: " + TotalExecutive);
    
    
    }else
        System.out.println("Aplica descuento Senior del 20%" + "\nSu precio final es: " + TotalSenior);
       
    
    
    
    
       
    
    
    
    
            
    
    
    }
}
