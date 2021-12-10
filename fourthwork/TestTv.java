package sixth;

public class TestTv {

	public static void main(String[] args) {
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setchannel(30);
		tv1.setvolumelevel(3);
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelup();
		tv2.channelup();
		tv2.volumeup();
		System.out.println("The channel is "+tv1.channel+" and the volume level is "+tv1.volumeLevel);
		System.out.println("The channel is "+tv2.channel+" and the volume level is "+tv2.volumeLevel);
	}

}
