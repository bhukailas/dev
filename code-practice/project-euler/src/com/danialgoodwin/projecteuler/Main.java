package com.danialgoodwin.projecteuler;

import com.danialgoodwin.projecteuler.question.*;

public class Main {

    public static void main(String[] args) {
//        solveFirstTen();
        new Q11_LargestProductInAGrid().solve();
    }

    private void solveFirstTen() {
        new Q1_MultiplesOf3And5().solve();
        new Q2_EvenFibonacciNumbers().solve();
        new Q3_LargestPrimeFactor().solve();
        new Q4_LargestPalindromeProduct().solve();
        new Q5_SmallestMultiple().solve();
        new Q6_SumSquareDifference().solve();
        new Q7_10001stPrime().solve();
        new Q8_LargestProductInSeries().solve();
        new Q9_SpecialPythagoreanTriplet().solve();
        new Q10_SummationOfPrimes().solve();
    }

}
