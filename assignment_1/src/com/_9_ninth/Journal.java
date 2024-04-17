package com._9_ninth;

public class Journal extends Resource {
	
    private int issueNumber;

    public Journal(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public boolean search(String query) {
        return getTitle().toLowerCase().contains(query.toLowerCase()) ||
               Integer.toString(issueNumber).contains(query);
    }
}
