package EV;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DivdemensijuMasivsTests {

    public static void main(String[] args) {
        String[][] jautajumi = {
            {"Kā izveidot divdimensiju masīvu Java programmēšanas valodā?", "A) int[][] masivs = new int[5][5];", "B) int[] masivs = new int[5];", "C) int masivs = new int[5][5];", "D) int[] masivs = new int[][];"},
            {"Kā piekļūt divdimensiju masīva elementam ar indeksiem (rinda, kolonna)?", "A) masivs[rinda, kolonna];", "B) masivs[rinda][kolonna];", "C) masivs[rinda, kolonna];", "D) masivs(rinda)(kolonna);"},
            // Pievienojiet pārējos jautājumus un atbilžu variantus šeit
        };

        char[][] pareizasAtbildes = {
            {'A', 'B'},
            {'B', 'C'},
            // Norādiet pareizās atbildes burtus katram jautājumam
        };

        int jautajumuSkaits = jautajumi.length;
        int pareizoSkaititajs = 0;

        for (int i = 0; i < jautajumi.length; i++) {
            String jautajums = jautajumi[i][0];
            String[] atbilzuVarianti = Arrays.copyOfRange(jautajumi[i], 1, jautajumi[i].length);

            StringBuilder options = new StringBuilder();
            for (int j = 0; j < atbilzuVarianti.length; j++) {
                options.append(atbilzuVarianti[j]).append("\n");
            }

            String atbilde;
            boolean validAtbilde = false;

            do {
                atbilde = JOptionPane.showInputDialog("Jautājums " + (i + 1) + ":\n" + jautajums + "\n\n" + options + "\nVai vēlaties iziet? (Ievadiet 'X' lai izietu)");

                if (atbilde != null) {
                    char atbildeBurti = atbilde.charAt(0);
                    if (atbildeBurti >= 'A' && atbildeBurti <= 'D') {
                        validAtbilde = true;

                        if (Character.toUpperCase(atbildeBurti) == pareizasAtbildes[i][0] || Character.toUpperCase(atbildeBurti) == pareizasAtbildes[i][1]) {
                            pareizoSkaititajs++;
                            JOptionPane.showMessageDialog(null, "Atbilde ir pareiza!", "Atbilde", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Atbilde ir nepareiza!", "Atbilde", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (atbilde.equalsIgnoreCase("X")) {
                        JOptionPane.showMessageDialog(null, "Jūs izgājāt no testa!", "Testa pabeigšana", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                } else {
                    int result = JOptionPane.showOptionDialog(null, "Vai vēlaties turpināt testu vai iziet?", "Izvēle", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Turpināt", "Iziet"}, "Turpināt");

                    if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Jūs izgājāt no testa!", "Testa pabeigšana", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
            } while (!validAtbilde);
        }

        JOptionPane.showMessageDialog(null, "Jautājumu skaits: " + jautajumuSkaits + "\nPareizi atbildētie jautājumi: " + pareizoSkaititajs, "Rezultāts", JOptionPane.INFORMATION_MESSAGE);
    }
}
