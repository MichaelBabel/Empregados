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

        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Idade: " + empregado1.getIdade());
        System.out.println("Cidade: " + empregado1.getLocalidade());
        System.out.println("Salário: " + real.format(empregado1.getSalario()));
        System.out.println("Anos contratado: " + empregado1.getAnosContratado());

        System.out.println();

        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Idade: " + empregado2.getIdade());
        System.out.println("Cidade: " + empregado2.getLocalidade());
        System.out.println("Salário: " + real.format(empregado2.getSalario()));
        System.out.println("Anos contratado: " + empregado2.getAnosContratado());
    }
}