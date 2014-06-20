package com.jaekim;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jaepyoung on 6/19/2014.
 */
public class CompressStringTest {

    @Test
    public void compressNullString(){
        CompressString cString = new CompressString();
        Assert.assertEquals(null,cString.compressString(null));
    }

    @Test
    public void compressSpaceString(){
        CompressString cString = new CompressString();
        Assert.assertEquals(null,cString.compressString(""));
    }
    @Test
    public void compressOneString(){
        CompressString cString = new CompressString();
        Assert.assertEquals("a",cString.compressString("a"));

    }

    @Test
    public void compressTwoStringSame(){
        CompressString cString = new CompressString();
        Assert.assertEquals("a2",cString.compressString("aa"));
    }

    @Test
    public void compressTwoStringDifferent(){
        CompressString cString = new CompressString();
        Assert.assertEquals("ab",cString.compressString("ab"));
    }

    @Test
    public void compressTwoStringThreeDifference(){
        CompressString cString = new CompressString();
        Assert.assertEquals("abc",cString.compressString("abc"));
    }
    @Test
    public void compressTwoStringThreeSame(){
        CompressString cString = new CompressString();
        Assert.assertEquals("aab",cString.compressString("aab"));
    }
    @Test
    public void compressStringThreeAllSame(){
        CompressString cString = new CompressString();
        Assert.assertEquals("a3",cString.compressString("aaa"));
    }

    @Test
    public void compressStringFour(){
        CompressString cString = new CompressString();
        Assert.assertEquals("a1b3",cString.compressString("abbb"));
    }

    @Test
    public void compressStringFive(){
        CompressString cString = new CompressString();
        Assert.assertEquals("abcde",cString.compressString("abcde"));
    }


}
