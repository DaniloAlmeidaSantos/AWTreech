package awtreech;

import java.util.ArrayList;

public class StoriesTest {
	
	static G6 principal = new G6();
	static int passedOnTest = 0, noPassedOnTest = 0;
	static ArrayList<String> arrPassedOnTest = new ArrayList<>();
	static ArrayList<String> arrNoPassedOnTest = new ArrayList<>();
	
	private static void StoriesMax() throws Exception {
		boolean stories = principal.stories(15, true);
		// Verificar o m�ximo de quest�es, retorno esperado - false
		if (!stories) {
			System.out.println("Passou no teste! - Teste 01");
			passedOnTest++;
			arrPassedOnTest.add("1");
		} else {
			System.out.println("N�O passou no teste! - Teste 01");
			noPassedOnTest++;
			arrNoPassedOnTest.add("1");
		}
	}
	
	private static void StoriesMin() throws Exception {
		boolean stories = principal.stories(0, true);
		// Verificar o minimo de quest�es, retorno esperado - true
		if (!stories) {
			System.out.println("N�o passou no teste! - Teste 02");
			noPassedOnTest++;
			arrNoPassedOnTest.add("1");
		} else {
			System.out.println("Passou no teste! - Teste 02");
			passedOnTest++;
			arrPassedOnTest.add("1");
		}
	}

	public static void main(String[] args) throws Exception {
		StoriesMax();
		StoriesMin();
		
		System.out.println("Casos de testes com resultados esperados com sucesso: " + passedOnTest);
		System.out.println("Casos de testes com falhas: " + noPassedOnTest);

		System.out.println("\n Caso de teste com retorno positivo: ");
		for (String CTOnPassed : arrPassedOnTest) {
			System.out.print("\t" + CTOnPassed);
		}

		System.out.println("\n Caso de teste com retorno negativo: ");
		for (String CTNoPassed : arrNoPassedOnTest) {
			System.out.print("\t" + CTNoPassed);
		}
	}
}