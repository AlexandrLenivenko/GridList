package com.lenivenko.aleksandr.gridlist;

public class SizeModel extends RowItem{
    private final String text;
    public SizeModel(int length, String text) {
        super(length);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
