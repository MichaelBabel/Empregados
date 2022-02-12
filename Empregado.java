public class Empregado {
    String nome;
    int idade;
    double salario;
    String localidade;
    int anosContratado;

    Empregado(String nome, int idade, double salario, String localidade, int anosContratado) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.localidade = localidade;
        this.anosContratado = anosContratado;
    }

    void aumentarSalario() {
        if (this.anosContratado > 10) {
            this.salario = this.salario * 1.10;
        }
    }
}