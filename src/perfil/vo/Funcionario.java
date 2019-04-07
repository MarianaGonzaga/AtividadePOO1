
package perfil.vo;

public class Funcionario extends Pessoa {
  public Funcionario() {}
  
  public String getSetor() { return setor; }
  
  private String setor;
  public void setSetor(String setor) { this.setor = setor; }
}