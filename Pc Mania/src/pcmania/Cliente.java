package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int quantidadeComprada;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[50]; // Limite para comportar o uso de Array padrão
        this.quantidadeComprada = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void adicionarComputador(Computador c) {
        if (quantidadeComprada < computadores.length) {
            computadores[quantidadeComprada] = c;
            quantidadeComprada++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < quantidadeComprada; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }
}