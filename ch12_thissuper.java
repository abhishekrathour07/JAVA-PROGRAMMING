
class ppp {
	
	int a = 10;
    int b = 20;
}

class ch12_thissuper extends ppp {
	void rr()
	{
		System.out.println(this.a);

		System.out.println(super.b);
	}

	public static void main(String[] args)
	{
		
		new ch12_thissuper().rr();
	}
}
