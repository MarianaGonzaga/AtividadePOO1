/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.PrintStream;
import java.util.List;
import perfil.vo.Funcionario;

public class Cadastro
{
  List<Funcionario> empregado = new java.util.ArrayList();
  
  public Cadastro() {}
  
  public void cadastraFuncionario(Funcionario funcionario) { empregado.add(funcionario); }
  

  public void listaFuncionario()
  {
    for (int i = 0; i < empregado.size(); i++) {
      System.out.println("------------------------------------------------");
      System.out.println("Nome: " + ((Funcionario)empregado.get(i)).getNome());
      System.out.println("Idade: " + ((Funcionario)empregado.get(i)).getIdade());
      System.out.println("Codigo: " + ((Funcionario)empregado.get(i)).getCodigo());
      System.out.println("Setor: " + ((Funcionario)empregado.get(i)).getSetor());
      System.out.println("------------------------------------------------");
    }
  }
  
  public void excluiFuncionario(int cod) {
    for (int i = 0; i < empregado.size(); i++) {
      if (((Funcionario)empregado.get(i)).getCodigo() == cod) {
        empregado.remove(i);
      }
    }
  }
}