
class ppp {
	
	int a = 10;
	static int b = 20;
}

class thissuper extends ppp {
	void rr()
	{
		System.out.println(this.a);

		System.out.println(super.b);
	}

	public static void main(String[] args)
	{
		
		new thissuper().rr();
	}
}
