package Challenge_80_LibraryItems_Inheritance;

public class DVD extends LibraryItems
{
	private int durationInSeconds;

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(int durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}
}
