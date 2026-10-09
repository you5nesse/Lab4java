package point;

public class Point {
  private double x ;
  private double y ;
  public Point(double x, double y) {
	super();
	this.x = x;
	this.y = y;
  }
  public double getX() {
	return x;
  }
  public void setX(double x) {
	this.x = x;
  }
  public double getY() {
	return y;
  }
  public void setY(double y) {
	this.y = y;
  }
  public  Point translation(double a , double b) {
	  return new Point(this.x + a, this.y + b );
  }
  
  public static double distance(Point A ,Point B) {
	  double X = B.x - A.x ;
	  double Y = B.y - B.x ;
	  return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
  }
  @Override
  public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
  }
  
  
}
