package br.edu.mackenzie.gerenciadornomes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorNomesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorNomesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        GerenciadorNomes gerenciador = new GerenciadorNomesLista();

        gerenciador.adicionar("Ana");
        gerenciador.adicionar("Bruno");
        gerenciador.adicionar("Carlos");

        System.out.println("Nomes cadastrados:");
        for (String nome : gerenciador.obter()) {
            System.out.println("- " + nome);
        }

        System.out.print("\nAlterando Bruno para Beatriz... ");
        System.out.println(gerenciador.atualizar("Bruno", "Beatriz"));

        System.out.print("\nAlterando Bruno outra vez para Beatriz... ");
        System.out.println(gerenciador.atualizar("Bruno", "Beatriz"));

        System.out.print("Removendo Carlos... ");
        System.out.println(gerenciador.remover("Carlos"));

        System.out.print("Removendo Italo que não existe... ");
        System.out.println(gerenciador.remover("Italo"));

        System.out.println("\nNomes finais:");
        for (String nome : gerenciador.obter()) {
            System.out.println("- " + nome);
        }
    }
}
