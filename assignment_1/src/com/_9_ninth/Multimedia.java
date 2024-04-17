package com._9_ninth;

public class Multimedia  extends Resource {
	
    private String format;

    public Multimedia(String title, String format) {
        super(title);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public boolean search(String query) {
        return getTitle().toLowerCase().contains(query.toLowerCase()) ||
               format.toLowerCase().contains(query.toLowerCase());
    }

}
