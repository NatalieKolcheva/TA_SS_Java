package org.lessons;

public enum Menu {
    ADD,
    REMOVE,
    SHOW,
    SORT,
    EXIT;

    //get menu position
    public static Menu get(int pos) {
        return Menu.values()[pos-1];
    }
}
