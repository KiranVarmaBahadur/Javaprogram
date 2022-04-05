package com.javaanagram;


import org.junit.Test;

import static com.javaanagram.AnagramProgram.Anagramprog;

public class AnagramProgramTest {

    @Test
    public void testAnagramprog() {

        Anagramprog("Restful", "Fluster");
        Anagramprog("Room", "Dorm");
        Anagramprog("Dormitory", "Dirty Room");
        Anagramprog("Evil!", "Vile");

    }
}