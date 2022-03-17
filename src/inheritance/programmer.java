package inheritance;

	class programmer extends employee{
		int bonus=10000;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer p=new programmer();
		System.out.println("programmer sal = "+p.sal);
		System.out.println("bonus of programmer = "+p.bonus);


	}

}
