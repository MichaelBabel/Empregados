public class Empregado {
    private String nome;
    private int idade;
    private double salario;
    private String localidade;
    private int anosContratado;

    Empregado(String nome, int idade, double salario, String localidade, int anosContratado) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.localidade = localidade;
        this.anosContratado = anosContratado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getAnosContratado() {
        return anosContratado;
    }

    public void setAnosContratado(int anosContratado) {
        this.anosContratado = anosContratado;
    }

    void aumentarSalario() {
        if (this.anosContratado > 10) {
            this.salario = this.salario * 1.10;
        }
    }
}