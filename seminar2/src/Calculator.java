import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x la puterea a 5 a si y la putearea a 7 a.
     * @return returneaza rezultatul calculat.
     * @throws IOException arunca exceptie daca datele introduse respecta formatul.
     */


    //denumire metoda
    //modificata exceptia sau tratata cea care poate aparea
    //in cazul valorilor non numerice sa reia procesul de citire
    //metoda separata pentru calculul ridicarii la putere
    public static double putere(double x, int y) {
        
		double rezultat = 1;
		
        for (int i = 0; i < y; i++) {
            rezultat *= x;
        }
        
		return rezultat;
    }
	
    public double calculateXpow5PlusYpow7() throws IOException {
       
	   double result = 0.0;     
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       boolean inputValid = false;
        
	   while (!inputValid) {  
		   try {
                System.out.println("Introduceti X:");
                double x = Double.parseDouble(reader.readLine());

                System.out.println("Introduceti Y:");
                double y = Double.parseDouble(reader.readLine());


                double xPow5 = putere(x,5);
                double yPow7 = putere(y,7);

                result = xPow5 + yPow7;
                inputValid = true;
				
            } catch (NumberFormatException e) {
                System.out.println("Input invalid! Va rugam introduceti o valoare numerica.");
            }
        }

        return result;
    }
}