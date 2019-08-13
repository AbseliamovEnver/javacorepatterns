package com.abseliamov.javapatterns.creational.singleton;

public class ConnectionFactory implements Connection{
    private PoolConnection poolConnection;

    @Override
    public synchronized PoolConnection create() {
        if (this.poolConnection == null){
            poolConnection = new PoolConnection();
        }
        return poolConnection;
    }
}
