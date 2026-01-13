package Tasks;

public class Decimal_to_binary {

	public static void main(String[] args) {

        int num = 11;   // decimal number
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int rem = num % 2;
            binary = binary + rem * place;
            place = place * 10;
            num = num / 2;
        }

        System.out.println("Binary = " + binary);

	}
}
