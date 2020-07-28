package music;
import animal.Playable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class MusicPlayer implements Playable {
        List<String> mediaFiles;
        Integer currentMediaFileIndex;
        String playerState;

        public MusicPlayer(String[] args){
            mediaFiles = new ArrayList<>(Arrays.asList(args));
            currentMediaFileIndex = 0;
            playerState = "STOPPED";
        }

        @Override
        public void play(){
            playerState = "PLAYING";
            System.out.println("PLAYING " + mediaFiles.get(currentMediaFileIndex));
            System.out.println("PLAYING " + mediaFiles.get(currentMediaFileIndex));
            System.out.println(mediaFiles.get(currentMediaFileIndex)+" It is a jazz music and not coountry ");
            currentMediaFileIndex++;
            System.out.println(mediaFiles.get(currentMediaFileIndex)+" It is a pop music");
            currentMediaFileIndex++;
            System.out.println(mediaFiles.get(currentMediaFileIndex)+" it is a classical");
        }


    }
