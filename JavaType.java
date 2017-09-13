
public class JavaTypes {
  public static void main(String... args) {
    System.out.println("Сумма цифр 327: " + summ(327) + "\nОкругленное до целого число 1.276: " + roundValue(1.276));
  }

  public static int summ(int value) {
    //Тут ваш код
    int summ = 0;
    int currentDigit = 0;
    int ost = value;

    while (ost != 0) {
    	currentDigit = ost % 10;
    	summ += currentDigit;
    	ost = (ost - currentDigit) / 10;
    }
    
    return summ;
  }


 public static int roundValue(double value) {
    //Тут ваш код
    if ((value - (int) value) < 0.5) {
    	return (int)(value - (value - (int)value));
    } else {
    	return (int)(value - (value - (int)value) + 1);
    }

  }
}

