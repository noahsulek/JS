public class Child extends Parent {

   private int y;
   
   public Child(int yVal){
       // super();
       y = yVal;
   }

   public Child(int xVal ,int yVal)   
   {
        // super();
        setX(xVal);
        y = yVal;
   }

   public String toString( ){
      return super.toString()  + 
                    ", y = " + y; 
   }  
}
