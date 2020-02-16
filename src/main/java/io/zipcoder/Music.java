package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        Integer forward = 0;
        Integer backwards = 0;

        for(int x = startIndex; !playList[x].equals(selection); x--){
            if(x == 0){
                x = playList.length;
            }
            backwards ++;
        }

        for(int x = startIndex; !playList[x].equals(selection); x++){
            if(x == playList.length){
                x = 0;
            }
            forward ++;
        }
        if(forward < backwards){
            return forward;
        }else if(backwards < forward){
            return backwards;
        }else{
            return backwards;
        }
    }
}
