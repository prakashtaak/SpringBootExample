package com.example.ScalaExercise;


import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebserviceCaller {
    //Logger logger = LoggerFactory.getLogger(WebserviceCaller.class);

    private Properties properties;
    private BlockingDeque boundedBlockingQueue;

    private Object serviceObject;
    private Method meth = null;
    private Object webServiceClass = null;


    public WebserviceCaller(Properties properties) {
        this.properties = properties;

    }


    public WebserviceCaller() {


    }


    void initClient() {
        Class<?> serviceClass = null;
        try {

            System.setProperty("http.maxConnections","240");

            serviceClass = getClass().getClassLoader().loadClass("com.generated.stubs.EventHandlerService");

            serviceObject = serviceClass.newInstance();

            meth = serviceObject.getClass().getMethod("getEventHandlerServiceHttpPort");


            webServiceClass = meth.invoke(serviceObject);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    void testReflection() {
        try {


            Class<?> clzz = getClass().getClassLoader().loadClass("com.generated.stubs.EventHandlerService");
            Object obj = clzz.newInstance();
            Method meth = obj.getClass().getMethod("getEventHandlerServiceHttpPort");
            Object res = meth.invoke(obj);
            for (Method mt : res.getClass().getInterfaces()[0].getDeclaredMethods()) {
                for (Annotation ann : mt.getAnnotations()) {
                    if (ann.annotationType().equals(javax.jws.WebMethod.class)) {


                        Class<? extends Annotation> type = ann.annotationType();

                        for (Method annotmethod : type.getDeclaredMethods()) {
                            if (annotmethod.getName().equals("operationName")) {
                                if (annotmethod.invoke(ann, (Object[]) null).equals("FF_WS_evaluateDeposit_V7")) {

                                    System.out.println(mt);
                                    break;
                                }
                            }

                        }

                    }
                }


            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args)  {

        File propFile = new File("config//loadTestingConfig.properties");

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(propFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebserviceCaller webserviceCaller=new WebserviceCaller(prop);
        long stT= System.currentTimeMillis();

        webserviceCaller.testWebservice();


       /* OMFactory fac = OMAbstractFactory.getOMFactory();
        ServiceClient sender = null;
        try {
            Options options = new Options();
            options.setTo(targetEPR);
            options.setProperty(HTTPConstants.CHUNKED, Boolean.TRUE);
            options.setProperty(HTTPConstants.SO_TIMEOUT, TIMEOUT);
            options.setProperty(HTTPConstants.CONNECTION_TIMEOUT, TIMEOUT);
            options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT,
                    Boolean.TRUE);
            options.setProperty(HTTPConstants.AUTO_RELEASE_CONNECTION,
                    Boolean.TRUE);
            ServiceClient client =new ServiceClient(configurationContext,httpClient);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }*/
      /*  File propFile = new File("config//loadTestingConfig.properties");

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(propFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebserviceCaller webserviceCaller=new WebserviceCaller();
        long stT= System.currentTimeMillis();
        webserviceCaller.init();

        System.out.println("Time to init "+(System.currentTimeMillis()-stT));
        webserviceCaller.callWebservice(null, "");*/

        /*for(int i=0;i<50;i++) {
            Thread tr=new Thread(new Runnable(){

                @Override
                public void run() {
                    webserviceCaller.callWebservice(null, "");
                }
            });
            tr.start();


        }*/

        //EventHandlerService eventHandlerService = new EventHandlerService();
        //EHProxy proxy = eventHandlerService.getEventHandlerServiceHttpPort();

       /* proxyInstanceCache.getServiceMethod().invoke(proxyInstanceCache.getProxyObject(), new Object[]{
                "tr12123",
                "pr121001",
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
                "87486", null
        });*/
        System.out.println("asd" + Thread.currentThread().getName());


    }



    public static String[] getNewArray(String[] oldArray) {

        String[] updatedParams = new String[oldArray.length + 1];
        //Utils.copyElementsToSecondArray(oldArray, updatedParams);
        updatedParams[oldArray.length] = null;
        return updatedParams;
    }

     /*static class FFWSEvaluateDepositCallBackHandler implements AsyncHandler<FFWSEvaluateDepositV7Response> {
        private FFWSEvaluateDepositV7Response output;

        public void handleResponse(Response<FFWSEvaluateDepositV7Response> response) {

          *//*  while (!response.isDone()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*//*


        }

        FFWSEvaluateDepositV7Response getResponse() {
            return output;
        }
    }*/

    public void testWebservice() {
        ExecutorService es1 = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 50; i++) {
            es1.execute(new Runnable() {
                @Override
                public void run() {

                    long st3 = System.currentTimeMillis();
                    Method method = null;
                    try {
                        method = getServiceMethodByReflection(webServiceClass.getClass().getInterfaces()[0]);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }


                    long st4 = System.currentTimeMillis();
           /*Object result=method.invoke(webServiceClass,new Object[]{
                    "tr12123",
                    "pr121001",
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
                    "87486"
            });*/

                    try {
                        BindingProvider prov = (BindingProvider) webServiceClass;
                        Map<String, Object> reqCtx = prov.getRequestContext();

                        // API credentials
                        reqCtx.put(BindingProvider.USERNAME_PROPERTY, "admin");
                        reqCtx.put(BindingProvider.PASSWORD_PROPERTY, "password");
                        Object result = method.invoke(webServiceClass, new Object[]{
                                "tr12123",
                                "2015-01-01 09:39:15.627000",
                                "pr121001",
                                "11.21.25.12",
                                "4454",
                                "O",
                                "WEB_LOGIN",
                                "23423",
                                "2015-01-01 09:39:15.627000",
                                "5456",
                                "9646",
                                "5464",
                                "5468",
                                "8676",
                                "6966",
                                "9646",
                                "5464",
                                "5468"
                        });
                        Response<Object> resObject = (Response<Object>) result;
                        if (resObject.isDone()) {
                            resObject.get();
                        }
                        System.out.println("Time to get service by reflection " + (System.currentTimeMillis() - st3));
                        //handleResponseAsync(result);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });


            //Thread.sleep(500);
            //System.out.println("Time to call service by reflection "+(System.currentTimeMillis()-st4));
        }
        //System.out.println(method);

    }




    public void callWebservice(Object[] params) {



        Method method = null;
        try {






          /*  Method meth=serviceObject.getClass().getMethod("getEventHandlerServiceHttpPort");
            Object res=  meth.invoke(serviceObject);*/


            method = getServiceMethodByReflection(webServiceClass.getClass().getInterfaces()[0]);
            Object result = method.invoke(webServiceClass, params);

           /*Response<Object> resObject = (Response<Object>) result;
            if (resObject.isDone()) {
                resObject.get();
            }*/
           // System.out.println("Time to call service by reflection " + (System.currentTimeMillis() - st3));
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    /*private void handleResponseAsync(Object result) {
        es.execute(new Runnable(){

            @Override
            public void run() {
                Response < Object > resObject = (Response<Object>) result;
                while(!resObject.isDone()){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    resObject.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });
    }*/




        /*for (Method method : eventHandlerService.getClass().getDeclaredMethods()) {


            for (Annotation ann : method.getAnnotations()) {

                if (ann.annotationType().equals(javax.jws.WebMethod.class)) {


                    Class<? extends Annotation> type = ann.annotationType();

                    for (Method annotmethod : type.getDeclaredMethods()) {
                        if (annotmethod.getName().equals("operationName")) {
                            if (annotmethod.invoke(ann, (Object[]) null).equals(serviceMethod)) {
                                method.getReturnType().getClass()
                                return method;
                            }
                        }

                    }

                }


            }
        }*/
        /*ProxyContext proxyContext = getProxyInstanceForCurrentThreadContext(Thread.currentThread().getName());

        if (proxyContext == null) {
            String serviceName = properties.getProperty("WebServiceName");
            logger.info("Cannot find service method :" + serviceName);
        }

        if (proxyContext != null) {

            try {


                String[] updatedParams = new String[params.length + 1];
                Utils.copyElementsToSecondArray(params, updatedParams);
                updatedParams[params.length] = null;


                proxyContext.getServiceMethod().invoke(proxyContext.getProxyObject(), updatedParams);
                        *//*proxyContext.getServiceMethod().invoke(proxyContext.getProxyObject(), new Object[]{
                                "tr12123",
                                "pr121001",
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
                                "87486",null
                        });*//*
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }*/


    private Method getServiceMethodByReflection(Class proxyClazz) throws InvocationTargetException, IllegalAccessException {


        String serviceMethod = properties.getProperty("serviceMethodName");
        for (Method method : proxyClazz.getDeclaredMethods()) {


            for (Annotation ann : method.getAnnotations()) {

                if (ann.annotationType().equals(javax.jws.WebMethod.class)) {


                    Class<? extends Annotation> type = ann.annotationType();

                    for (Method annotmethod : type.getDeclaredMethods()) {
                        if (annotmethod.getName().equals("operationName")) {
                            if (annotmethod.invoke(ann, (Object[]) null).equals(serviceMethod)
                                   ) {

                                return method;
                            }
                        }

                    }

                }


            }
        }


        return null;

    }
}
