public class Treasure {
        private int value;
        private String title;

        /**
        * 
        * CONSTRUCTOR 
        */
     
      public Treasure(String title,int value)
       {
       this.value = value;
       this.title = title;
       }

       /**
        * 
        * OVERLOADED CONSTRUCTOR 
        */

       public Treasure(String title) 
       {
       this(title, 50);
       }
       
       /**
        * 
        * ACCESSORS
        */

       public int value() 
        {
       return this.value;
        }

        public String title() {
          return this.title;
        }
     
       
        /**
        * 
        * MUTATORS
        */

        public void value(int value)
       {
       this.value = value;
       }

       // UTILITIES 
       
       @Override
       public String toString() {
           return this.title + " (" + this.value + ")";
       }

     }

