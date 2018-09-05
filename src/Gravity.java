
public class Gravity {
	public double falling(double time, double velo){
        double acc = 9.8;
        double dist = velo * time + 0.5 * acc * time * time;
        return dist;
      }
}
