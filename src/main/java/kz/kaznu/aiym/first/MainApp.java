package kz.kaznu.aiym.first;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("ЭКСПЕРИМЕНТ 1: Машинное эпсилон");

        float epsFloat = 1.0f;
        while ((1.0f + epsFloat / 2.0f) != 1.0f) {
            epsFloat = epsFloat / 2.0f;
        }

        double epsDouble = 1.0;
        while ((1.0 + epsDouble / 2.0) != 1.0) {
            epsDouble = epsDouble / 2.0;
        }

        System.out.println("Вычисленное eps для float: " + epsFloat);
        System.out.println("Вычисленное eps для double: " + epsDouble);
        System.out.println("Теоретическое 2^-23: " + Math.pow(2, -23));
        System.out.println("Теоретическое 2^-52: " + Math.pow(2, -52));
        System.out.println();

        System.out.println("ЭКСПЕРИМЕНТ 2: Рекурсия для интеграла I(n)");

        int nMax = 20;

        // 1. Прямая рекурсия (вперед)
        double[] iForward = new double[nMax + 1];
        iForward[0] = 1.0 - 1.0 / Math.E;

        for (int n = 1; n <= nMax; n++) {
            iForward[n] = 1.0 - n * iForward[n - 1];
        }

        // 2. Обратная рекурсия (назад)
        int N_start = 30;
        double[] iBackward = new double[N_start + 1];
        iBackward[N_start] = 0.0;

        for (int n = N_start; n >= 1; n--) {
            iBackward[n - 1] = (1.0 - iBackward[n]) / n;
        }
    }
}