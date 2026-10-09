package kz.kaznu.aiym.first;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("ЭКСПЕРИМЕНТ 1: Машинное эпсилонs");

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
    }
}