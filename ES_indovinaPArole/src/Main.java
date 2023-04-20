import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        //variabili
        boolean exit = false;
        boolean flag = true;
        int scelta;
        String parola;
        char carattere;


        //oggetto
        indovinaParola partita1 = null;

        do{
            try{
                System.out.print("Inserisci la parola:  ");
                parola = input.nextLine();
                partita1 = new indovinaParola(parola);
                flag = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while(!flag);



        while(!exit){
            System.out.println("\n\n\nIndovina parola");
            System.out.println("0. Esci");
            System.out.println("1. Indovina il carattere");
            System.out.println("2. Parola da indovinare");
            System.out.println("3. Ntentativi");
            System.out.println("4. Indovinata?");
            System.out.println("5. Parola con ???");
            System.out.print("Inserisci la scelta: ");

            input = new Scanner(System.in);
            scelta = input.nextInt();
            System.out.println("\n\n\n\n");
            switch(scelta){
                case 0:
                    exit = true;
                    break;

                case 1:
                    System.out.print("Inserisci il carattere: ");
                    input = new Scanner(System.in);
                    carattere = input.next().charAt(0);
                    partita1.indovina(carattere);
                    System.out.println("la parola: "+partita1.getParolaScoperta());
                    System.out.println("La parola è stata indovinata: "+ partita1.isIndovinata());
                    if(partita1.isIndovinata()){
                        exit = true;
                        System.out.println("Bravo, hai indovinato la parola ;)");

                    }
                    break;

                case 2:
                    System.out.println("La parola da indovinare è: " + partita1.getPatolaDaIndovinare());
                    break;

                case 3:
                    System.out.println("I numeri di tentativi sono: "+ partita1.getNumeroTentativi());
                    break;

                case 4:
                    System.out.println("La parola è stata indovinata: "+ partita1.isIndovinata());
                    break;

                case 5:
                    System.out.println(partita1.getParolaScoperta());
                    break;

            }
        }
    }
}