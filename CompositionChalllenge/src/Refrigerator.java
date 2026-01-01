 class Refrigerator {
    private boolean hasWorkToDo;


     public void setHasWorkToDo(boolean hasWorkToDo) {
         this.hasWorkToDo = hasWorkToDo;
     }

     public void orderFood(){
        if (hasWorkToDo)
        {
            System.out.println("Order food now");
            hasWorkToDo=false;
    }
}}

 ///Coffee Maker class
 class CoffeeMaker {
     private boolean hasWorkToDo;



     public void setHasWorkToDo(boolean hasWorkToDo) {
         this.hasWorkToDo = hasWorkToDo;
     }

     protected void brewCoffee(){
         if (hasWorkToDo)
         {
             System.out.println("Brewimg Coffe");
             hasWorkToDo=false;

         }
     }
 }
 //DishWasher class
 class Dishwasher {
     private boolean hasWorkToDo;



     public boolean isHasWorkToDo() {
         return hasWorkToDo;
     }

     public void setHasWorkToDo(boolean hasWorkToDo) {
         this.hasWorkToDo = hasWorkToDo;
     }

     public void doDishes(){
         if (hasWorkToDo)
         {
             System.out.println("Please do the dishes");
             hasWorkToDo=false;
         }
     }

     }


