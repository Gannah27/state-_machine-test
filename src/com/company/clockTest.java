package com.company;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class clockTest {
    @Nested
    class EdgeCoverage {
        clock x;
        @BeforeEach
        public void setup() {
            x = new clock();
        }
        //suite = "aacbabababababad"
        @Test
        public void ec1() {
            String[] t = x.Calculate('a');
            System.out.println("Edge Coverage Testing");
            assertEquals("NORMAL", t[0]);
            assertEquals("DATE", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 0", t[3]);
        }

        @Test
        public void ec2() {
            x.Calculate('a');
            String[] t = x.Calculate('a');
            assertEquals("NORMAL", t[0]);
            assertEquals("TIME", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 0", t[3]);
        }

        @Test
        public void ec3() {
            x.Calculate('a');
            x.Calculate('a');
            String[] t = x.Calculate('c');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 0", t[3]);
        }

        @Test
        public void ec4() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 1", t[3]);
        }

        @Test
        public void ec5() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("hour", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 1", t[3]);
        }

        @Test
        public void ec6() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("hour", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec7() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("day", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec8() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("day", t[1]);
            assertEquals("2 / 1 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec9() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("month", t[1]);
            assertEquals("2 / 1 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec10() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("month", t[1]);
            assertEquals("2 / 2 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec11() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("year", t[1]);
            assertEquals("2 / 2 / 2000", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec12() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("year", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec13() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("NORMAL", t[0]);
            assertEquals("TIME", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec14() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('c');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec15() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('c');
            String[] t = x.Calculate('d');
            assertEquals("NORMAL", t[0]);
            assertEquals("TIME", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec16() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('d');
            String[] t = x.Calculate('b');
            assertEquals("ALARM", t[0]);
            assertEquals("Alarm", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec17() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('d');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("ALARM", t[0]);
            assertEquals("Chime", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

        @Test
        public void ec18() {
            x.Calculate('a');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('c');
            x.Calculate('d');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('d');
            assertEquals("NORMAL", t[0]);
            assertEquals("TIME", t[1]);
            assertEquals("2 / 2 / 2001", t[2]);
            assertEquals("1 : 1", t[3]);
        }

    }
    @Nested
    class ADUP{

        clock x;
        //suite = "cbbabbabbabbabb"
        @BeforeEach
        public void setup(){
            x = new clock();
        }

        @Test
        public void ADUPtest1(){
                String[] t = x.Calculate('c');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 0", t[3]);
        }

        @Test
        public void ADUPtest2(){
            x.Calculate('c');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 1", t[3]);
        }

        @Test
        public void ADUPtest3(){
            x.Calculate('c');
            x.Calculate('b');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("min", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 2", t[3]);
        }

        @Test
        public void ADUPtest4(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("hour", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("0 : 2", t[3]);
        }

        @Test
        public void ADUPtest5(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("hour", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("1 : 2", t[3]);
        }

        @Test
        public void ADUPtest6(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("hour", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest7(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("day", t[1]);
            assertEquals("1 / 1 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest8(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("day", t[1]);
            assertEquals("2 / 1 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest9(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("day", t[1]);
            assertEquals("3 / 1 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest10(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE", t[0]);
            assertEquals("month", t[1]);
            assertEquals("3 / 1 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest11(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("month", t[1]);
            assertEquals("3 / 2 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest12(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("month", t[1]);
            assertEquals("3 / 3 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest13(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            String[] t = x.Calculate('a');
            assertEquals("UPDATE",t[0]);
            assertEquals("year", t[1]);
            assertEquals("3 / 3 / 2000", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest14(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            String[] t = x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("year", t[1]);
            assertEquals("3 / 3 / 2001", t[2]);
            assertEquals("2 : 2", t[3]);
        }

        @Test
        public void ADUPtest15(){
            x.Calculate('c');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            x.Calculate('b');
            x.Calculate('a');
            x.Calculate('b');
            String[] t= x.Calculate('b');
            assertEquals("UPDATE", t[0]);
            assertEquals("year", t[1]);
            assertEquals("3 / 3 / 2002", t[2]);
            assertEquals("2 : 2", t[3]);
        }


    }
}