package sixth;

public class TV {

	int channel=1;
	int volumeLevel=1;
	boolean on=false;
	public TV() {
	}
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	}
	public void setchannel(int newChannel) {
		if(on&&newChannel>=1&&newChannel<=120)
			channel=newChannel;
	}
	public void setvolumelevel(int newvolumeLevel) {
		if(on&&newvolumeLevel>=1&&newvolumeLevel<=7)
			volumeLevel=newvolumeLevel;
	}
	public void channelup() {
		if(on&&channel<120)
			channel++;
	}
	public void channeldown() {
		if(on&&channel>1)
			channel--;
	}
	public void volumeup() {
		if(on&&volumeLevel<7)
			volumeLevel++;
	}
	public void volumedown() {
		if(on&&volumeLevel>1)
			volumeLevel--;
	}
}