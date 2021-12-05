import java.util.Scanner;

public class Race {

    public static void main (String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        double seconds = 0;
        double distance = 0;
        
        while (stdin.hasNext()){
        
        String befehl = stdin.next();
        double zahl = stdin.nextDouble();
        
        Racecar racecar = new Racecar();
        
        if(befehl.equals("drive")){
            racecar.drive(zahl);
        }
        
        if(befehl.equals("accelerate")){
            racecar.accelerate(zahl);
        }
        
        if(befehl.equals("decelerate")){
            racecar.decelerate(zahl);
        }
        
        System.out.println(racecar.toString());
        
        }
        
    }
}
