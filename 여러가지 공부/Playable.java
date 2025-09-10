package days18;

public interface Playable {
	void play();
	void stop();
}

class MusicPlayer implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("뮤직플레이어 플레이");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("뮤직플레이어 스탑");
		
	}
	
}

class VideoPlayer implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("비디오플레이어 플레이");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("비디오플레이어 스탑");
	}
	
}