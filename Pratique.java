import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Pratique {
    private List<Usuario> usuarios;
    private List<Evento> eventos;
    private static final List<String> CATEGORIAS = Arrays.asList("Festas", "Eventos Esportivos", "Shows", "Outros");
    private static final String ARQUIVO = "C:/Users/deivi/Códigos/Faculdade/events.data";

    public Pratique() {
        usuarios = new ArrayList<>();
        eventos = new ArrayList<>();
        carregarEventosDoArquivo();
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        System.out.println("Digite seu número de telefone:");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, telefone);
        usuarios.add(usuario);
        System.out.println("Usuário registrado com sucesso!");
    }

    public void criarEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do evento:");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do evento:");
        String endereco = scanner.nextLine();
        System.out.println("Digite a categoria do evento:");
        String categoria = scanner.nextLine();
        while (!CATEGORIAS.contains(categoria)) {
            System.out.println("Categoria inválida. Por favor, escolha entre: " + CATEGORIAS);
            categoria = scanner.nextLine();
        }
        System.out.println("Digite a descrição do evento:");
        String descricao = scanner.nextLine();
        System.out.println("Digite a data e hora do evento (yyyy-MM-dd HH:mm):");
        String dateTimeStr = scanner.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
            Evento evento = new Evento(nome, endereco, categoria, dateTime, descricao);
            eventos.add(evento);
            System.out.println("Evento criado com sucesso!");
            salvarEventosNoArquivo();
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data/hora inválido. Falha na criação do evento.");
        }
    }

    public void listarEventos() {
        System.out.println("Eventos:");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void participarDoEvento(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do evento para participar:");
        String nomeEvento = scanner.nextLine();

        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.adicionarParticipante(usuario);
                System.out.println("Participação no evento realizada com sucesso!");
                return;
            }
        }
        System.out.println("Evento não encontrado!");
    }

    public void cancelarParticipacao(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do evento para cancelar a participação:");
        String nomeEvento = scanner.nextLine();
    
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.removerParticipante(usuario);
                System.out.println("Participação cancelada com sucesso!");
                return;
            }
        }
        System.out.println("Evento não encontrado!");
    }

    public void mostrarEventosProximos() {
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Eventos próximos:");
        for (Evento evento : eventos) {
            if (evento.getDataHora().isAfter(agora)) {
                System.out.println(evento);
            }
        }
    }

    public void mostrarEventosPassados() {
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Eventos passados:");
        for (Evento evento : eventos) {
            if (evento.getDataHora().isBefore(agora)) {
                System.out.println(evento);
            }
        }
    }

    public void salvarEventosNoArquivo() {
        try (FileWriter escritor = new FileWriter(ARQUIVO)) {
            for (Evento evento : eventos) {
                escritor.write(evento.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar eventos no arquivo: " + e.getMessage());
        }
    }

    public void carregarEventosDoArquivo() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                // Analisa a linha e adiciona o evento à lista de eventos
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar eventos do arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Pratique sistemaDeEventos = new Pratique();
        Scanner scanner = new Scanner(System.in);
        String entrada;
        int escolha;

        do {
            System.out.println("1. Registrar Usuário");
            System.out.println("2. Criar Evento");
            System.out.println("3. Listar Eventos");
            System.out.println("4. Participar do Evento");
            System.out.println("5. Cancelar Participação");
            System.out.println("6. Mostrar Eventos Próximos");
            System.out.println("7. Mostrar Eventos Passados");
            System.out.println("8. Sair");
            System.out.println("Digite sua escolha:");
            entrada = scanner.nextLine();

            try {
                escolha = Integer.parseInt(entrada);
                switch (escolha) {
                    case 1:
                        sistemaDeEventos.registrarUsuario();
                        break;
                    case 2:
                        sistemaDeEventos.criarEvento();
                        break;
                    case 3:
                        sistemaDeEventos.listarEventos();
                        break;
                    case 4:
                        sistemaDeEventos.listarEventos();
                        System.out.println("Digite o nome do evento que deseja participar:");
                        String eventoParaParticipar = scanner.nextLine();
                        // Aqui estamos criando um novo usuário para participar do evento
                        Usuario novoUsuario = new Usuario("Fulano", "fulano@example.com", "123456789");
                        sistemaDeEventos.participarDoEvento(novoUsuario);
                        break;
                    case 5:
                        sistemaDeEventos.listarEventos();
                        System.out.println("Digite o nome do evento que deseja cancelar a participação:");
                        String eventoParaCancelar = scanner.nextLine();
                        // Aqui estamos criando um novo usuário para cancelar a participação no evento
                        Usuario usuarioParaCancelar = new Usuario("Fulano", "fulano@example.com", "123456789");
                        sistemaDeEventos.cancelarParticipacao(usuarioParaCancelar);
                        break;
                    case 6:
                        sistemaDeEventos.mostrarEventosProximos();
                        break;
                    case 7:
                        sistemaDeEventos.mostrarEventosPassados();
                        break;
                    case 8:
                        System.out.println("Encerrando programa. Até logo!");
                        break;
                    default:
                        System.out.println("Escolha inválida. Por favor, digite um número de 1 a 8.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                escolha = 0;
            }
        } while (escolha != 8);
    }

    static class Usuario {
        private String nome;
        private String email;
        private String telefone;

        public Usuario(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }
    }

    static class Evento {
        private String nome;
        private String endereco;
        private String categoria;
        private LocalDateTime dataHora;
        private String descricao;
        private List<Usuario> participantes;

        public Evento(String nome, String endereco, String categoria, LocalDateTime dataHora, String descricao) {
            this.nome = nome;
            this.endereco = endereco;
            this.categoria = categoria;
            this.dataHora = dataHora;
            this.descricao = descricao;
            this.participantes = new ArrayList<>();
        }

        public void adicionarParticipante(Usuario usuario) {
            participantes.add(usuario);
        }

        public void removerParticipante(Usuario usuario) {
            participantes.remove(usuario);
        }

        public String getNome() {
            return nome;
        }

        public LocalDateTime getDataHora() {
            return dataHora;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Endereço: " + endereco + ", Categoria: " + categoria + ", Data e Hora: " + dataHora
                    + ", Descrição: " + descricao;
        }
    }
}