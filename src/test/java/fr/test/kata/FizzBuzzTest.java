package fr.test.kata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Diana on 15/07/2015.
 */
public class FizzBuzzTest {

    FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void should_identify_fizz() throws Exception {
        assertThat(fb.fizzBuzzNumber(3), is("fizz"));
    }

    @Test
    public void should_identify_buzz() throws Exception {
        assertThat(fb.fizzBuzzNumber(5), is("buzz"));
    }

    @Test
    public void should_identify_fizzbuzz() throws Exception {
        assertThat(fb.fizzBuzzNumber(15), is("fizzbuzz"));
    }

    @Test
    public void should_identify_number() throws Exception {
        assertThat(fb.fizzBuzzNumber(4), is("4"));
    }

    @Test
    public void should_identify_list() throws Exception {
        List<String> numbers = fb.fizzBuzz(100);
        assertThat(numbers.size(), is(100));
        assertArrayEquals(new String[]{"13", "14", "fizzbuzz", "16", "17", "fizz"}, numbers.subList(14, 20).toArray());
    }

    @Test
    public void should_identify_complex_list() throws Exception {
        List<String> numbers = fb.fizzBuzzComplex(100);
        assertThat(numbers.size(), is(100));
        assertArrayEquals(new String[]{"1fizz", "14", "fizzbuzz1buzz", "16", "17", "fizz"}, numbers.subList(14, 20).toArray());
        assertTrue(numbers.get(32).equals("fizzfizzfizz"));//the 33
        assertTrue(numbers.get(34).equals("buzzfizzbuzz"));
    }
}