package Selection_and_Iteration_Statements;

class fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.println(n1 + "\n" + n2);

        // we use 2 as 0 and 1 are aldready printed.
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.println("" + n3);
            n1 = n2;
            n2 = n3;

        }

    }
}