//package com.cunyu.ServiceMonday.Config;
//
//import org.apache.rocketmq.client.exception.MQBrokerException;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.remoting.common.RemotingHelper;
//import org.apache.rocketmq.remoting.exception.RemotingException;
//
//import java.io.UnsupportedEncodingException;
//
//public class Producer {
//    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, MQBrokerException, RemotingException, InterruptedException {
//        //1:
//        String groupName = "test-demo";
//        DefaultMQProducer defaultMQProducer = new DefaultMQProducer(groupName);
//        String namesrvAddr = "192.168.1.8:9876";
//        defaultMQProducer.setNamesrvAddr(namesrvAddr);
//        defaultMQProducer.start();
//        Message message = new Message("Topic_Demo",
//                "tags",
//                "Keys_1",
//                "hello!".getBytes(RemotingHelper.DEFAULT_CHARSET)
//                );
//        SendResult result = defaultMQProducer.send(message);
//        System.out.println(result);
//
//
//    }
//}
