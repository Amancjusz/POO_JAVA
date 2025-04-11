package AutoMatt;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Mattinho veiculo = new Mattinho();

        System.out.println("Quantidade de Rodas: ");
        veiculo.setQuantidadeRodas(sc.nextInt());
        System.out.println("Chassi: ");
        veiculo.setChassi(sc.next());
        System.out.println("Marca: ");
        veiculo.setMarca(sc.next());
        System.out.println("Tipo: ");
        veiculo.setTipo(sc.next());


        System.out.println(veiculo.toString());


    }
}
