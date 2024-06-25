import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorNaInternet navegador = new NavegadorNaInternet();

        // Exemplo de uso do ReprodutorMusical
        reprodutor.tocar();
        reprodutor.pausar();
        System.out.println("Digite o nome da música para selecionar:");
        String musica = scanner.nextLine();
        reprodutor.selecionarMusica(musica);

        // Exemplo de uso do AparelhoTelefonico
        System.out.println("Digite o número para ligar:");
        String numero = scanner.nextLine();
        telefone.ligar(numero);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Exemplo de uso do NavegadorNaInternet
        System.out.println("Digite a URL para exibir a página:");
        String url = scanner.nextLine();
        navegador.exibirPagina(url);
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        scanner.close();
    }
}

class ReprodutorMusical {
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}

class AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}

class NavegadorNaInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}