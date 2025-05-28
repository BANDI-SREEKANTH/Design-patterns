package com.designpatterns.creational.singleton;

public class BillPughSolution
{
    private BillPughSolution() {}
    
    private static class SingletonHelper {
        private static final BillPughSolution INSTANCE = new BillPughSolution();
    }
    
    public static BillPughSolution getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

