package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Gerente extends FuncionarioPessoaFisica implements Demitidor {
    private static final double BONIFICACAO = 1.12;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void demitir(Funcionario funcionario) throws Exception {
        if (funcionario instanceof Gerente) {
            throw new Exception("Você não pode demitir este funcionário.");
        } else {
            funcionario.setDataDeDemissao(LocalDate.now());
        }
    }

    @Override
    public double consultarContraCheque() {
        return super.consultarContraCheque() * BONIFICACAO;
    }

    public void reajustarSalario(Funcionario funcionario, double novoSalario) throws Exception {
        if(funcionario instanceof Gerente) {
            throw new Exception("Voce nao pode reajustar o salario de um gerente");

        }
        if (novoSalario <= funcionario.getSalarioBase()) {
            throw new Exception("Novo valor de salário menor ou igual ao atual");
        }
    }
}
