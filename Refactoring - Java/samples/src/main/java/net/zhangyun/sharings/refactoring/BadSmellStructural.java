package net.zhangyun.sharings.refactoring;

public class BadSmellStructural {
    public static void main(String[] args) {
        /**
         * Switch statements
         */

        /*
        switch(type) {
            case TYPE_A: {} break;
            case TYPE_B: {} break;
            default: {} break;
        }
         */

        /**
         * Lazy classes
         */

        /*
        public class NoLongerUsed() {}
         */

        /**
         * Temporary field
         */

        /*
        public class Calculator {
            private int intermediateResult;
            public void calcA(int i) { intermediateResult = i; }
            public void calcB() { return intermediateResult * 2; }
        }
         */

        /**
         * Middle man
         */

        /*
        public class Product {}
        public class ProductWrapper {}
        public class Buyer {
            public void printName(ProductWrapper pw) {
                System.println(pw.getName())
            }
        }
         */

        /**
         * Incomplete library classes
         */

        /**
         * Refused bequest
         */

        /*
        public interface Base {
            public void funA();
            public void funB();
        }

        public class Con implements Base {
            public void funcA() {}
            //Don't make sense to: public void funB() {}
        }
         */
    }
}