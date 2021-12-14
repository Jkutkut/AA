package dam.ej3.pojo;

public class Empleado {
	
	static final int LIM_SAL = 1000;
	static final int LIM_SUP_ANIOS = 5;
	static final int LIM_INF_ANIOS = 2;
	static final int AUM_SUP = 100;
	static final int AUM_INF = 50;
	
	private int numOperario;
	private double salarioMes;
	private int aniosAnt;
	
	public Empleado(int numOperario, double salarioMes, int aniosAnt) {
		this.numOperario = numOperario;
		this.salarioMes = salarioMes;
		this.aniosAnt = aniosAnt;
	}
	
	public void revisarSalario() {
		/*
		 * -	Si el salario es inferior a 1000 y su antig�edad es igual o superior a 5 a�os, 
		 * aumente el valor del salario en 100 
			-	Si el salario es inferior a 1000 y su antig�edad es menor a 5 a�os y 
			mayor o igual que 2, aumente el valor del salario en 50. 
			-	Si el salario es mayor o igual a 1000 o la antig�edad menor que 2 a�os, 
			no se apliquen cambios.

		 */
		if (salarioMes < LIM_SAL) {
			if (aniosAnt >= LIM_SUP_ANIOS) {
				salarioMes += AUM_SUP;
			} else if (aniosAnt >= LIM_INF_ANIOS) {
				salarioMes += AUM_INF;
			}
		}
		
		/*if (salarioMes < LIM_SAL && aniosAnt >= LIM_SUP_ANIOS) {
			
		} else if (salarioMes < LIM_SAL && 
				aniosAnt < LIM_SUP_ANIOS && aniosAnt >= LIM_INF_ANIOS) {
			
		} */
	
	}

	@Override
	public String toString() {
		return numOperario 
				+ "\nA�os de antig�edad: " + aniosAnt 
				+ "\nSalario: " + salarioMes + "� mensuales";
	}
	
	
	

}
