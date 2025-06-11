public class EvenNumber {

    public EvenNumber() {
        System.out.println("Even Numbers from 1 to 100 ");
    }

     public void printEvenNumber(){
        for(int i=1;i<=100;i++){
            if(i%2==0 && i%10 !=0){
                System.out.print(i + " ");
            }
        }
         System.out.println("\n");
     }

}
