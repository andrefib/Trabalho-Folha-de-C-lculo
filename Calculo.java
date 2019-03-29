
public class Calculo {
	private int horas;
	private double salHora;
	private int numDep;
	double salBru;
	double desconto;
	double ir;
	
	public Calculo(int horas, double salHora, int numDep) {
		this.horas=horas;
		this.salHora=salHora;
		this.numDep=numDep;
	}
	
	void salBru() {
		double salBru;
		salBru=horas * salHora + (50 * numDep);
		this.salBru=salBru;
		System.out.println("Salario bruto: " + salBru);
	}
	void desInss() {
		double desconto;
		if( salBru <=1000) {
			desconto = (salBru * 8.5)/100;
		}
			else {
				desconto = (salBru * 9)/100;
			}
		this.desconto=desconto;
		System.out.println("Desconto INSS: " + desconto);
	}
	void desIr() {
		double ir=0;
		if( salBru > 500 && salBru <=1000) {
			ir=( salBru * 5)/100;
		}
		else if( salBru > 1000) {
			ir=( salBru * 7)/100;
		}
		this.ir=ir;
		System.out.println("Desconto IR: " + ir);
	}
	void salL() {
		double salL=0;
		salL=salBru - desconto - ir;
		System.out.println("Salario liquido: " + salL);
	}
}
