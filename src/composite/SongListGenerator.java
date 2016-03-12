package composite;

public class SongListGenerator{
	
	public static void main(String[] args){
		
		SongComponent industrialMusic = new SongGroup("Industrial","hello");
		
		SongComponent heavyMetalMusic = new SongGroup("	Heavy Metal","world");
		
		SongComponent dubStepMusic = new SongGroup("DubStep","again");		
		
		SongComponent everySong = new SongGroup("SongList", "Every Song Available");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Head Like a Hole","NiN",1990));
		industrialMusic.add(new Song("Headhunter","Front 242",1988));
				
		industrialMusic.add(dubStepMusic);
		
		dubStepMusic.add(new Song("Centipede","Knife Party",2011));
		dubStepMusic.add(new Song("Tetris","Doctor P",2011));
		
		everySong.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("War Pigs","Black Sabath",1970));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		crazyLarry.getSongList();

	}

}