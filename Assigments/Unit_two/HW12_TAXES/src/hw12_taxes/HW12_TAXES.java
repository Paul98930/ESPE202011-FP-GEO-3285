
package hw12_taxes;

import java.util.Scanner;

public class HW12_TAXES {

    public static void main(String[] args) {

        System.out.println("******************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my homework code*");
        System.out.println("******************************************************************************************");
        System.out.println("");

        Scanner in = calculateIncomeTax();

        printForeignExchange();

        float imponible_value_2 = 0.00F;
        float Foreign_money = 0.00F;
        float International_transfer = 0.00F;
        float Public_show = 0.00F;
        float Rate_foreign = 0.00F;
        float case_one = 0.00F;
        float case_two = 0.00F;
        float case_three = 0.00F;
        float percentage = 0.00F;
        float sueldo_básico = 1200.00F;
        float monto_anual = 5017.33F;
        float number4 = 100.00F;
        boolean option_1 = true;
        boolean option_2 = true;
        boolean option_three = true;

        percentage = showForeignExchange(option_1, in, percentage, sueldo_básico, number4, option_2, monto_anual, option_three);

        System.out.println("");
        System.out.println("");
        System.out.println("***************");
        System.out.println("*THE IVA VALUE*");
        System.out.println("***************");

        calculateTheIva(in, percentage, number4);

    }

    public static void printForeignExchange() {
        System.out.println("");
        System.out.println("");
        System.out.println("**********************");
        System.out.println("*The FOREIGN EXCHANGE*");
        System.out.println("**********************");
        System.out.println("");
    }

    public static void calculateTheIva(Scanner in, float percentage, float number4) {
        float value = 0.00F;
        float percentage1 = 0.00F;
        float total_value = 0.00F;
        float number5 = 100.00F;

        System.out.println("What is the value ?");
        value = in.nextInt();
        System.out.println("What's the value percentage");
        percentage1 = in.nextInt();

        float total_value1 = ((float) value) * ((float) percentage) / ((float) number4);
        System.out.println("The value of divisas is: " + (float) total_value1);
    }

    public static float showForeignExchange(boolean option_1, Scanner in, float percentage, float sueldo_básico, float number4, boolean option_2, float monto_anual, boolean option_three) {
        float imponible_value_2;
        float International_transfer;
        float Rate_foreign;
        float Public_show;
        if (option_1) {

            System.out.println("What is the imponible value ?");
            imponible_value_2 = in.nextInt();
            System.out.println("What's the value for international transfer");
            International_transfer = in.nextInt();
            System.out.println("What's the value percentage");
            percentage = in.nextInt();

            float Case_one = ((float) imponible_value_2 - (float) sueldo_básico) * ((float) percentage) / ((float) number4);
            System.out.println("The value of divisas is: " + (float) Case_one);
        } else if (option_2) {

            System.out.println("What is the imponible value ?");
            imponible_value_2 = in.nextInt();
            System.out.println("What's the value for Rate foreign");
            Rate_foreign = in.nextInt();
            System.out.println("What's the value percentage");
            percentage = in.nextInt();

            float Case_two = ((float) imponible_value_2 - (float) monto_anual) * ((float) percentage) / ((float) number4);
            System.out.println("The value of divisas is: " + (float) Case_two);

        } else if (option_three) {
            System.out.println("What is the imponible value ?");
            imponible_value_2 = in.nextInt();
            System.out.println("What's the value for public show");
            Public_show = in.nextInt();
            System.out.println("What's the value percentage");
            percentage = in.nextInt();

            float Case_three = ((float) imponible_value_2) * ((float) percentage) / ((float) number4);
            System.out.println("The value of divisas is: " + (float) Case_three);

        }
        return percentage;
    }

