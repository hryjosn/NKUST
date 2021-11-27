class UnHash{

    public static void main (String[] args) {
        System.out.println(revHash(574318821802L));
        System.out.println(hash("ilovecoding:)"));
    }

    public static String letters = "cdef:ghijlmnoqstu)vxz";

    public static String revHash(long hash) {
        if (hash == 7) return ""; // if given length, the last digit '7' can be discarded directly here.
        String ret = revHash(hash / 23) + letters.charAt((int)(hash % 23));
        return ret;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}