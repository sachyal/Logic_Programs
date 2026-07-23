class Sir {
    public void study(String sn) {
        System.out.println("Study" + sn + "3 hours");
    }
}

class Rajat extends Sir {
    public void study(String sn) {
        System.out.println("Study " + sn + "2 hours");
    }
}

class Sachin extends Sir {
    public void study(String sn) {
        System.out.println("Study " + sn + "1 hours");
    }
}

class Dummy extends Sir {
    public void study(String sn) {
        System.out.println("Study " + sn + "5 hours");
    }
}

class IH1 {
    public static void main(String args[]) {
        /*
         * Rajat r = new Rajat();
         * r.study("java");
         * 
         * Sachin s = new Sachin();
         * s.study("java");
         * 
         * Dummy d = new Dummy();
         * d.study("java");
         */

        Sir s = new Sir();
        s = new Rajat();
        s.study("java");

        s = new Sachin();
        s.study("java");

        s = new Dummy();
        s.study("java");
    }

}
