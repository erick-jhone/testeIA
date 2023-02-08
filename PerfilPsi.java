import java.util.Scanner;

public class PerfilPsi {
    static Scanner ler = new Scanner (System.in);

    public static void main(String[] args) {

        int corFloresta, interacaoCachorro;

        boasVindas();
        String floresta = entrarNaFloresta();
        String cachorro = encontrarCachorro();
        String jarro = encontrarJarro();
        String lago = encontrarLago();
        String muro = encontrarMuro();

        System.out.println();

        System.out.println("\nSeu perfil psicologico:");
        System.out.println("\n" + floresta + cachorro + jarro + lago + muro);




    }

    public static void boasVindas() {
        System.out.println("Seja bem-vindo a uma experiencia de imersao: ");
        System.out.println("Esse teste para melhores resultados, deve ser respondido de forma sincera, as respostas foram demilitadas para ajudar a tracar o seu perfil");
        System.out.println(" .... ");

    }

    public static String entrarNaFloresta() {
        int corFloresta;
        String corDaVidaClara = "Voce ve a vida com clareza, sua floresta possuir luzes expressantes reflete tal realidade. ";
        String corDaVidaEscura = "Voce nao consegue ver a vida com clareza, a floresta escura reflete tal realidade. ";
        System.out.println("Imagine que voce esta andando por uma floresta ... Apos imaginar como e sua floresta, aperte enter: ");
        System.out.println("Quais das opcoes mais se aproxima, da floresta que imaginou: ");
        System.out.println("1 - Viva e clara, com muita luz");
        System.out.println("2 - Escura e densa");
        corFloresta = ler.nextInt();
        String corDaVidaFinal;

        if (corFloresta == 1){
        corDaVidaFinal = corDaVidaClara;
        } else  {
            corDaVidaFinal = corDaVidaEscura;
        }
       return corDaVidaFinal;
    }

    public static String encontrarCachorro() {

        int interagirCachorro;
        int levarCachorro;
        String cachorroManso = "Voce tem facilidade para se relacionar com as pessoas, por conta da escolha do cacorro manso, ";
        String cachorroBravo = "Voce tem dificulade em se relacionar, isso pode ser percebido pela visao do cachorro como bravo, ";
        String levarCachorroString = "Voce tem apego e mantem amizades duradouras.";
        String deixarCachorro = "Voce nao se apega de forma duradoura as amizades, por isso nao quis levar o cachorro com voce. ";

        System.out.println("Voce se depara com um cachorro nessa floresta ... Apos imaginar como seria o cachorro e sua interacao com ele, escolha uma opcao e aperte enter: ");
        System.out.println("Quais das opcoes mais se aproxima, do cachorro que imaginou? ");
        System.out.println("1 - Manso");
        System.out.println("2 - Bravo");
        interagirCachorro = ler.nextInt();
        System.out.println("Voce leva o cachorro com voce? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        levarCachorro = ler.nextInt();

        String cachorroFinal;

        if (interagirCachorro == 1 && levarCachorro ==1){
            cachorroFinal = cachorroManso + levarCachorroString;
        } else if (interagirCachorro == 1 && levarCachorro == 2) {
            cachorroFinal = cachorroManso + deixarCachorro;
        } else if (interagirCachorro == 2 && levarCachorro == 1){
            cachorroFinal = cachorroBravo + levarCachorroString;
        } else {

            cachorroFinal = cachorroBravo + deixarCachorro;

        }
        return cachorroFinal;



    }

    public static String encontrarJarro() {

        int materialJarro;
        int levarJarro;
        String jarroCaro = "Voce tem ambicao material, ";
        String jarroBarato = "Voce tem pouca ambicao material, ";
        String levarJarroString = "Voce tem apego aos bens materiais que possui.";
        String deixarJarro = "Voce tem pouco apego aos bens materiais que possui ";

        System.out.println("Voce se depara com um jarro nessa floresta ... Apos imaginar como seria o jarro, ou vaso, e sua interacao com ele, escolha uma opcao e aperte enter: ");
        System.out.println("Quais das opcoes mais se aproxima, do jarro que imaginou? ");
        System.out.println("1 - Feito de um material caro e nobre");
        System.out.println("2 - Feito de um material barato(Barro por exemplo)");
        materialJarro = ler.nextInt();
        System.out.println("Voce leva o jarro com voce? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        levarJarro = ler.nextInt();

        String jarroFinal;

        if (materialJarro == 1 && levarJarro ==1){
            jarroFinal = jarroCaro + levarJarro;
        } else if (materialJarro == 1 && levarJarro ==2) {
            jarroFinal = jarroCaro + deixarJarro;
        } else if (materialJarro == 2 && levarJarro ==1){
            jarroFinal = jarroBarato + levarJarro;
        } else {

            jarroFinal = jarroBarato + deixarJarro;

        }
        return jarroFinal;

    }

    public static String encontrarLago() {

        int corLago;
        int mergulhoLago;
        String lagoClaro = "Voce tem clareza sobre as experiencias da vida, ";
        String lagoEscuro = "Voce tem pouca expericia da vida e tudo ainda parece incerto, ";
        String mergulharLago = "Voce tem tem traços impulsivos e pouco medo";
        String naoMergulhar = "Voce tem medo de situacoes novas da vida ";

        System.out.println("Voce se depara com um lago nessa floresta ... Apos imaginar como seria o lago, e sua interacao com ele, escolha uma opcao e aperte enter: ");
        System.out.println("Quais das opcoes mais se aproxima, do lago que imaginou? ");
        System.out.println("1 - Agua cristalina");
        System.out.println("2 - Agua Turva");
        corLago = ler.nextInt();
        System.out.println("Voce mergulha no lago? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        mergulhoLago = ler.nextInt();

        String lagoFinal;

        if (corLago == 1 && mergulhoLago ==1){
            lagoFinal = lagoClaro + mergulharLago;
        } else if (corLago == 1 && mergulhoLago == 2) {
            lagoFinal = lagoClaro + naoMergulhar;
        } else if (corLago == 2 && mergulhoLago == 1){
            lagoFinal = lagoEscuro + mergulharLago;
        } else {

            lagoFinal = lagoEscuro + naoMergulhar;

        }
        return lagoFinal;

    }

    public static String encontrarMuro() {

        int materialMuro;
        int pularMuro;
        String muroPedra = "Voce ve a morte com temor e falta de esperanca";
        String muroVivo = "Para voce existe esperanca para alem da morte ";
        String atravessarMuro = "Voce acredita que a morte pode ser de alguma forma superada";
        String ficarMuro = "Voce ve a morte como o fim absoluto para tudo.";

        System.out.println("Voce se depara com um muro nessa floresta ... Apos imaginar como seria o muro, e sua interacao com ele, escolha uma opcao e aperte enter: ");
        System.out.println("Quais das opcoes mais se aproxima, do muro que imaginou? ");
        System.out.println("1 - Material solido e inerte (Pedra por exemplo) ");
        System.out.println("2 - Material vivo (Como uma cerca de madeira viva, por exemplo)");
        materialMuro = ler.nextInt();
        System.out.println("Voce atravessa o muro? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        pularMuro = ler.nextInt();

        String muroFinal;

        if (materialMuro == 1 && pularMuro == 1){
            muroFinal = muroPedra + atravessarMuro;
        } else if (materialMuro == 1 && pularMuro == 2) {
            muroFinal = muroPedra + ficarMuro;
        } else if (materialMuro == 2 && pularMuro == 1){
            muroFinal = muroVivo + pularMuro;
        } else {
            muroFinal = muroVivo + ficarMuro;

        }
        return muroFinal;

    }

}


