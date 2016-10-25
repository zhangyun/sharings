package net.zhangyun.sharings.refactoring;

public class BadSmellCoupling {
    public static void main(String[] args) {
        /**
         * Divergent Change
         */

        /*
        public class CentralClass {
            public void neededByClassA() {}
            public void neededByClassB() {}
            public void neededByClassAAndB() {}
            ...
        }
         */

        /**
         * Shotgun Surgery
         */

        /*
        public class DistributedA {
            public void neededByZ() {}
        }
        public class DistributedB {
            public void neededByZ() {}
        }
        public class DistributedC {
            public void neededByZ() {}
        }
         */

        /**
         * Feature envy
         */

        /*
        public class A {
            public void accessBFunA() {}
            public void accessBFunB() {}
            public void accessBFunC() {}
            //Nothing else
        }

        public class B {}
         */

        /**
         * Data clumps
         */

        /*
        userName, password => LoginPrinciple
         */

        /**
         * Parallel inheritance hierarchies
         */

        /*
        Consider Abstract Factory
         */

        /**
         * Message chains
         */

        /*
        one.getA().getB().getC().doSomething();
         */

        /**
         * Inappropriate intimacy
         */

        /*
        a.getB().getBField() do some calculation.
        b.getA().getAField() do some calculation.
         */
    }
}