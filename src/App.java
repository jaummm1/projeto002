import java.security.Permissions;
import java.time.LocalDate;

import entidades.Cliente;
import entidades.Contato;
import entidades.Documento;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {

        Endereco end2 = new Endereco("14406-395");
        end2.setBairro("JARDIM DERMINIO");
        end2.setCidade("Franca");
        end2.setLogradouro("faculdade");
        end2.setNome("Rua da fatec");
        end2.setNumero("1578");
        end2.setUf("SP");

        Documento doc2 = new Documento("000.000.000-00");
        doc2.setCnh("159.151.548-11");
        doc2.setRg("55.645.458-9");

        Contato cont2 = new Contato("joaquimpereira@gmail.com");
        cont2.setCelular("(16)99850-5456");
        cont2.setFixo("(16)5555-5555");

        Cliente obj1 = new Cliente();
        obj1.setScoreCredito(1234);
        obj1.setNome("Joaquim");
        obj1.setDataNascimento(LocalDate.of(1999, 04, 15));
        obj1.setEndereco(end2);
        obj1.setDocumento(doc2);
        obj1.setContato(cont2);

        Contato cont1 = new Contato("severinojose@gmail.com");
        cont1.setCelular("16-555555555");
        cont1.setFixo("(16)3705-8954");

        Documento doc1 = new Documento("111.111.111-11");
        doc1.setCnh("159.151.548-11");
        doc1.setRg("55.158.458-8");

        Endereco end1 = new Endereco("14406-395");
        end1.setBairro("JARDIM DERMINIO");
        end1.setCidade("Franca");
        end1.setLogradouro("faculdade");
        end1.setNome("Rua da fatec");
        end1.setNumero("1578");
        end1.setUf("SP");

        Funcionario fun1 = new Funcionario();
        fun1.setNome("Severino");
        fun1.setDataNascimento(LocalDate.of(2000, 04, 15));
        fun1.setMatricula("155");
        fun1.setSalario(1700);
        fun1.setDocumento(doc1);
        fun1.setEndereco(end1);
        fun1.setContato(cont1);

        System.out.println("---Funcionario---");
        Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);
    }

}
