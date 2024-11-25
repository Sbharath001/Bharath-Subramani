package bharath;

class Encapsulation
{
	private String password;
	public String getpassword()
	{
		return password;
	}
	public void setpassword()
	{
		String newpassword = " bharath@1234";
		password = new String(newpassword);
	}
}
class Username extends MusicPlayer
{
	protected void id()
	{
		final String User_id="Bharath S";
		Encapsulation encap = new Encapsulation();
		System.out.println("Login in = "+ User_id);
		encap.setpassword();
		System.out.println("password = "+encap.getpassword());
	}
}
