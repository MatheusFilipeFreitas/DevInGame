package function;

public class MenusFunction {

    public void space(int number){
        while (number > 0){
            System.out.println(" ");
            number --;
        }
    }

    public void timer(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
