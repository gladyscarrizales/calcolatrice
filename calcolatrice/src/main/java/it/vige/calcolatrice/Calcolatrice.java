package it.vige.calcolatrice;

public class Calcolatrice {

	public static void main(String[] args) {
		if (args[0].equals("addizione"))
			addizione(args);
		else if (args[0].equals("sottrazione"))
			sottrazione(new Integer(args[1]), new Integer(args[2]));
		else if (args[0].equals("moltiplicazione"))
			moltiplicazione(new Integer(args[1]), new Integer(args[2]));
		else if (args[0].equals("divisione"))
			divisione(new Double(args[1]), new Double(args[2]));

	}

	public static void addizione(String[] elencoDiNumeri) {
		int risultato = 0;
		boolean primaVolta = true;
		for (String numero : elencoDiNumeri) {
			if (!primaVolta)
				risultato = risultato + new Integer(numero);
			primaVolta = false;
		}
		System.out.println(risultato);

	}

	public static void sottrazione(int i, int j) {
		System.out.println(i - j);

	}

	public static void moltiplicazione(int i, int j) {
		System.out.println(i * j);

	}

	public static void divisione(double i, double j) {
		System.out.println(i / j);

	}

}
