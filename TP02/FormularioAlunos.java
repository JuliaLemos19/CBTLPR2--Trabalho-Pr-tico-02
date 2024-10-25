import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FormularioAlunos extends JFrame {

    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoEndereco;
    private List<Aluno> listaAlunos;

    public FormularioAlunos() {
        // Inicializar a lista de alunos
        listaAlunos = new ArrayList<>();

        // Configurações da janela
        setTitle("Cadastro de Alunos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Criar e adicionar componentes
        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField();
        JLabel labelIdade = new JLabel("Idade:");
        campoIdade = new JTextField();
        JLabel labelEndereco = new JLabel("Endereço:");
        campoEndereco = new JTextField();

        JButton botaoOk = new JButton("OK");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoMostrar = new JButton("Mostrar");
        JButton botaoSair = new JButton("Sair");

        add(labelNome);
        add(campoNome);
        add(labelIdade);
        add(campoIdade);
        add(labelEndereco);
        add(campoEndereco);
        add(botaoOk);
        add(botaoLimpar);
        add(botaoMostrar);
        add(botaoSair);

        // Ação do botão OK
        botaoOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                int idade = Integer.parseInt(campoIdade.getText());
                String endereco = campoEndereco.getText();
                
                // Criar novo aluno e adicionar à lista
                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setIdade(idade);
                aluno.setEndereco(endereco);
                listaAlunos.add(aluno);
                
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            }
        });

        // Ação do botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoIdade.setText("");
                campoEndereco.setText("");
            }
        });

        // Ação do botão Mostrar
       botaoMostrar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (listaAlunos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
        } else {
            StringBuilder mensagem = new StringBuilder("Resultado:\n");
            for (Aluno aluno : listaAlunos) {
                mensagem.append("Id: ")
                        .append(aluno.getId().toString())  // Exibe o UUID
                        .append(" Nome: ")
                        .append(aluno.getNome())           // Exibe o nome do aluno
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, mensagem.toString(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
});

        // Ação do botão Sair
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Executa a aplicação
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioAlunos().setVisible(true);
            }
        });
    }
}
