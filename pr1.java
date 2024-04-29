class SGGS {
    public static void main(String args[]) {
        System.out.println("Inside main");
        SGGS sggs1 = new SGGS();
        System.out.println("default constructor return: " + sggs1);
        System.out.println("class toString() return: " + sggs1.mytoString());
    }

    public String mytoString() {
        return "MytoString " + getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

     

