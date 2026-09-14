package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwaresBasicos;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hbs) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwaresBasicos = hbs;
    }

    public float getPreco() {
        return preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("--- PC: " + marca + " ---");
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardwares:");
        for (int i = 0; i < hardwaresBasicos.length; i++) {
            if (hardwaresBasicos[i] != null) {
                System.out.println(" - " + hardwaresBasicos[i].getNome() + " (" + hardwaresBasicos[i].getCapacidade() + ")");
            }
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
        }
        System.out.println("-------------------------");
    }
}