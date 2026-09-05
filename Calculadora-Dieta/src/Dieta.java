import java.util.Scanner;

/// Classe que representa uma dieta
public class Dieta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cafeMin = 0, cafeMax = 0;
        int almocoMin = 0, almocoMax = 0;
        int jantarMin = 0, jantarMax = 0;

        System.out.println("Escolha o que você comeu no café da manhã: ");
        System.out.println("[1] Três ovos mexidos com duas fatias de pão");
        System.out.println("[2] Um pão com presunto e queijo");
        System.out.println("[3] Um pão com manteiga");
        System.out.println("[4] Apenas um café preto, sem açúcar");

        int cafeDaManha = sc.nextInt();

        switch (cafeDaManha) {
            case 1:
                cafeMin = 260;
                cafeMax = 290;
                System.out.println("260 - 290 kcal");
                break;
            case 2:
                cafeMin = 250;
                cafeMax = 290;
                System.out.println("250 - 290 kcal");
                break;
            case 3:
                cafeMin = 205;
                cafeMax = 225;
                System.out.println("205 - 225 kcal");
                break;
            case 4:
                cafeMin = 2;
                cafeMax = 5;
                System.out.println("2 - 5 kcal");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        System.out.println("Escolha O que Vc Comeu No Almoço: ");
        System.out.println("[1] 200g de arroz, 125g de feijão, 200g de carne (vermelha ou branca) com, ou sem, salada");
        System.out.println("[2] 100g De Arroz, 70g de feijão, 100g de carne (vermelha ou branca) com, ou sem, salada");
        System.out.println("[3] 200g De Massa com 120g de Guizado com, ou sem, salada");
        System.out.println("[4] Sanduíche natural e fruta");

        int almoco = sc.nextInt();

        switch (almoco) {
            case 1:
                almocoMin = 710;
                almocoMax = 895;
                System.out.println("710 - 895 kcal");
                break;
            case 2:
                almocoMin = 370;
                almocoMax = 470;
                System.out.println("370 - 470 kcal");
                break;
            case 3:
                almocoMin = 545;
                almocoMax = 605;
                System.out.println("545 - 605 kcal");
                break;
            case 4:
                almocoMin = 320;
                almocoMax = 450;
                System.out.println("320 - 450 kcal");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        System.out.println("Escolha o que você comeu no jantar: ");
        System.out.println("[1] 200g de arroz, 125g de feijão; 200g de carne (vermelha ou branca) com, ou sem, salada");
        System.out.println("[2] 100g de arroz, 70g de feijão; 100g de carne (vermelha ou branca) com, ou sem, salada");
        System.out.println("[3] 200g de massa com 120g de guizado com, ou sem, salada");
        System.out.println("[4] Sanduíche natural e fruta");
        System.out.println("[5] Apenas Uma Sopa");

        int jantar = sc.nextInt();

        switch (jantar) {
            case 1:
                jantarMin = 710;
                jantarMax = 895;
                System.out.println("710 - 895 kcal");
                break;
            case 2:
                jantarMin = 370;
                jantarMax = 470;
                System.out.println("370 - 470 kcal");
                break;
            case 3:
                jantarMin = 545;
                jantarMax = 605;
                System.out.println("545 - 605 kcal");
                break;
            case 4:
                jantarMin = 320;
                jantarMax = 450;
                System.out.println("320 - 450 kcal");
                break;
            case 5:
                jantarMin = 150;
                jantarMax = 250;
                System.out.println("150 - 250 kcal");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        int totalMin = cafeMin + almocoMin + jantarMin;
        int totalMax = cafeMax + almocoMax + jantarMax;
        System.out.println("Total estimado de calorias ingeridas: " + totalMin + " - " + totalMax + " kcal");

        sc.close();
    }
}
