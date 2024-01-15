public class PrintTable {
    public static void main(String[] args) {
        int[][] table = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        printTable(table);
    }

    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            printHorizontalLine(table[i].length);
            System.out.println();
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("| " + table[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        printHorizontalLine(table[0].length);
    }

    public static void printHorizontalLine(int length) {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("---+");
        }
        System.out.println();
    }
}
