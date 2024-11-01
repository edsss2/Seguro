import java.util.Scanner;

import Classes.AnaliseTecnica;
import Classes.Descricao;
import Classes.Empresa;
import Classes.Equipamento;
import Classes.InspecaoVisual;
import Classes.Recomendacoes;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String dadoAdicionalEquipamento = "";

        //Empresa
        System.out.println("Nome: ");
        String nome = scn.nextLine();

        System.out.println("CNPJ :");
        String cnpj = scn.nextLine();

        System.out.println("Responsável Técnico: ");
        String responsavelTecnico = scn.nextLine();

        System.out.println("Empresa/Instituição: ");
        String empresaResponsavelTecnico = scn.nextLine();

        Empresa e1 = new Empresa(nome, cnpj, responsavelTecnico, empresaResponsavelTecnico);
        System.out.println(e1);

        //Equipamento
        System.out.println("Tipo de Equipamento: ");
        String tipoEquipamento = scn.nextLine();

        System.out.println("Marca: ");
        String marca = scn.nextLine();

        System.out.println("Modelo: ");
        String modelo = scn.nextLine();

        System.out.println("Número de Série: ");
        String numeroSerie = scn.nextLine();

        System.out.println("Local de Uso: ");
        String localUso = scn.nextLine();

        System.out.println("Deseja adicionar dado adicional? Digite s/n");
        String escolha = scn.nextLine();

        if(escolha.equals("s")){
            System.out.println("Digite o nome do dado adicional");
            String nomeDadoAdicional = scn.nextLine();
            System.out.println(nomeDadoAdicional + ": ");
            dadoAdicionalEquipamento = scn.nextLine();
            Equipamento equipamento1 = new Equipamento(tipoEquipamento, marca, modelo, numeroSerie, localUso);
        } else{
            System.out.println("Nenhum dado adicional sera adicionado");
            Equipamento equipamento1 = new Equipamento(tipoEquipamento, marca, modelo, numeroSerie, localUso, dadoAdicionalEquipamento);
        }
        

        //Descrição do Acidente
        System.out.println("Data do Acidente: ");
        String dataAcidente = scn.nextLine();

        System.out.println("Hora do Acidente: ");
        String horaAcidente = scn.nextLine();

        System.out.println("Descrição do Evento");
        String descricao = scn.nextLine();

        Descricao descricao1 = new Descricao(dataAcidente, horaAcidente, descricao);

        //Inspeção Visual do Equipamento
        System.out.println("Estado geral: ");
        String estadoGeral = scn.nextLine();

        System.out.println("Sinais de Queima: ");
        String sinaisDeQueima = scn.nextLine();

        System.out.println("Componentes Afetados: ");
        String componentesAfetados = scn.nextLine();

        InspecaoVisual inspecaoVisual1 = new InspecaoVisual(estadoGeral, sinaisDeQueima, componentesAfetados);
        
        //Análise Técnica
        System.out.println("Causas Prováveis do Incidente: ");
        String causasIncidente = scn.nextLine();

        System.out.println("Condições de Uso: ");
        String condicoesUso = scn.nextLine();

        AnaliseTecnica at1 = new AnaliseTecnica(causasIncidente, condicoesUso);

        //Recomendações
        System.out.println("Manutenção: ");
        String manutencao = scn.nextLine();

        System.out.println("Deseja adicionar alguma recomendação extra? Digite s/n");
        escolha = scn.nextLine();

        if(escolha.equals("s")){
            System.out.println("Digite o nome do dado adicional");
            String nomeDadoAdicional = scn.nextLine();
            System.out.println(nomeDadoAdicional + ": ");
            String recomendacaoExtra = scn.nextLine();
            Recomendacoes r1 = new Recomendacoes(manutencao, recomendacaoExtra);
        } else{
            System.out.println("Nenhum dado adicional sera adicionado");
            Recomendacoes r1 = new Recomendacoes(manutencao);
        }
        






       
    }
}
