/**
 * Created by Danial on 4/25/2015.
 */
package com.danialgoodwin.projecteuler.question;

import java.math.BigInteger;
import java.util.*;

/** Consider all integer combinations of ab for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:

 22=4, 23=8, 24=16, 25=32
 32=9, 33=27, 34=81, 35=243
 42=16, 43=64, 44=256, 45=1024
 52=25, 53=125, 54=625, 55=3125
 If they are then placed in numerical order, with any repeats removed, we get the following sequence of 15 distinct terms:

 4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125

 How many distinct terms are in the sequence generated by ab for 2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?
 *
 * Website: https://projecteuler.net/problem=29
 */
public class Q29_DistinctPowers extends Question {

    @Override
    protected String getQuestionName() {
        return "Q29_DistinctPowers";
    }

    @Override
    public void solve() {
        int minA = 2;
        int maxA = 100;
        int minB = 2;
        int maxB = 100;
        int answer = countDistinctPrimes(minA, maxA, minB, maxB);
        log("answer=" + answer);
    }

    // Idea 1: Brute-force, calculate all powers, put in a Set, get size of Set.
    // Idea 2: Know that 2 pow 8 is same as 4 pow 4 is same as 8 pow 2, and count other repeats and remove. A basic counting method for this could get complicated with repeats.
    // Idea 3: Translate all values of `a` to the prime factors, then create a list of just the powers for each of the prime factor groups.
    private static int countDistinctPrimes(int minA, int maxA, int minB, int maxB) {
        return countDistinctPrimesViaBruteForce(minA, maxA, minB, maxB);
//        return countDistinctPrimesViaPrimeFactor(minA, maxA, minB, maxB);
    }

    // Space: O(n * m), time: O(n * m)
    private static int countDistinctPrimesViaBruteForce(int minA, int maxA, int minB, int maxB) {
        Set<BigInteger> powers = new HashSet<>();
        for (int a = minA; a <= maxA; a++) {
            for (int b = minB; b <= maxB; b++) {
                powers.add(new BigInteger("" + a).pow(b));
            }
        }
        return powers.size();
    }

//    private static int countDistinctPrimesViaPrimeFactor(int minA, int maxA, int minB, int maxB) {
//        Map<DistinctPowerBase, List<Integer>> powers = new HashMap<>();
//        for (int i = minA; i <= maxA; i++) {
//            DistinctPowerBase distinctPowerBase = new DistinctPowerBase(i);
//            // if is different
//            powers.put();
//        }
//        return count;
//    }
//
//    private static class DistinctPowerBase {
//        final int distinctBase;
//        final int realValue;
//        DistinctPowerBase(int value) {
//            List<Integer> primeFactors = primeFactors(value);
//            distinctBase = ;
//            realValue = v;
//        }
//    }

}
