package p01;

public class LanzadorBall implements Runnable {
	
	private Ball ball;
	private Board board;
	
	public LanzadorBall(Ball ball, Board board){
		this.ball= ball;
		this.board=board;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true){
				ball.move();
				ball.reflect();
				board.repaint();
				Thread.sleep(100);
				
			}
			
		} catch (InterruptedException e){
			e.printStackTrace();
		}

	}

}
