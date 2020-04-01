class superclass 
{
	int a=999;
}
class subclass
{
	int b=1;
}
class innerclass
{
	public static void main(String[] args) 
	{
		superclass sup=new superclass();
		subclass sub=new subclass();
		int c=sup.a+sub.b;
		System.out.println(c);
	}
}
