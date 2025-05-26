package Exercicios;

public class Ex7Feiticos {
    public static void main(String[] args) {
        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
        String buscado = "Expelliarmus";

        int esq = 0, dir = feiticos.length - 1;
        while (esq <= dir) {
            int meio = (esq + dir) / 2;
            int cmp = feiticos[meio].compareToIgnoreCase(buscado);

            switch (Integer.signum(cmp)) {
                case 0:
                    System.out.println("Feitiço encontrado na posição " + meio);
                    return;
                case -1:
                    esq = meio + 1;
                    break;
                case 1:
                    dir = meio - 1;
                    break;
            }
        }

        System.out.println("Feitiço não encontrado.");
    }
}