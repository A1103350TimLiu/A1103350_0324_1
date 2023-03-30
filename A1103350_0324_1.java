import java.util.*;

class Animal{
    String name;  
    double height;
    int weight;
    double speed;
    
    double distance(int x){  
        double d= x*this.speed;  
        return d;  
    }

    double distance(int x, double y){  
        double d= x*y*this.speed;  
        return d;  
    }

    void show(){
        System.out.println("姓名:" + this.name + ", 身高:" + this.height + "公尺, 體重:" + this.weight + "公斤, 速度:" + this.speed + "公尺/分鐘");
    }
  }

  public class A1103350_0324_1{
    public static void main(String []args){

      Animal[] animal = new Animal[4];
      animal[0] = new Animal();
      animal[0].name = "雪寶";
      animal[0].height = 1.1;
      animal[0].weight = 52;
      animal[0].speed = 100;

      animal[1] = new Animal();
      animal[1].name = "驢子";
      animal[1].height = 1.5;
      animal[1].weight = 99;
      animal[1].speed = 200;
      
      animal[2] = new Animal();
      animal[2].name = "安那";
      animal[2].height = 1.7;
      animal[2].weight = 48;
      animal[2].speed = 120;
      
      animal[3] = new Animal();
      animal[3].name = "愛沙";
      animal[3].height = 1.7;
      animal[3].weight = 50;
      animal[3].speed = 120;   

      for(int i = 0 ; i < animal.length ; i++){
        animal[i].show();
      }
      
      Scanner input = new Scanner(System.in);
      for(int n = 0 ; n < animal.length ; n++){
        int x;
        System.out.print("請輸入"+animal[n].name+"的時間");
        x = input.nextInt();
        input.nextLine();  
        String num;
        System.out.print("請輸入"+animal[n].name+"的加速度");
        num = input.nextLine();
        if(num == null || num.isBlank()){  
          System.out.println(animal[n].name+"的跑步距離:"+animal[n].distance(x));
        }else{
          double y = Double.parseDouble(num);
          System.out.println(animal[n].name+"的跑步距離:"+animal[n].distance(x, y));
        }
      }     
    }
  }