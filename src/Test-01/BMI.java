import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入身高(m)");
        double height = sc.nextDouble();
        System.out.println("请输入体重(kg)");
        double weight = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("BMI=" + BMI);

        IsHealthyInterface isHealthyInterface = new IsHealthy();
        isHealthyInterface.isHealthy(BMI);
    }

    static class IsHealthy implements IsHealthyInterface {//这个方法重写用于判断BMI的健康与否
        @Override
        public void isHealthy(Double BMI) {
            if (BMI >= 30) {
                System.out.println("Fat!Debu!");
            } else if (BMI < 30 && BMI >= 25) {
                System.out.println("You are Fat!");
            } else if(BMI<25&&BMI>=20){
                System.out.println("You are Healthy!");
            }else {
                System.out.println("Too Thin");
            }
        }
    }
}
