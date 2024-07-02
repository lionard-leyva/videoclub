package com.cleancode.videclub;

import java.util.HashMap;
import java.util.Map;

public class VideoRegistry {

    public enum VideoType {REGULAR, CHILDRENS}

    private static Map<String, VideoType> videoRegistry = new HashMap<>();

    public static VideoType getType(String title) {
        return videoRegistry.get(title);
    }

    public static void addMovie(String title, VideoType type){
        videoRegistry.put(title,type);
    }
}
