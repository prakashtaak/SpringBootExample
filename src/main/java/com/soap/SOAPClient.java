package com.soap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SOAPClient {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //EventHandlerService service = new EventHandlerService();
        //EHProxy hello = service.getEventHandlerServiceHttpPort();
        //  hello.ffWSEvaluateDepositV7();
        Class foo = Class.forName("wesessionlogin.EventHandlerService");

        Method method =foo.getMethod("getEventHandlerServiceHttpPort");
        //Class<?> returnTypeclass = method.getReturnType();
        Object obj=foo.newInstance();
        Class returnTypeclass =(Class<?>) method.invoke(obj);
       Method serviceMethod = returnTypeclass.getMethod("ffWSEvaluateDepositV7",new Class[]{});


        /*returnTypeclass.getDeclaredMethod("ffWSEvaluateDepositV7",
                new Class[]{
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class,
                        String.class

                }
                );*/


        /*for(Method md:returnTypeclass.getDeclaredMethods()) {
            if(md.toString().contains("ffWSEvaluateDepositV7")){
               md.invoke(obj,new Object[]{
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",
                       "daasd",null
                });
               break;
            }*/



        //Method serviceMethod =returnTypeclass.getMethod("ffWSEvaluateDepositV7");

    }

    private void tt() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException{
        Class foo  = getClass().getClassLoader().loadClass("com.soap.Foo");
        foo.getDeclaredAnnotations();
        Object obj = foo.newInstance();
        Method method = foo.getMethod("display");
        method.invoke(obj);
    }

}
class Foo{
    public void display(){
        System.out.println("Tkhds sadjosa ");
    }

}