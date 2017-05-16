public class alg {
	Double Height = 0.0;
	Double x = 0.0;
	Double Gravity = -9.8;
	Double Theta = 0.0;
	Double Velocity = 0.0;
	public void setX(Double a){
		x = a;
	}
	public void setHeight(Double a){
		Height = a;
	}
	public void setGravity(Double a){
		Gravity = a;
	}
	public void setVelocity(Double a){
		Velocity = a;
	}
	public void setTheta(Double a){
		Theta = Math.toRadians(a);
	}
	public Double getY(Double time){
		Double Y = Height + Velocity*Math.sin(Theta)+(.5*Gravity*Math.pow(time, 2));
		return Y;
	}
	public Double getX(Double time){
		Double xx = x+Velocity*Math.cos(Theta);
		return xx;
	}

}