    public static Scanner calculateIncomeTax() {
        System.out.println("-The value of Income Tax. ");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        String name = "";
        String requirements = "";
        float ingresos_anuales = 000F;
        float gastos_deducibles = 0.00F;
        float base_imponible = 0.00F;
        float fraccion_excedente = 0.00F;
        float impuesto_fraccion_excedente = 0.00F;
        float impuesto_fracccion_basica = 0.00F;
        float impuesto_renta = 0.00F;
        float impuesto_percentage_excedent = 0.00F;
        float number = 100.0F;
        float fraccion_basica1 = 0.00F;
        float fraccion_basica2 = 0.00F;
        float value1 = 0.00F;
        float fraccion_basica3 = 0.00F;
        float fraccion_basica4 = 0.00F;
        float fraccion_basica5 = 0.00F;
        float fraccion_basica6 = 0.00F;
        float fraccion_basica7 = 0.00F;
        float fraccion_basica8 = 0.00F;
        float fraccion_basica12 = 0.00F;
        float fraccion_basica34 = 0.00F;
        float fraccion_basica56 = 0.00F;
        float fraccion_basica78 = 0.00F;
        System.out.println("What's the usuarie name ?");
        name = in.nextLine();
        System.out.println("What's your requirement ?");
        requirements = in.nextLine();
        System.out.println("What's the base imponible value?");
        base_imponible = in.nextInt();
        if (value1 >= fraccion_basica1 && value1 <= fraccion_basica2) {

            System.out.println("What are the value?");
            value1 = in.nextInt();
            System.out.println("What are the numbers for fraccion basica?");
            fraccion_basica1 = in.nextInt();
            fraccion_basica2 = in.nextInt();
            System.out.println("What's the percentage excedent");
            impuesto_percentage_excedent = in.nextInt();

            fraccion_excedente = ((float) base_imponible - (float) fraccion_basica1) * ((float) impuesto_percentage_excedent) / ((float) number);
            impuesto_renta = (float) fraccion_excedente + (float) impuesto_fracccion_basica;

            System.out.println("The value of impuesto_renta is: " + impuesto_renta);
        }
        if (value1 != fraccion_basica12) {
            if (value1 >= fraccion_basica3 && value1 <= fraccion_basica4) {
                System.out.println("What are the values?");
                value1 = in.nextInt();
                System.out.println("What are the numbers for fraccion basica?");
                fraccion_basica3 = in.nextInt();
                fraccion_basica4 = in.nextInt();
                System.out.println("What's the percentage excedent");
                impuesto_percentage_excedent = in.nextInt();

                fraccion_excedente = ((float) base_imponible - (float) fraccion_basica3) * ((float) impuesto_percentage_excedent) / ((float) number);
                impuesto_renta = (float) fraccion_excedente + (float) impuesto_fracccion_basica;

                System.out.println("The value of impuesto_renta is: " + impuesto_renta);

            }

        } else if (value1 != fraccion_basica34) {
            if (value1 >= fraccion_basica5 && value1 <= fraccion_basica6) {
                System.out.println("What are the values?");
                value1 = in.nextInt();
                System.out.println("What are the numbers for fraccion basica?");
                fraccion_basica5 = in.nextInt();
                fraccion_basica6 = in.nextInt();
                System.out.println("What's the percentage excedent");
                impuesto_percentage_excedent = in.nextInt();

                fraccion_excedente = ((float) base_imponible - (float) fraccion_basica5) * ((float) impuesto_percentage_excedent) / ((float) number);
                impuesto_renta = (float) fraccion_excedente + (float) impuesto_fracccion_basica;

                System.out.println("The value of impuesto_renta is: " + impuesto_renta);
            }
        } else if (value1 != fraccion_basica56) {
            if (value1 >= fraccion_basica7 && value1 <= fraccion_basica8) {
                System.out.println("What are the values?");
                value1 = in.nextInt();
                System.out.println("What are the numbers for fraccion basica?");
                fraccion_basica7 = in.nextInt();
                fraccion_basica8 = in.nextInt();
                System.out.println("What's the percentage excedent");
                impuesto_percentage_excedent = in.nextInt();

                fraccion_excedente = ((float) base_imponible - (float) fraccion_basica7) * ((float) impuesto_percentage_excedent) / ((float) number);
                impuesto_renta = (float) fraccion_excedente + (float) impuesto_fracccion_basica;

                System.out.println("The value of impuesto_renta is: " + impuesto_renta);

            }
        } else {

            System.out.println("We had ended");
        }
        return in;
    }

}
