package wesessionlogin;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainCLient {
    long  totalRecords=5000000;
    int initCapacity=5000;

    public static  void main(String[] args){

        EventHandlerService eventHandlerService=new EventHandlerService();
        EHProxy proxy =eventHandlerService.getEventHandlerServiceHttpPort();
        Object result =proxy.ffWSEvaluateDepositV7(
                "tr123",
                "pr12311",
                "2015-01-01 09:39:15.627000",
                "OFFLINE",
                "acc_001",
                "INCLEARING_ON_US_CHECK",
                "O",
                "tr_2132",
                "23423",
                "12",
                "2015-01-01 09:39:15.627000",
                "5456",
                "9646",
                "5464",
                "5468",
                "8676",
                "6966",
                "878",
                "ABA",
                "2015-01-01 09:39:15.627000",
                "87486",null);
      /*  MainCLient obj=new MainCLient();
        obj.task();*/
    }

  public  Object[] getRecords(int i,int totalRecords) {
        System.out.println("Fetching next "+i+" records");

        for ( ;i <= totalRecords; i++) {
            Object[] values = {i, "asdasd", "sadsa"};
            return values;
        }
        return null;
    }
void task(){
    BlockingQueue queue =new LinkedBlockingQueue<Object[]>(500);


    Thread t1= new Thread(
        new Runnable(){



            @Override
            public void run() {

            long i=0;
            int   nextMaxRecords =initCapacity;
            while(true){

                    System.out.println("Fetching next "+nextMaxRecords+" records");
                    for ( ;i <= nextMaxRecords; i++) {
                        Object[] values = {i, "asdasd", "sadsa"};
                        if(Integer.parseInt(values[0].toString())==totalRecords) {
                            return;
                        }
                        try {
                            queue.put(values);
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }




            }
            }

            }
        );
    Thread t2= new Thread(
            new Runnable(){

                @Override
                public void run() {
                    while (true) {

                        try {
                            Object[] msg =(Object[]) queue.take();
                            if(Integer.parseInt(msg[0].toString())==totalRecords){
                                return;

                            }
                            System.out.println("Item in msg :"+msg[0] );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                }
            );

    t1.start();
    t2.start();

    }




}
