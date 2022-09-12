package aplication;

import java.util.Locale;
import java.util.Scanner;
import intities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();


        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");

        product.name = sc.nextLine();

        System.out.print("Preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Informações do Produto: " + product);

        System.out.println();
        System.out.println("Insira a quantidade de produtos que deseja adicionar ao Estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Produtos Atualizados: " + product);

        System.out.println();
        System.out.println("Insira a quantidade de produtos que deseja remover do Estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Produtos Atualizados: " + product);

        sc.close();
    }
}
