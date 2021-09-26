package br.com.minhaempresa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Funcionario {
    private String endereco;
    private String nome;
    private String email;
    private String setor;
    private LocalDate dataDeAdmissao;
    private LocalDate dataDeDemissao;
    private double salarioBase;

    private List<Ferias> historicoFerias;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.admitir();
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double consultarContraCheque() {
        return getSalarioBase();
    }

    public List<Ferias> getHistoricoFerias() {
        return historicoFerias;
    }

    public void setHistoricoFerias(List<Ferias> historicoFerias) {
        this.historicoFerias = historicoFerias;
    }

    public void solicitarFerias(LocalDate dataInicio, LocalDate dataFim) throws Exception{
        Ferias ferias = new Ferias();

        if (LocalDate.now().minusMonths(11).isAfter(this.dataDeAdmissao)) {
            throw new Exception("Periodo de férias inválido.");
        }

        if(historicoFerias.size() > 0) {
            Ferias ultimasFerias = historicoFerias.get(historicoFerias.size() - 1);

            if (ultimasFerias.getDataFim() == null) {
                throw new Exception(this.nome + " já se encontra em período férias.");
            }

            if (LocalDate.now().minusMonths(4).isBefore(ultimasFerias.getDataFim())) {
                throw new Exception("Fora de período para soliciação de férias.");
            }
        }

        ferias.setDataInicio(dataInicio);
        ferias.setDataFim(dataFim);

        this.historicoFerias.add(ferias);
    }

    public void trabalhar(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {

    }

    public void solicitarDemissao() {
        this.setDataDeDemissao(LocalDate.now());
    }

    public void admitir() {
        this.setDataDeAdmissao(LocalDate.now());
    }
}
