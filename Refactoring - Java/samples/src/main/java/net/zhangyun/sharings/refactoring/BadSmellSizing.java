package net.zhangyun.sharings.refactoring;

public class BadSmellSizing {
    public static void main(String[] args) {
        /**
         * Duplicated codes
         */

        /*
        int res1 = 1 * 2;
        int res2 = 2 * 2;
        ...

        public void magnify(int i) { return i * 2; }
        magnify(1);
        magnify(2);
         */

        /**
         * Alternative classes with different interfaces
         */

        /*
        public class Identifier {
            public boolean isValid(String id) { similar algorithm with little difference }
        }

        public class ResourceId {
            public boolean checkValid(String id) { similar algorithm with little difference }
        }

        Extract utility class
        public class UniqueIdentifier {
            public boolean validate(String identifier, String charset) { ... } //invoked by others
        }
         */

        /**
         * Long method
         */

        /*
        public class ClientConnectionProcessor {
            public void doTheJob(Message incoming) {
                //Prepare incoming
                switch(incoming.type) {
                    case TYPE_A: {
                        super long
                    } break;
                    case TYPE_B:
                    case TYPE_C: {
                        //super long
                    } break;
                    case TYPE_D:
                    case TYPE_E: {
                        //super long
                    } break;
                    default: {} break;
                }
                //After effects... super long
            }
        }

        class TypeA {
            public TypeA(Message incoming) {}
            public void doTheJob() {}
        }
        ...
         */

        /**
         * Long parameter list
         */

        /*
        public boolean validate(String userName,
                                String password,
                                String telephone,
                                String address,
                                String company,
                                String company_phone,
                                String company_address,
                                String shipping_address,
                                String shipping_post_code,
                                String shipping_country,
                                ...
                                ) {}

        public boolean validate(User u, Company c, Shipping s) {}
         */

        /**
         * Large Class
         */

        /*
        public class Almighty {
            private field a ... z;
            protected void funA ... funcZ;
            public void interfaceA ... interfaceZ;
        }

        Systematic refactoring needed. (re-construct inheritance hierarchy, resolve long method etc.)
         */

        /**
         * Speculative generality
         */

        /*
        public class Future {
            public void neverUsedA() {}
            public void neverUsedB() {}
            public void neverUsedC() {}
        }

        public class MiddleLayerA ... MiddleLayerZ {}

         */
    }
}