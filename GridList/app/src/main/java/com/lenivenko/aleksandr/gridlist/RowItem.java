package com.lenivenko.aleksandr.gridlist;

abstract class RowItem {
    private final int length;

    public RowItem(int length) {
        this.length = length;
    }


    public int getLength() {
        return length;
    }
}
