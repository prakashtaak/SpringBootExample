package com.example.ScalaExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class URLConnectionTest {
    static Random rnd = new Random();
    static HttpURLConnection conn;
    static URL url;




    public static void main(String[] args) {


        URLConnectionTest obj=new URLConnectionTest();
        try {
            url = new URL("http://admin:password@ilvmifmlin12:2347/eh/service/EventHandlerService");
            conn = (HttpURLConnection) url.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
                for (int i = 0; i < 12; i++) {
                   /* Thread t1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            obj.runTask();
                        }
                    });
                    t1.start();*/
                    runTask();
                }
            }catch (Exception ex){

            }
            finally {
                conn.disconnect();
            }

    }

    static  void runTask(){
        try{

            String soapXml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:eh=\"http://eh.actimize.com\">" +
                    "<soapenv:Header>" +
                    "</soapenv:Header>" +
                    "<soapenv:Body> " +
                    "<eh:FF_WS_evaluateDeposit_V7> " +
                    "<TRANSACTION_KEY>" + "tr154" + rnd.nextInt(1000) + "</TRANSACTION_KEY> " +
                    "<PARTY_KEY>pr_468" + rnd.nextInt(1000) + "</PARTY_KEY> " +
                    "<TRANSACTION_NORM_DATETIME>2015-01-01 09:39:15.627000</TRANSACTION_NORM_DATETIME> " +
                    "<CHANNEL>OFFLINE</CHANNEL> " +
                    "<ACCOUNT_KEY>87985</ACCOUNT_KEY> " +
                    "<TRANSACTION_TYPE>INCLEARING_ON_US_CHECK</TRANSACTION_TYPE> " +
                    "<FUNDS_DIRECTION_CD>O</FUNDS_DIRECTION_CD> " +
                    "<TRANSACTION_ID>tr_123</TRANSACTION_ID> " +
                    "<INSTRUMENT_NUMBER>897987</INSTRUMENT_NUMBER> " +
                    "<INSTRUMENT_TYPE_CD>ABA</INSTRUMENT_TYPE_CD> " +
                    "<INSTRUMENT_DATE>2015-01-01 09:39:15.627000</INSTRUMENT_DATE> " +
                    "<REQUESTED_AMOUNT_AS_ENTERED>7841</REQUESTED_AMOUNT_AS_ENTERED> " +
                    "<ACCOUNT_LEDGER_BALANCE>987489</ACCOUNT_LEDGER_BALANCE> " +
                    "<TRX_ACCOUNT_CURRENT_BALANCE>464</TRX_ACCOUNT_CURRENT_BALANCE> " +
                    "<TRX_ACC_NUMBER>4544</TRX_ACC_NUMBER> " +
                    "<TRX_FI_ROUTING_NUMBER>4454</TRX_FI_ROUTING_NUMBER> " +
                    "<TRX_FI_ROUTING_TYPE>56146</TRX_FI_ROUTING_TYPE> " +
                    "</eh:FF_WS_evaluateDeposit_V7> " +
                    "</soapenv:Body> " +
                    "</soapenv:Envelope>" +
                    "</soapenv:Body>" +
                    "</soapenv:Envelope>";

// Set the necessary header fields

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-type", "text/xml; charset=utf-8");
            conn.setRequestProperty("SOAPAction",
                    "http://admin:password@ilvmifmlin12:2347/eh/service/EventHandlerService#FF_WS_evaluateDeposit_V7");
// Send the request
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(soapXml);
            wr.flush();
// Read the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line); /*jEdit: print(line); */
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
