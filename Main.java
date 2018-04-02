import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, category;
        Float attack, blood, res;
        Scanner src = new Scanner(System.in);
        ArrayList<Tos> tos=new ArrayList<Tos>();
        boolean x = true;
        while (x) { //輸出功能表
            System.out.println("----------功能表----------");
            System.out.println("增加資料請按1");
            System.out.println("查詢資料請按2");
            System.out.println("修改資料請按3");
            System.out.println("移除資料請按4");
            System.out.println("顯示資料請按5");
            System.out.println("結束請按6");
            int s = src.nextInt();
            int www=0;
            switch (s) {
                case 1:
                    for (int i = 0; i < 5; i++) { //輸入迴圈
                        System.out.println("輸入角色名字");
                        name=src.next();
                        System.out.println("輸入屬性");
                        category=src.next();
                        System.out.println("輸入攻擊力");
                        attack=src.nextFloat();
                        System.out.println("輸入血量");
                        blood=src.nextFloat();
                        System.out.println("輸入回復力");
                        res=src.nextFloat();
                        tos.add(new Tos(name,category,attack,blood,res));
                        break;
                        }
                    System.out.println("已將資料全數輸入完畢");
                    break;
                case 2:
                    System.out.println("請問要搜索哪隻呢?" + "\n" + "請輸入角色名字或是屬性");
                   name = src.next();
                    for (int i = 0; i <tos.size(); i++) {
                        Tos tos1 = tos.get(i);
                        if (tos1.getName().equals(name)||tos1.getCategory().equals(name)) {
                            tos1.showAll();
                        }else {
                            System.out.println("查無資料");
                        }
                    }
                    break;
                 case 3:
                     System.out.println("請輸入欲修改之角色");
                     name=src.next();
                     for (int i=0;i<tos.size();i++) {
                         Tos tos1 = tos.get(i);
                         if (tos1.getName().equals(name)) {
                             tos1.showAll();
                             www = i;
                             i = tos.size();
                         }
                     }
                     System.out.println("輸入角色名字");
                     name=src.next();
                     System.out.println("輸入屬性");
                     category=src.next();
                     System.out.println("輸入攻擊力");
                     attack=src.nextFloat();
                     System.out.println("輸入血量");
                     blood=src.nextFloat();
                     System.out.println("輸入回復力");
                     res=src.nextFloat();
                     tos.set(www,new Tos(name,category,attack,blood,res));
                     break;
                case 4:
                    System.out.println("請輸入欲刪除之角色");
                    name=src.next();
                    for (int i=0;i<tos.size();i++) {
                        Tos tos1 = tos.get(i);
                        if (tos1.getName().equals(name)) {
                            System.out.println("原資料為");
                        tos1.showAll();
                        www=i;
                        i=tos.size();
                        }
                    }
                    tos.remove(www);
                    System.out.println("已成功將資料刪除");
                case 5:
                    for (int i=0;i<tos.size();i++){
                        Tos tos1=tos.get(i);
                        tos1.showAll();
                    }
                    break;
                case 6:
                    x = false;
                    System.out.println("感謝您本次使用 歡迎下次使用");
            }
        }
    }
}