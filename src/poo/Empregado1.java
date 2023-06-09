package poo;

public class Empregado1 extends Pessoa {
       private int codigoSetor;
       private float salarioBase;
       private float imposto;
	public Empregado1(String string, String string2, String string3, int codigoSetor, float salarioBase, float imposto, int i, int j) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
       
    public void imprimirInfo() {
    	System.out.println("\nNome do empregade: "+getNome()+"\nCPF: "+getCpf()
    	+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()
    	+"\nCódigo do setor: "+codigoSetor+"\nSalário Base: "+salarioBase+
    	"\nValor em porcentagem (sem o %) do imposto a ser retido do salário: "+imposto);
    }
    
	public void calcularSalario() {
		double salario_total = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado "+getNome()
		+" é igual a: "+salario_total);
	}

}
