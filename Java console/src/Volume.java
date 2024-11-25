package bharath;

class Volume extends choose
{
	static int sound=50;
	public void Volumeup()
	{
		if(sound<=90)
		{
			sound= sound+10;
			System.out.println("volume increased 10 = "+sound);
		}
		else
			System.out.println("Maximum volume is 100");
	}
	public void Volumedown()
	{
		if(sound>=10)
		{
			sound-=10;
			System.out.println("volume decreased 10 = "+sound);			
		}
		else
			System.out.println("volume is 0 no sound");
	}
}