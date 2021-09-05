//hello vijay
public class Book
{
	String author;
	int pages,price;
public static void main(String[] args)
{
	Book b1 = new Book();
	b1.author="abc";
	b1.pages=100;
	b1.price=30;

	Book b2 = new Book();
	b2.author="xyz";
	b2.pages=200;
	b2.price=50;
	
	b1.buy();
	b2.buy();
	b1.getbalace();
	Book.offer();
}
	public static void offer()
	{
	System.out.println("Hello");	
	}
	public void getbalace()
	{
		System.out.println("hi");
	}
	public void buy()
	{
		System.out.println(price);
		getbalace();
		offer();
	}
	
	
}
