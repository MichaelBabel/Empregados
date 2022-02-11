import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("José Ricardo", 55,
                1000, "Blumenau", 11);
        Empregado empregado2 = new Empregado("Paulo José", 43,
                1900, "Blumenau", 5);

        empregado1.aumentarSalario();
        empregado2.aumentarSalario();

        NumberFormat real = NumberFormat.getCurrencyInstance();

        System.out.println("Nome: " + empregado1.nome);
        System.out.println("Idade: " + empregado1.idade);
        System.out.println("Cidade: " + empregado1.localidade);
        System.out.println("Salário: " + real.format(empregado1.salario));
        System.out.println("Anos contratado: " + empregado1.anosContratado);

        System.out.println();

        System.out.println("Nome: " + empregado2.nome);
        System.out.println("Idade: " + empregado2.idade);
        System.out.println("Cidade: " + empregado2.localidade);
        System.out.println("Salário: " + real.format(empregado2.salario));
        System.out.println("Anos contratado: " + empregado2.anosContratado);
    }
}