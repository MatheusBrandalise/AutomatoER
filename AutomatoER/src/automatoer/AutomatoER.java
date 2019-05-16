package automatoer;

import java.util.Scanner;

public class AutomatoER {

    public static void main(String[] args) {

        Validacao validacao = new Validacao();

        String entrada;
        int state = 0;
        int position = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a entrada: ");
        entrada = sc.nextLine().trim().toUpperCase();
        

        if (validacao.validateAlphabet(entrada)) {
            while (position < entrada.length()) {

                Character element = entrada.charAt(position);

                switch (state) {
                    case 0:
                        state = element == 'M' ? 1 : 0;
                        break;
                    case 1:
                        state = element == 'A' ? 2 : 0;
                        break;
                    case 2:
                        state = element == 'C' ? 3 : 0;
                        break;
                    case 3:
                        state = 3;
                        break;
                }
                position++;
            }
            System.out.println(state == 3 ? "Aceito!" : "Rejeitado!");
        } else {
            System.out.println("Alfabeto inválido. Rejeitado!");
        }
    }
}
