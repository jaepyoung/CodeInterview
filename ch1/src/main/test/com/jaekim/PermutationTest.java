package com.jaekim;

import com.jaekim.PermutationCheck;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jaepyoung on 6/16/2014.
 */
public class PermutationTest {
    @Test
    public void checkPermuationNull(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = null;
        String string2 = null;
        assertTrue(permutationCheck.isPermtation(string1, string2));

    }
    @Test
    public void checkPermuationSeconNull(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = "test";
        String string2 = null;
        assertFalse(permutationCheck.isPermtation(string1, string2));

    }
    @Test
    public void checkPermuationFirstNull(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = null;
        String string2 = "test2";
        assertFalse(permutationCheck.isPermtation(string1, string2));

    }

    @Test
    public void checkPermuationTwoDifferentlength(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = "test23";
        String string2 = "test2";
        assertFalse(permutationCheck.isPermtation(string1, string2));

    }
    @Test
    public void checkPermuationSamelength(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = "test3";
        String string2 = "test2";
        assertFalse(permutationCheck.isPermtation(string1, string2));

    }
    @Test
    public void checkPermuationIdentity(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = "test2";
        String string2 = "test2";
        assertTrue(permutationCheck.isPermtation(string1, string2));

    }

    @Test
    public void checkPermuationNormal(){
        PermutationCheck permutationCheck = new PermutationCheck();
        String string1 = "test2";
        String string2 = "2estt";
        assertTrue(permutationCheck.isPermtation(string1, string2));

    }
}
