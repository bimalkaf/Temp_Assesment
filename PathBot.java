
public class PathBot {
	public static void main(String[] args) {
		int posX=0,posY=0;
		
		for(String cmd : args) {
			char dir = cmd.charAt(0);
			int noOfMove = Integer.parseInt(cmd.substring(2));
			posX = moveX(posX,dir,noOfMove);
		}
		if(posX>0) {
			System.out.println("East "+ "("+posX+","+posY+")");
		}else if(posX<0) {
			System.out.println("West "+ "("+posX+","+posY+")");
		}else {
			System.out.println("Initial "+ "("+posX+","+posY+")");
		}
	}
	
	 static int moveX(int posX, char dir,int noOfMove) {
			if(dir=='R') {
				posX = posX+noOfMove;
			}
			if(dir=='L') {
				posX = posX - noOfMove;
			}
		return posX;
	}
}







