package decorator02;

public class SignDecorator extends DisplayDecorator
{
	public SignDecorator(Display decoratedDisplay)
	{
		super(decoratedDisplay);
	}
	
	public void draw()
	{
		super.draw();
		drawSign();
	}
	
	public void drawSign()
	{
		System.out.println("신호 그리기");
	}
}
