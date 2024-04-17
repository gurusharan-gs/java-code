package com._9_ninth;

public abstract class Resource implements Searchable  {
    private String title;
    private boolean isCheckedOut;

    public Resource(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }
    
    public void returnResource() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }
}
