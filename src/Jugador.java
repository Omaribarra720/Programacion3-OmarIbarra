
public class Jugador {
	
	
		String color;
		int x,y,widht,height;

		
		public Jugador(int x, int y,int width,int height,String color ) {
			this.x = x;
			this.y= y;
			this.widht=width;
			this.height=height;
			this.color = color;
			
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		public int getWidht() {
			return widht;
		}


		public void setWidht(int widht) {
			this.widht = widht;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}
		
		
	


}
