public class Racecar {

    private static double speed;
    private static double distance;

    public double getSpeed() {
        return speed;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public void accelerate(double speedDelta) {
        if(speedDelta < 0){
            return;}
        this.speed += speedDelta;
    }
    
    public void decelerate (double speedDelta) {
        if(speedDelta < 0){
            return;}
        this.speed -= speedDelta;
    }
    public void drive (double seconds) {
        distance += speed * seconds;
    
    }
    
    public String toString() {
       return "Speed: " + this.speed + "m/s, Distance: " + this.distance + "m";
    }
}
