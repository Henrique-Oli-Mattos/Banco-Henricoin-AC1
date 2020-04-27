package ac1;

import java.util.Scanner;

public class AC1 {


    public static void main(String[] args) {
        
        String CPFfix = "123.456.789-00";
        String Senha = "01020304";
        double Saldo = 1000.00;
        int opcao;
        int opcao2 = 0;
        int deposito;
        int C = 0;
        int saque;
        
        do{
            do{
                            opcao2 = 0;
        System.out.println("Seja bem-vindo ao banco HenriCoin!");
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor, digite seu CPF de acordo com o exemplo");
        System.out.println("NNN.NNN.NNN-NN");
        String CPFIN = read.next();
        
        if (CPFIN.equals(CPFfix)){         //String é uma classe, logo não aceita "=="
            System.out.println("CPF Válido.");
        do{
             if(opcao2 == 2){
                    break;
                }
            
        Scanner read2 = new Scanner(System.in);
        System.out.println("Por favor digite sua senha:");
        String SenhaIn = read2.next();
        if (SenhaIn.equals(Senha)){
            C = 0;
            do{
            if(opcao2 == 2){
                System.out.println(" ");
                break;
            }
        opcao = 0;
        opcao2 = 0;
        Scanner read3 = new Scanner(System.in);
        System.out.println("Por favor escolha uma opção");
        System.out.println( "1 – Saldo");
        System.out.println( "2 – Depósito");
        System.out.println( "3 – Saque");
        System.out.println( "0 – Sair");
        opcao = read3.nextInt(); 
        switch(opcao){
            case 1:
                System.out.println(Saldo);
                Scanner read4 = new Scanner(System.in);
                System.out.println("Digite 1 para realizar uma nova operação");
                System.out.println("Sigite 2 para sair");
                opcao2 = read4.nextInt();
                if(opcao2 == 1){
                    break;
                    }
                if(opcao2 == 2){
                    break;
                }
            case 2:
                System.out.println("Você selecionou a opção de deposito");
                Scanner read5 = new Scanner(System.in);
                System.out.println("Digite o valor do deposito");
                deposito = read5.nextInt();
                Saldo = Saldo + deposito;
                Scanner read6 = new Scanner(System.in);
                System.out.println("Digite 1 para realizar uma nova operação");
                System.out.println("Sigite 2 para sair");
                opcao2 = read6.nextInt();
                if(opcao2 == 1){
                    break;
                    }
                if(opcao2 == 2){
                    break;
                }
            case 3:
                System.out.println("Você selecionou a opção de saque");
                Scanner read7 = new Scanner(System.in);
                System.out.println("Digite o valor do saque");
                saque = read7.nextInt();
                Saldo = Saldo - saque;
                Scanner read8 = new Scanner(System.in);
                System.out.println("Digite 1 para realizar uma nova operação");
                System.out.println("Sigite 2 para sair");
                opcao2 = read8.nextInt();
                if(opcao2 == 1){
                    break;
                    }
                if(opcao2 == 2){
                    break;
                }
            case 0:
                opcao2 = 2;
                break;
                }
            }
        while(true);
        }
        else{
            C++;
        }
        if(C == 2){
            System.out.println("Conta Bloqueada");
            System.exit(0);
             }
         }
        while(true);
        }
        else{
            System.out.println("CPF Invalido");
            System.out.println("Tente Novamente");
            System.out.println(" ");
            System.out.println("===============================================");
            System.out.println(" ");
            }
        }
        while(true);
        }
        while(true);
    }
}
