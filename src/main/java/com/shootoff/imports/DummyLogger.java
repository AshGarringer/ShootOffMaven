package com.shootoff.imports;

public class DummyLogger {

    public boolean isErrorEnabled(){
        return false;
    }
    public boolean isDebugEnabled(){
        return false;
    }

    public void error(String message){
        // Do nothing
    }
    public void error(String message, Exception e){
        // Do nothing
    }
    public void error(String message, String message2){
        // Do nothing
    }
    public void warn(String message){
        // Do nothing
    }
    public void warn(String message, Object object){
        // Do nothing
    }
    public void warn(String message, Object object, Object object2){
        // Do nothing
    }
    public void debug(String message){
        // Do nothing
    }
    public void debug(String message,Object object, Object object2,Object object3){
        // Do nothing
    }
    public void debug(String message,Object object, Object object2){
        // Do nothing
    }
    public void info(String message){
        // Do nothing
    }
}
