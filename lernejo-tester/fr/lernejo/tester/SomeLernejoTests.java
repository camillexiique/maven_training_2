package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

import java.lang.IllegalStateException;

public class SomeLernejoTests {

    @TestMethod
    public void ok(){

    }

    public void ko(){
        new java.lang.IllegalStateException();
    }

    @TestMethod
    public void none(){

    }
}
