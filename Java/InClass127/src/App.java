public class App {
    public static void main(String[] args) throws Exception {
        double[] lst1 = new double[20];
        int idx = 0;
        for (int i = 0; i <= 10; i += 0.5) {
            lst1[i] = i;
            idx += 1;
        }

        double[] cmpVals = computeVals(lst1);
        System.out.println(cmpVals[3]);
        displayVals(cmpVals);

    }

    public static double[] computeVals(double[] vals) {
        double[] lst = new double[20];
        int cnt = 0;

        for (double i : vals) {
            double x = Math.pow(i, 2.0);
            lst[cnt] = Math.sin(i) + Math.sin(x);
        }

        System.out.println(lst[3]);

        return lst;

    }

    public static void displayVals(double[] cmpVals) {
        int idx = 0;
        for (int i = 0; i < cmpVals.length / 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(cmpVals[idx] + " ");
                idx += 1;
            }
            System.out.println();
        }
    }
}
