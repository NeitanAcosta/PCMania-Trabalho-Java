package pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float matricula = 690.0f;

        Cliente cliente = new Cliente("Seu Nome Aqui", "020.040.060-08");

        int opcao;
        do {
            System.out.println("\n=== PC Mania ===");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar Compra");
            System.out.print("Digite o código da promoção que deseja comprar: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    HardwareBasico[] hb1 = new HardwareBasico[3];
                    hb1[0] = new HardwareBasico("Pentium Core i5", 2200);
                    hb1[1] = new HardwareBasico("Memória RAM", 8);
                    hb1[2] = new HardwareBasico("HD", 500);

                    SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
                    Computador pc1 = new Computador("Apple", matricula, so1, hb1);
                    pc1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));

                    cliente.adicionarComputador(pc1);
                    System.out.println("Computador Apple adicionado ao carrinho!");
                    break;

                case 2:
                    HardwareBasico[] hb2 = new HardwareBasico[3];
                    hb2[0] = new HardwareBasico("Pentium Core i7", 3370);
                    hb2[1] = new HardwareBasico("Memória RAM", 16);
                    hb2[2] = new HardwareBasico("HD", 1000); // 1Tb = 1000Gb para padronizar a capacidade numérica

                    SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
                    Computador pc2 = new Computador("Samsung", matricula + 1, so2, hb2);
                    pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

                    cliente.adicionarComputador(pc2);
                    System.out.println("Computador Samsung adicionado ao carrinho!");
                    break;

                case 3:
                    HardwareBasico[] hb3 = new HardwareBasico[3];
                    hb3[0] = new HardwareBasico("Pentium Core i7", 4500);
                    hb3[1] = new HardwareBasico("Memória RAM", 32);
                    hb3[2] = new HardwareBasico("HD", 2000); // 2Tb = 2000Gb

                    SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
                    Computador pc3 = new Computador("Dell", matricula + 2, so3, hb3);
                    pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

                    cliente.adicionarComputador(pc3);
                    System.out.println("Computador Dell adicionado ao carrinho!");
                    break;

                case 0:
                    System.out.println("Encerrando o menu de compras...\n");
                    break;

                default:
                    System.out.println("Código inválido. Tente novamente.");
            }
        } while (opcao != 0); // O loop termina quando o cliente insere o código 0


        if (cliente.getQuantidadeComprada() > 0) {
            System.out.println("=== Detalhes da Compra ===");
            System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
            System.out.println("\n--- Computadores Comprados ---");

            for (int i = 0; i < cliente.getQuantidadeComprada(); i++) {
                cliente.getComputadores()[i].mostraPCConfigs();
            }

            System.out.println("\nValor Total da Compra: R$" + cliente.calculaTotalCompra());

            //método para finalizar o processo
            ProcessarPedido.processar(cliente.getComputadores());
        } else {
            System.out.println("Nenhum computador foi comprado.");
        }

        scanner.close();
    }
}