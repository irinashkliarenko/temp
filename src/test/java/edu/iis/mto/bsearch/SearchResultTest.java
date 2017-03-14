package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;


public class SearchResultTest {

    @Test
    public void OneElementInSequenceIsFound() {
        int key = 6;
        int seq[] = {6};
        
        Assert.assertTrue((BinarySearch.search(key, seq)).isFound());
    }
    
    @Test
    public void OneElementInSequenceNotFound() {
        int key = 6;
        int seq[] = {7};
        
        Assert.assertFalse((BinarySearch.search(key, seq)).isFound());
    }
    
    @Test
    public void FirstElementsInSequence() {
        int key = 2;
        int seq[] = {2, 3, 4, 7};
        Assert.assertTrue(BinarySearch.search(key, seq).isFound());
        Assert.assertEquals(1, BinarySearch.search(key, seq).getPosition());
    }

}