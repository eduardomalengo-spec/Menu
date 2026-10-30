import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Entrega {
	String func;
    String ID;
    String cargo;
    String cliente;
    int cliente_id;
    double salario_func;
    
    public Entrega() {};
    
    public Entrega(String func, String ID, String cargo, String cliente, int cliente_id, double salario_func) {
    	this.func = func;
        this.ID = ID;
        this.cargo = cargo;
        this.cliente = cliente;
        this.cliente_id = cliente_id;
        this.salario_func = salario_func;
    }
}

public class Menu {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("HH:mm");
        
        String func = "";
        String ID = "";
        String cargo = "";
        String cliente = "";
        int cliente_id = 0;
        double salario_func = 0.0;
        
        
        System.out.println("===========================================");
        System.out.println("VERIFICAÇÃO DE PRAZOS E HORARIOS DE ENTREGA");
        System.out.println("===========================================");
        
        LocalTime horario = LocalTime.now();
        System.out.println(horario);
        
        System.out.print("Qual seu nome? ");
        func = sc.nextLine();
        
        System.out.print("Qual seu ID? ");
        ID = sc.nextLine();
        
        System.out.print("Qual seu Cargo? ");
        cargo = sc.nextLine();
        
        System.out.print("Nome cliente: ");
        cliente = sc.nextLine();
        
        System.out.print("CD_CLIENTE: ");
        cliente_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Qual seu Salario Mensal? ");
        salario_func = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("[ DADOS SALVOS! ]");
        System.out.println("CARREGANDO...");
        
        System.out.print("Qual o horario da entrega? ");
        LocalTime time_enter = LocalTime.parse(sc.nextLine());
        
        System.out.println("Que horas você entregou? ");
        LocalTime time_enter2 = LocalTime.parse(sc.nextLine());
        
        Entrega obj = new Entrega(func, ID, cargo, cliente, cliente_id, salario_func);
        
        if(time_enter2.isBefore(time_enter)) {
        	System.out.println(" [ OK ] ");
            System.out.println("SEU RELATORIO DE ENTREGA: ");
            System.out.println(" NOME: " + obj.func + " | ");
            System.out.println(" ID: " + obj.ID + " | ");
            System.out.println(" CARGO: " + obj.cargo + " | ");
            System.out.println(" CLIENTE: " + obj.cliente + " | ");
            System.out.println(" CLIENTE_ID: " + obj.cliente_id + " | ");
            System.out.println(" SALARIO FUNCIONARIO: " + obj.salario_func + " | ");
        }
        else {
        	System.out.println(" [ ATRASADO! ] ");
            System.out.println("SEU RELATORIO DE ENTREGA: ");
            System.out.println(" NOME: " + obj.func + " | ");
            System.out.println(" ID: " + obj.ID + " | ");
            System.out.println(" CARGO: " + obj.cargo + " | ");
            System.out.println(" CLIENTE: " + obj.cliente + " | ");
            System.out.println(" CLIENTE_ID: " + obj.cliente_id + " | ");
            System.out.printf(" SALARIO FUNCIONARIO: %.2f", obj.salario_func - (20.9/100), " | ");
        }
        
        sc.close();
        
        
        
    }
}