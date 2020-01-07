package learn;

public class inheritance {
int y;
	
	public inheritance()
{
	System.out.println("in 1");
	
}
public inheritance(int k)
{
	System.out.println("in 2 int");
	
}

public void add()
{
	System.out.println(1+10);
}
public void mul()
{
	System.out.println(2*3);
}
}

////////////
 class inheritanc extends inheritance {
	 
	 int k1;
public inheritanc()
{
	System.out.println("in 1 2nd");
	
}
public inheritanc(int k)
{
	System.out.println("in 2 int 2nd");
	
	
}

public void sub()
{
	System.out.println(10-1);
}

public void mul()
{
	System.out.println(2*2);
}
}
