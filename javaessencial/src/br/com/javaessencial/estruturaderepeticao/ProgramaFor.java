package br.com.javaessencial.estruturaderepeticao;

import java.util.Scanner;

public class ProgramaFor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String lista[] = new String[5];
		String nome;
		try {
			for (int i = 0; i < lista.length; i++) {
				System.out.println(" \n Informe seu nome para que possamos cadastrar no sistema.!");
				nome = in.nextLine();
				if (nome.isEmpty()) {
					System.out.println("Valor invalido , proxima tentativa");
					break;
				} else {
					lista[i] = nome;
				}
				exibir(lista[i]);

			}

			for (int i = 0; i < lista.length; i++) {

				System.out.println(lista[i]);
				String n = (lista[i].contains("max")) ? localizarRegistro(i, lista[i]) : "n�o localizado";
				if (n.equals("max")) {
					System.out.println(n);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	}

	private static void exibir(String arr) {
		StringBuffer sb = new StringBuffer();
		sb.append(" ##-- [Registros Adicionados] --## \n " + arr + " :");
		System.out.println(sb);
	}

	private static String localizarRegistro(int i, String n) {
		StringBuffer sb = new StringBuffer();
		sb.append(" Aten��o -> Localizamos um registro" + i + " |" + n.toUpperCase() + " ] --##");
		System.out.println(sb);
		return "";
	}
}
