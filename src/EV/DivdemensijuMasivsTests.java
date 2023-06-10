package EV;

import java.util.Arrays; 
import javax.swing.JOptionPane;

public class DivdemensijuMasivsTests {
	 public static void main(String[] args) {
	        String[][] Jautajumi = {
	            {"1# Kā izveidot divdimensiju masīvu Java programmēšanas valodā?", "A) int masivs = new int[5][5];", "B) int[] masivs = new int[][];", "C) int[][] masivs = new int[5][5];", "D) int[] masivs = new int[5];" },
	            {"2# Kā piekļūt divdimensiju masīva elementam ar indeksiem (rinda, kolonna)?", "A) masivs[rinda, kolonna];", "B) masivs[rinda][kolonna];", "C) masivs[rinda, kolonna];", "D) masivs(rinda)(kolonna);"},
	            {"3# Kā definēt divdimensiju int masīvu ar 3 rindām un 4 kolonnām?", "A)int[][] array = new int[3][4];", "B)int[][] array = new int[12];", "C)int[] array = new int[3][4];", "D)int[][] array = new int[4][3];"},
	            {"4# Kā piekļūt divdimensiju masīva konkrētam elementam?", "A) array[rowIndex][columnIndex];", "B) array[columnIndex][rowIndex];", "C) array[rowIndex, columnIndex];", "D) array[columnIndex, rowIndex];"},
	            {"5# Kā iegūt rindu skaits divdimensiju masīvā?", "A) array.length;", "B) array[0].length;", "C) array.rows();", "D) array.columns();"},
	            {"6# Kā pārlasīt visus elementus divdimensiju masīvā?", "A)for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length; j++) { System.out.println(array[i][j]); } }", "B) for (int i = 0; i < array.length; i++) { for (int j = 0; j < array.length; j++) { System.out.println(array[i][j]); } }", "C) for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }", "D) for (int j = 0; j < array.length; j++) { System.out.println(array[j]); }"},
	            {"7# Kā izdrukāt visus elementus divdimensiju String masīvā?", "A) for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length; j++) { System.out.println(array[i][j]); } }", "B) for (int i = 0; i < array.length; i++) { for (int j = 0; j < array.length; j++) { System.out.println(array[i][j]); } }", "C) for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }", "D) for (int j = 0; j < array.length; j++) { System.out.println(array[j]); }" },
	            {"8# Kā pārbaudīt vai divdimensiju masīvs ir tukšs?", "A) array.isEmpty();", "B) array.length == 0;", "C) array[0].length == 0;", "D) array == null;"},
	            {"9# Kā veikt divdimensiju masīva elementu summu?", "A) int sum = array.sum();", "B) int sum = 0; for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length; j++) { sum += array[i][j]; } } ", "C) int sum = Arrays.sum(array);", "D) int sum = 0; for (int[] row : array) { for (int element : row) { sum += element; } }"},
	            {"10# Kā izveidot tukšu divdimensiju masīvu?", "A) int[][] array = new int[0][0];", "B) int[][] array = new int[1][1];", "C) int[][] array = {};", "D) int[][] array = new int[][];"},
	        };
	        
	        char[][] PARatbildes = {
	            {'C', 'D'},
	            {'B', 'C'},
	            {'A', 'D'},
	            {'A', 'B'},
	            {'A', 'B'},
	            {'A', 'B'},
	            {'A', 'B'},
	            {'B', 'C'},
	            {'B', 'C'},
	            {'C', 'D'},
	            
	        };

	        int JAUskaits = Jautajumi.length;
	        int PareizoAtbilzuSkaititajs = 0;

	        for (int i = 0; i < Jautajumi.length; i++) {
	            String jautajums = Jautajumi[i][0];
	            String[] atbilzuVarianti = Arrays.copyOfRange(Jautajumi[i], 1, Jautajumi[i].length);

	            StringBuilder options = new StringBuilder();
	            for (int j = 0; j < atbilzuVarianti.length; j++) {
	                options.append(atbilzuVarianti[j]).append("\n");
	            }

	            char Atbildes = AtbildesIevade(jautajums, options.toString());
	            if (Atbildes == 'X') {
	                JOptionPane.showMessageDialog(null, "Jūs izgājāt no testa!", "Testa pabeigšana", JOptionPane.INFORMATION_MESSAGE);
	                return;
	            } else if (PareizaAtbilde(Atbildes, PARatbildes[i])) {
	            	PareizoAtbilzuSkaititajs++;
	                JOptionPane.showMessageDialog(null, "Atbilde ir pareiza!", "Atbilde", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(null, "Atbilde ir nepareiza!", "Atbilde", JOptionPane.ERROR_MESSAGE);
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Jautājumu skaits: " + JAUskaits + "\nPareizi atbildētie jautājumi: " + PareizoAtbilzuSkaititajs, "Rezultāts", JOptionPane.INFORMATION_MESSAGE);
	    }
	//
	   public static char AtbildesIevade(String jautajums, String options) {
	        String Atbildes;
	        boolean nepareizasAtbildes = false;

	        do {
	        	Atbildes = JOptionPane.showInputDialog("Jautājums:\n" + jautajums + "\n\n" + options + "\nVai vēlaties iziet? (Ievadiet 'X' lai izietu)");

	            if (Atbildes != null) {
	                char atbildeBurti = Atbildes.charAt(0);
	                if (atbildeBurti >= 'A' && atbildeBurti <= 'D') {
	                	nepareizasAtbildes = true;
	                    return Character.toUpperCase(atbildeBurti);
	                } else if (Atbildes.equalsIgnoreCase("X")) {
	                    return 'X';
	                }
	            } else {
	                int result = JOptionPane.showOptionDialog(null, "Vai vēlaties turpināt testu vai iziet?", "Izvēle", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Turpināt", "Iziet"}, "Turpināt");

	                if (result == 1) {
	                    return 'X';
	                }
	            }
	        } while (!nepareizasAtbildes);

	        return ' ';
	    }
	//
	    public static boolean PareizaAtbilde(char Atbildes, char[] pareizasAtbildes) {
	        return Character.toUpperCase(Atbildes) == pareizasAtbildes[0] || Character.toUpperCase(Atbildes) == pareizasAtbildes[1];
	    }
	}