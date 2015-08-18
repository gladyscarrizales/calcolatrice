/******************************************************************************
 * Vige, Home of Professional Open Source Copyright 2015, Vige, and           *
 * individual contributors by the @authors tag. See the copyright.txt in the  *
 * distribution for a full listing of individual contributors.                *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 2.0 (the "License");*
 * you may not use this file except in compliance with the License.           *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 ******************************************************************************/
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
