class Demo {
  public static void main(String args[])
  {
      try{
        Thread.sleep(5000);
        
         throw new Exception("HEllo");
        }
       catch(Exception e)
       {
          System.out.println("Heloo" + e);
       }
  }
}
