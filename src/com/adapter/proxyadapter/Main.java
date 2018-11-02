package com.adapter.proxyadapter;

import com.adapter.classadapter.Print;
import com.adapter.classadapter.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
