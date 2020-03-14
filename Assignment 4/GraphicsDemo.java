import java.awt.*;

class GraphicsDemo extends Frame{
	GraphicsDemo()
	{
		setSize(1000,1000);
		setVisible(true);
		setBackground(Color.GREEN);
	}
	public void paint(Graphics g){
		g.setColor(new Color(210,105,30));
		int x[]={100,200,300};
		int y[]={250,100,250};
		g.fillPolygon(x,y,3);
		g.setColor(Color.RED);
		g.fillRect(100,250,200,200);
		g.setColor(Color.WHITE);
		g.drawRect(150,300,102,60);

		g.drawLine(170,300,170,360);
		g.drawLine(190,300,190,360);
		g.drawLine(210,300,210,360);
		g.drawLine(230,300,230,360);
		
	}
	public static void main(String[] args) {
		new GraphicsDemo();
	}
}