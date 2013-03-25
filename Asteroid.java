import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Asteroid {
	
	int  xPosition, yPosition, direction,  size;
	
	public Asteroid(int xPosition, int yPosition, int direction, int size){
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.direction=direction;
		this.size=size;
		Random r= new Random();
		direction=r.nextInt(360);

	}	
	
	public void draw(Graphics g, int size, int x, int y){
		int radius=50; //unknown until testing
		g.setColor(Color.gray); // set color ?
		g.fillOval((int)(x-size*radius+.5),(int)(y-size*radius+.5),
		(int)(2*size*radius),(int)(2*size*radius));
		}
	
	public int getX(){
		return this.xPosition;
	}
	
	public int getY(){
		return this.yPosition;
	}
	
	public int getDir(){
		return this.direction;
	}
	
	public void destroy(int size){
		if (size==1){
			
		}else{
			Asteroid A= new Asteroid(this.xPosition,this.yPosition,this.direction+90, size--);
			Asteroid B= new Asteroid(this.xPosition,this.yPosition,this.direction-90, size--);
			
		}
	}
		
	public void move(){
		int velocity=24;// needs to be tested to find value
		this.xPosition=this.xPosition+velocity*(int)Math.cos(getDir());
		this.yPosition=this.yPosition+velocity*(int)Math.sin(getDir());
	}
	}
