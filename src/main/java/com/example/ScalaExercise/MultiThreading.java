package com.example.ScalaExercise;

public class MultiThreading implements  Runnable{


    String name;

   /* public MultiThreading(Integer[] mutex,String name) {
        this.mutex = mutex;
        this.name= name;
    }

    void print(int i){
        synchronized (mutex[i]){

        }
    }*/
    class PrintTask{

        Integer[] mutex;

        public PrintTask(int n) {
           for (int i=0;i<n;i++){
               mutex[i]=new Integer(0);
           }
        }


    }

    public  static  void main(String[] args){
/*
        MultiThreading multiThreading=new MultiThreading(new Integer[10],name);

        new Thread(() -> {
            multiThreading
        }).start();
*/

    }

    @Override
    public void run() {

    }
}
